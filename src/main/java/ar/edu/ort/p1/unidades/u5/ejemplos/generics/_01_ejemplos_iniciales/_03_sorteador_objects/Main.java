package ar.edu.ort.p1.unidades.u5.ejemplos.generics._01_ejemplos_iniciales._03_sorteador_objects;

import java.io.File;
import java.util.ArrayList;

/**
 * https://www.youtube.com/watch?v=MFu8a_LpnIc
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		SorteadorDeObjects sorteador = new SorteadorDeObjects();

		sorteador.isVacio();

		sorteador.add("Perro");
		sorteador.add("Lechuza");
		sorteador.add("Caballo");
		sorteador.add("Gato");

		sorteador.isVacio();

		while (!sorteador.isEmpty()) {

			Object elemento = sorteador.remove();
			System.out.println(elemento);

			// IMPORTANTE: Como el array contiene Objects, si no casteamos, nos dara un
			// error en tiempo de compilacion. toUpperCase() tampoco podriamos llamarlo sin
			// castear a String
			String animal = (String) elemento;
			System.out.println(animal.toUpperCase());
		}

		sorteador.isVacio();

		/*----------------------------------------------------------------------------*/

		/*
		 * Agregar al array un objeto de tipo File no dara un error en tiempo de
		 * compilacion porque el array contiene objetos de tipo Object
		 */
		sorteador.add(new File("/home/ignacio/pedidos.txt"));

		// Casteo a File porque se que el elemento en la posicion 4 es de tipo File
		File file01 = (File) sorteador.remove();
		System.out.println(file01);

		// Hacer esto dara un error en tiempo de ejecucion
		File file02 = (File) sorteador.remove();
		System.out.println(file02);

		/*----------------------------------------------------------------------------*/

		/*
		 * Declarar un ArrayList de String y querer agregarle un int nos dara un error
		 * en tiempo de copilacion, mas no en tiempo de ejecucion
		 */
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("Hola");
		// palabras.add(2);
	}

}