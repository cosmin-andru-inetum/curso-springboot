package juegoElementos.es.inetum.elementos.modelo;

public class Papel extends ElementoFactory {

	public Papel() {
		super("papel", 1);
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
		case PIEDRA:
			resultado = 1;
			descripcionResultado = "Papel le gano a piedra";
			break;
		case TIJERA:
			resultado = -1;
			descripcionResultado = "Tijera le gano a papel";
			break;
		default:
			break;
		}
		
		return resultado;
	}

}
