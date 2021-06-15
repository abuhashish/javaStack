package com.codingdojo.date;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class DateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date now = new Date( );
		SimpleDateFormat x = new SimpleDateFormat("hh:mm a");

		model.addAttribute("date",x.format(now));
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date now = new Date( );
		SimpleDateFormat x=new SimpleDateFormat("E,'the'd 'of' MMMM , yyyy");
		model.addAttribute("date",x.format(now));
		return "time.jsp";
	}

}
