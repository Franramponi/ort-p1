package ar.edu.ort.p1.unidades.u3.ejemplos._02_overriding.ejemplo02.src;

public class B extends A {

	int k;

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	/**
	 * Mostrar k - Esto oculta el metodo mostrar() en A
	 */
	void mostrar() {
		super.mostrar();
		System.out.println("k: " + k);
	}
}