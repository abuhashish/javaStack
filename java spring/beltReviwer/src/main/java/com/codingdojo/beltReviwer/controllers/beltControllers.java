package com.codingdojo.beltReviwer.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.beltReviwer.models.Event;
import com.codingdojo.beltReviwer.models.Message;
import com.codingdojo.beltReviwer.models.State;
import com.codingdojo.beltReviwer.models.User;
import com.codingdojo.beltReviwer.models.newEvent;
import com.codingdojo.beltReviwer.services.userServices;




// imports removed for brevity
@Controller
public class beltControllers {
    private final userServices userService;
    
    public beltControllers(userServices userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user,Model model) {
    	List<State> x=userService.findAllstates();
    	model.addAttribute("x",x);
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	if(user.getPasswordConfirmation().equals(user.getPassword())) {
            userService.registerUser(user);
            session.setAttribute("user.id", user.getId());
           
            return "redirect:/home";
        	}
    	else
    		return "redirect:/registeration";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if(userService.authenticateUser(email, password)==true) {
    		User user=userService.findByEmail(email);
    		session.setAttribute("user.id", user.getId());
    		return "redirect:/home";
    		
    	}
    	else {
    		return "redirect:/login";
    	}
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
        // redirect to login page
    	session.removeAttribute("user.id");
    	return "redirect:/login";
    }
    @RequestMapping("/home")
    public String home(HttpSession session, Model model,@ModelAttribute("newEvent") newEvent newEvent ) {

    	Long userid=(Long) session.getAttribute("user.id");
    	User user=userService.findUserById(userid);
    	
    	List<Event> events=userService.findAll();
    	
    	model.addAttribute("events",events);
    	model.addAttribute(user);
    	List<State> x=userService.findAllstates();
    	model.addAttribute("x",x);
    	return "/homePage.jsp";
    }
    @RequestMapping("/newevent")
    public String createquestion(@Valid @ModelAttribute("newEvent") newEvent newEvent, BindingResult result) {
    	if (result.hasErrors()) {
            return "/homePage.jsp";
        }
    	else {
    		userService.createEvent(newEvent);
    		return "redirect:/home";
    	}
    }
    @RequestMapping("/delete/{id}")
    public String deleteEvent(@PathVariable("id") Long id) {
    	 userService.deleteById(id);
    	 return "redirect:/home";
    }
    @RequestMapping("/join/{id}")
    public String joinEvent(@PathVariable("id") Long id,HttpSession session) {
    	userService.joinevent(id, session);
    	return "redirect:/home";
    }
    @RequestMapping("/cancel/{id}")
    public String cancelEvent(@PathVariable("id") Long id,HttpSession session) {
    	userService.cancelevent(id, session);
    	return "redirect:/home";
    }
    @RequestMapping("/edit/{id}")
    public String editEvent(@PathVariable("id") Long id,Model model) {
    	Event x=userService.findeventbyid(id);
    	model.addAttribute("x",x);
    	List<State> y=userService.findAllstates();
    	model.addAttribute("y",y);
    	return "/edit.jsp";
    	
    }
    @RequestMapping(value="/editevents/{id}")
    public String update(@Valid @ModelAttribute("Event") Event Event, BindingResult result) {
        if (result.hasErrors()) {
            return "/edit.jsp";
        } else {
            userService.updateEvent(Event);
            return "redirect:/home";
        }
    }
    @RequestMapping(value="/events/{id}")
    public String messages(@PathVariable("id") Long id,Model model,@ModelAttribute("Message") Message Message,HttpSession session) {
    	Event x=userService.findeventbyid(id);
    	model.addAttribute("x",x);
    	Long userid=(Long) session.getAttribute("user.id");
    	System.out.println(userid);
    	model.addAttribute("user",userid);
    	return "/eventmsgs.jsp";
    }
    @RequestMapping("/newmessage")
    public String createmessage(@Valid @ModelAttribute("Message") Message Message, BindingResult result) {
    	if (result.hasErrors()) {
            return "/eventmsgs.jsp";
        }
    	else {
    		userService.createMessage(Message);
    		return "redirect:/events/"+Message.getEvent().getId();
    	}
    }
}