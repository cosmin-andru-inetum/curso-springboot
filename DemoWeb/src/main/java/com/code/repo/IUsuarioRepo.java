package com.code.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findByNombre(String username);
}
