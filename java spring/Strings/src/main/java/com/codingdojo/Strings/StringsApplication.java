package com.codingdojo.Strings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StringsApplication {
@RequestMapping("/kekw")
public String helloz() {
	return "index.html";
}
}
