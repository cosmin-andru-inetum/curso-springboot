package com.code.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersona {

	public static Logger log = LoggerFactory.getLogger(PersonaRepoImpl1.class);

	@Override
	public void registrar(String pNombre) {
		log.info("se registro a: " + pNombre);
		
	}
}
