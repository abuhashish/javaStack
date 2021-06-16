package com.codingdojo.bushido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@SpringBootApplication
public class BushidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BushidoApplication.class, args);
	}
@RequestMapping("/")
public String welcome() {
	return "welcome.jsp";
}
@RequestMapping("/correct")
public String correct() {
	return "correct.jsp";
}
@RequestMapping(value="/testcode", method=RequestMethod.POST)
public String test(@RequestParam(value="code") String code) {
	String x="bushido";
	if(x.equals(code)) {
		return "redirect:/correct";
	}
	else
		return "redirect:/createError";
	
}
@RequestMapping("/createError")
public String flashMessages(RedirectAttributes redirectAttributes) {
    redirectAttributes.addFlashAttribute("error", "A test error!");
    return "redirect:/";
}
}
