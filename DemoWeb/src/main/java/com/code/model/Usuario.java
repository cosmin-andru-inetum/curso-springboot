package com.code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEC_USUARIO", sequenceName = "SEC_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "SEC_USUARIO")
	private int codigo;
	
	@Column(name="nombre", length=255)
	private String nombre;
	
	@Column(name="clave", length=255)
	private String clave;

	public Usuario() {}
	
	public Usuario(String pNombre, String pClave) {
		nombre = pNombre;
		clave = pClave;
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}