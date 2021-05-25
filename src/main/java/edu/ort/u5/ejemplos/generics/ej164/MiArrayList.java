package edu.ort.u5.ejemplos.generics.ej164;

public class MiArrayList {

	// Array de objetos
	private Object[] datosElemento;
	private int i = 0;

	// Constructor
	public MiArrayList(int z) {
		datosElemento = new Object[z];
	}

	// Devuelve un elemento del array
	public Object get(int i) {
		return datosElemento[i];
	}

	public void add(Object o) {
		datosElemento[i] = o;
		i++;
	}
}
