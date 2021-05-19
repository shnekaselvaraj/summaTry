package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.DAO.LifeDAO;
import com.example.model.Life;

@Controller
public class LifeController
{
	@Autowired
	LifeDAO lifeDAO;
	
	@RequestMapping("/")
	public String firstMethod() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String secondMethod(Model model) {
		
		model.addAttribute("command",new Life());
		return "login";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String thirdMethod(@RequestParam("name") String peru,Model mod,@ModelAttribute("life") Life life) {
		if(peru.equalsIgnoreCase("shneka")) {
			String s="valid name";
			mod.addAttribute("message",s);
			lifeDAO.save(life);
			return "greeting";
		}
		else {
			return "home";
		}

	}
	
	@RequestMapping("/view")
	public String display(@RequestParam("name") String peru,Model mod) {
		if(peru.equalsIgnoreCase("shneka")) {
			String s="valid name";
			mod.addAttribute("message",s);
			return "greeting";
		}
		else {
			return "home";
		}
	}
}
