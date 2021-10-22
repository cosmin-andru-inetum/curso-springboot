package com.code.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
