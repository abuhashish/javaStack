package com.codingdojo.DojoOverFlow.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.DojoOverFlow.models.Answer;
import com.codingdojo.DojoOverFlow.models.Question;
import com.codingdojo.DojoOverFlow.models.newQuestion;
import com.codingdojo.DojoOverFlow.services.ofServices;

@Controller
public class OverflowController {
private final ofServices ofs;
public OverflowController(ofServices ofs) {
	this.ofs = ofs;
}

@RequestMapping("/questions")
public String dashboard(Model model) {
	List <Question> x= ofs.findallquestions();
	model.addAttribute("x",x);
	return "/ovf/dashobard.jsp";
}
@RequestMapping("/questions/new")
public String newquest(@ModelAttribute("newQuestion") newQuestion newQuestion) {
	return "/ovf/new.jsp";
}
@RequestMapping("/nquestions")
public String createquestion(@Valid @ModelAttribute("newQuestion") newQuestion newQuestion, BindingResult result) {
	if (result.hasErrors()) {
        return "/ovf/new.jsp";
    }
	else {
		ofs.createQuestion(newQuestion);
		return "redirect:/questions";
	}
}
@RequestMapping("/question/{id}")
public String questionans(@PathVariable("id") Long id,Model model,@ModelAttribute("Answer") Answer Answer) {
	Question quest=ofs.findbyid(id);
	if(quest != null) {
		model.addAttribute("quest",quest);
		return "/ovf/questans.jsp";
	}
	else {
		return "redirect:/questions";
	}
}
@RequestMapping("/nanswers")
public String createans(@Valid @ModelAttribute("Answer") Answer x,BindingResult result) {
	if (result.hasErrors()) {
        return "/ovf/questans.jsp";
    }
	else {
		ofs.createAnswer(x);
		return "redirect:/questions";
	}
}


}
