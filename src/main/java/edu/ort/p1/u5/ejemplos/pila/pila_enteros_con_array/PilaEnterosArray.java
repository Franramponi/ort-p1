package edu.ort.p1.u5.ejemplos.pila.pila_enteros_con_array;

public class PilaEnterosArray {

	private static final int MAX = 1000;
	private int top;
	private int tamanioMaximo[] = new int[MAX]; // Tamanio maximo de la pila

	PilaEnterosArray() {
		top = -1;
	}

	public boolean push(int elemento) {
		boolean res = false;
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
		} else {
			tamanioMaximo[++top] = elemento;
			System.out.println(elemento + " introducido en la pila");
			res = true;
		}
		return res;
	}

	public int pop() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			int x = tamanioMaximo[top--];
			res = x;
		}
		return res;
	}

	public int peek() {
		int res = 0;
		if (top < 0) {
			System.out.println("Stack Underflow");
		} else {
			int x = tamanioMaximo[top];
			res = x;
		}
		return res;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

}