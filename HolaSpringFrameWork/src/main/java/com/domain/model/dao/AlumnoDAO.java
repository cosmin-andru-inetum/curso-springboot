package com.domain.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.domain.model.Alumno;
import com.domain.model.Model;

import util.ConnectionManager;

public class AlumnoDAO implements DAO {

	private Connection conexion;

	public AlumnoDAO() throws Exception {
		ConnectionManager.conectar();
		conexion = ConnectionManager.getConexion();
	}

	public void agregar(Model model) throws SQLException {
		Alumno alumno = (Alumno) model;
		String sql = "insert into alumnos(alu_nombre, alu_apellido, alu_conocimientos, alu_git) "
				+ "values(?,?,?,?)";
		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setString(1, alumno.getNombre());
		ps.setString(2, alumno.getApellidos());
		ps.setString(3, alumno.getEstudios());
		ps.setString(4, alumno.getLinkArepositorio());
		
		
		ps.execute();
	}

	public void modificar(Model model) throws SQLException {
		Alumno alumno = (Alumno) model;
		String sql = "update alumnos set alu_nombre=?, alu_appelido=?, alu_conocimientos=?, alu_git=? where alu_id=?";
		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setString(1, alumno.getNombre());
		ps.setString(2, alumno.getApellidos());
		ps.setString(3, alumno.getEstudios());
		ps.setString(4, alumno.getLinkArepositorio());
		ps.setInt(5, alumno.getCodigo());
		
		ps.execute();
	}

	public void eliminar(Model model) throws SQLException {
		Alumno alumno = (Alumno) model;
		String sql = "delete from alumnos where alu_id=?";
		PreparedStatement ps = conexion.prepareStatement(sql);
		ps.setInt(1, alumno.getCodigo());
		
		ps.execute();
	}

	public List<Model> leer(Model model) {
		return null;
	}

}
