package ejemplo_instanceof.ejemplo01;

public class Main {

	public static void main(String[] args) {
		String s = new String("No leas esto, s�lo es un ejemplo");
		if (s instanceof String)
			System.out.println("Efectivamente s pertenece a la clase String");
	}

}
