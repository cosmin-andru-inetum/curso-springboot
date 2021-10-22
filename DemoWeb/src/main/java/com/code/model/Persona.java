package com.code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name="PER_NOMBRE", length=50)
	private String nombre;
	
	public Persona() {}

	public Persona(String pName) {
		nombre = pName;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
