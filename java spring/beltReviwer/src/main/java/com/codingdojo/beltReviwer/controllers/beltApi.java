package com.codingdojo.beltReviwer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.beltReviwer.models.State;
import com.codingdojo.beltReviwer.services.userServices;

@RestController
public class beltApi {
	private final userServices us;
	
public beltApi(userServices us) {
		this.us = us;
	}

@RequestMapping(value="/api/states", method=RequestMethod.POST)
public State create(@RequestParam(value="name") String name) {
    State x=new State();
    x.setName(name);
    return us.newstate(x);
}
}
