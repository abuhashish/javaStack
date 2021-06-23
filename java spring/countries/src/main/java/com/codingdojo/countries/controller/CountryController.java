package com.codingdojo.countries.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {
@RequestMapping("/")
public String Hello() {
	return "hello.jsp";
}
}
