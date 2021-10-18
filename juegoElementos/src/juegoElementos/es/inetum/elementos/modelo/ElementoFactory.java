package juegoElementos.es.inetum.elementos.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoFactory {

	protected static final int PIEDRA = 0;
	protected static final int PAPEL = 1;
	protected static final int TIJERA = 2;
	
	protected String descripcionResultado;
	private static List<ElementoFactory> elementos;
	protected String nombre;
	protected int numero;
	
	public ElementoFactory(String pNombre, int pNumero) {
		nombre = pNombre;
		numero = pNumero;
		if(elementos == null) {
			elementos = new ArrayList<ElementoFactory>();
		}
		elementos.add(this);
	}

	public String getDescripcionResultado() {
		return descripcionResultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public abstract boolean isMe(int numero);
	public abstract int comparar(ElementoFactory elemento);
	
	public static ElementoFactory getInstance(int pNumero) {
		if(elementos == null) {
			elementos = new ArrayList<ElementoFactory>();
			return null;
		}
		for(ElementoFactory elemento: elementos) {
			if(elemento.isMe(pNumero)) {
				return elemento;
			}
		}
		
		return null;
	}
}
