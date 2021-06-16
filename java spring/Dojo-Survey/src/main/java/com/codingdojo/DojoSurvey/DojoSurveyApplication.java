package com.codingdojo.DojoSurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@SpringBootApplication
public class DojoSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojoSurveyApplication.class, args);
	}
@RequestMapping("/")
public String welcome() {
	return "Survey.jsp";
}
@RequestMapping("/info")
public String info(@RequestParam(value="name")String username,@RequestParam(value="location")String location,@RequestParam(value="language")String language,@RequestParam(value="text")String comment,Model model) {
	model.addAttribute("username",username);
	model.addAttribute("language",language);
	model.addAttribute("location",location);
	model.addAttribute("comment",comment);
	return "info.jsp";

}
}