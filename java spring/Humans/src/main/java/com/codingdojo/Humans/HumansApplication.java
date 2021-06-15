package com.codingdojo.Humans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class HumansApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumansApplication.class, args);
	}
	@RequestMapping("/")
	public String hellohuman() {
		return "hello human \n welcome to springboot";
	}
	@RequestMapping("/{name}")
	public String helloname(@PathVariable("name") String name) {
		return "hello"+name+"/n welcome to springboot";
	}
	@RequestMapping("/search/")
	public String search(@RequestParam("param") String param) {
		return "hello"+param+"welcome to springboot";
	}
}
