package com.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String goIndex() {
		return "Index";
	}
	
	@RequestMapping("/")
	public String goPresentacion() {
		return "Presentacion";
	}
	
	@RequestMapping("/listado")
	public String goListado(Model model) {
		List<String> alumnos = new ArrayList();
		alumnos.add("asdas");
		alumnos.add("asdasd");
		
		model.addAttribute("titulo", "Listado alumnos");
		model.addAttribute("profesor", "dasdas adasasd");
		model.addAttribute("alumnos", alumnos);
		return "Listado";
	}
}
