package palabraSuper._2_SuperEnMetodos;

/* Clase Base Person */
class Person {
	void message() {
		System.out.println("Esta es una clase persona");
	}
}

/* Subclase Student */
class Student extends Person {
	void message() {
		System.out.println("Esta es una clase estudiante");
	}

	// Tenga en cuenta que display() solo est� en la clase Student
	void display() {
		// invocar� o llamar� al m�todo message() de la clase actual
		message();

		// invocar� o llamar� al m�todo message() de la clase padre
		super.message();
	}
}

/* Programa Controlador Test */
class Test {
	public static void main(String args[]) {
		Student s = new Student();

		// llamando a display() de Student
		s.display();
	}
}