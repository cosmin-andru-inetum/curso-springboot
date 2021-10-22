package com.domain.model;

public class Alumno implements Model, Vaciable{

	private int codigo;
	private String nombre;
	private String apellidos;
	private String estudios;
	private String linkArepositorio;
	
	public Alumno() {}
	
	public Alumno(int codigo, String nombre, String apellidos, String estudios, String linkArepositorio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estudios = estudios;
		this.linkArepositorio = linkArepositorio;
	}

	public boolean isEmpty() {
		return codigo == 0 
				&& (nombre == null || nombre.isEmpty())
				&& (apellidos == null || apellidos.isEmpty());
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getLinkArepositorio() {
		return linkArepositorio;
	}

	public void setLinkArepositorio(String linkArepositorio) {
		this.linkArepositorio = linkArepositorio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (codigo != other.codigo)
			return false;
		if (estudios == null) {
			if (other.estudios != null)
				return false;
		} else if (!estudios.equals(other.estudios))
			return false;
		if (linkArepositorio == null) {
			if (other.linkArepositorio != null)
				return false;
		} else if (!linkArepositorio.equals(other.linkArepositorio))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((estudios == null) ? 0 : estudios.hashCode());
		result = prime * result + ((linkArepositorio == null) ? 0 : linkArepositorio.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", estudios=" + estudios
				+ ", linkArepositorio=" + linkArepositorio + "]";
	}
}
