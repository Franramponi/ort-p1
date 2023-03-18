package ar.edu.ort.p1.unidades.u3.practico03.ej03_baraja_inglesa.src.cartas;

public class CartaJoker extends Carta {

	private boolean aColor;

	public CartaJoker(boolean aColor) {
		this.aColor = aColor;
	}

	@Override
	public String getRepresentacion() {
		return "Joker " + (aColor ? "a colores" : "blanco y negro");
	}

}