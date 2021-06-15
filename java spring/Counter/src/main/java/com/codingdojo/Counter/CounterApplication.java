package com.codingdojo.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
@RequestMapping("/")
public String hello(HttpSession session) {
	
	if (session.getAttribute("count")==null)
		session.setAttribute("count", 1);
	else {
		Integer x=(Integer) session.getAttribute("count");
		x++;
		session.setAttribute("count", x);
	}
	return "welcome.jsp";
}
@RequestMapping("/counter")
public String counter() {
	return "counter.jsp";
}
}
