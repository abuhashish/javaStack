package com.codingdojo.NinjaGold;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class NinjaGoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}

	@RequestMapping("/Gold")
	public String gold() {
		
		return "Gold.jsp";
	}
	@RequestMapping(value="/process_money",method=RequestMethod.POST)
	public String money(HttpSession session,@RequestParam(value="gold")String x) {
		Integer y = 0;
		Random rand=new Random();
		if(session.getAttribute("gold")==null) {
			ArrayList<String> kk=new ArrayList<String>();
			session.setAttribute("gold", rand.nextInt(20));
			session.setAttribute("log",kk);
		}
		else {
			if(x.equals("farm")) {
				y=(Integer)session.getAttribute("gold");
				int gj = rand.nextInt(20-10) + 10;
				ArrayList<String> newarr=(ArrayList<String>) session.getAttribute("log");
				newarr.add("Congratulations you have won"+gj+"coins");
				y=y+gj;
				session.setAttribute("gold", y);
			}
			else if(x.equals("cave")) {
				y=(Integer)session.getAttribute("gold");
				int gj = rand.nextInt(10-5) + 5;
				ArrayList<String> newarr=(ArrayList<String>) session.getAttribute("log");
				newarr.add("Congratulations you have won"+gj+"coins");
				y=y+gj;
				session.setAttribute("gold", y);
			}
			else if(x.equals("house")) {
				y=(Integer)session.getAttribute("gold");
				int gj = rand.nextInt(5-2) + 2;
				ArrayList<String> newarr=(ArrayList<String>) session.getAttribute("log");
				newarr.add("Congratulations you have won"+gj+"coins");
				y=y+gj;
				session.setAttribute("gold", y);
			}
			else {
				int gj = rand.nextInt(50+50) -50;
				y=(Integer)session.getAttribute("gold");
				y=y+gj;
				session.setAttribute("gold", y);
				ArrayList<String> newarr=(ArrayList<String>) session.getAttribute("log");
				if (gj>0) {
					newarr.add("Congratulations you have won"+gj+"coins");
				}
				else {
					newarr.add("Ouch you have lost "+gj+"coins");
				}
			}
			
		}
		return "redirect:/Gold";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("log");
		session.removeAttribute("gold");
		return "redirect:/Gold";
	}
	
}
