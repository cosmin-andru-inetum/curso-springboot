package com.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.code.repository.IPersona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	@Qualifier("persona1")
	IPersona repo;

	@Override
	public void registrarHandler(String pNombre) {
		repo.registrar(pNombre);
		
	}
	
	
}
