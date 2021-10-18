package juegoElementos.es.inetum.elementos.modelo;

public class Tijera extends ElementoFactory {

	public Tijera() {
		super("tijera", 2);
	}

	@Override
	public boolean isMe(int pNum) {
		return numero == pNum;
	}

	@Override
	public int comparar(ElementoFactory pElemento) {
		int numero = pElemento.getNumero();
		int resultado = 0;
		switch (numero) {
		case PAPEL:
			resultado = 1;
			descripcionResultado = "Tijera le gano a papel";
			break;
		case PIEDRA:
			resultado = -1;
			descripcionResultado = "Piedra le gano a tijera";
			break;
		default:
			break;
		}
		
		return resultado;
	}

}
