package com.domain.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.domain.model.Model;

public interface DAO {

	void agregar(Model model) throws SQLException ;
	
	void modificar(Model model) throws SQLException ;
	
	void eliminar(Model model) throws SQLException ;
	
	List<Model> leer(Model model) throws SQLException ;
}
