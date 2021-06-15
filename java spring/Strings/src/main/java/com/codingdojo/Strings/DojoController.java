package com.codingdojo.Strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
@RequestMapping("/dojo")
public String dojo() {
	return "the dojo is awesome!";
}
@RequestMapping("/burbank-dojo/")
public String dojo2() {
	return "Burbank dojo is located in southren cali ";
}
@RequestMapping("/san-jose/")
public String sanjose() {
	return "Sj dojo is the headquarters";
}
}
//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
//Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
//Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the h