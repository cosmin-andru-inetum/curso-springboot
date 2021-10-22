package com.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.code.service.IPersonaService;
import com.code.service.PersonaServiceImpl;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	public static Logger log = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("info");
		log.warn("warning");
		log.error("error");
		
//		service = new PersonaServiceImpl();
		service.registrarHandler("Cosmin");
	}

}
