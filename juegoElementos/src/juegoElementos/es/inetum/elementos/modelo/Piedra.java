package juegoElementos.es.inetum.elementos.modelo;

public class Piedra extends ElementoFactory {

	public Piedra() {
		super("piedra", 0);
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
		case TIJERA:
			resultado = 1;
			descripcionResultado = "Piedra le gano a Tijera";
			break;
		case PAPEL:
			resultado = -1;
			descripcionResultado = "Papel le gano a Piedra";
			break;
		default:
			break;
		}
		
		return resultado;
	}

}
