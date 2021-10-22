package com.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.model.Persona;
import com.code.repo.IPersonaRepo;

@Controller
public class DemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/demo")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		if(name == null || name.isEmpty()) {
			name = "cosmin";
		} else if(name.endsWith("World")) {
			repo.delete(new Persona("Cosmin"));
			name = "cosmin";
		}
		
		Persona per = new Persona(name);
		repo.save(per);
		
		
		model.addAttribute("name", name);
		return "greeting";
	}
}
