package palabraSuper._1_SuperEnVariables;

/* clase base vehicle */
class Vehicle {
	int maxSpeed = 120;
}

/* subclase Car extendiendo de vehicle */
class Car extends Vehicle {
	int maxSpeed = 180;

	void display() {
		/* imprime maxSpeed de la clase base (vehicle) */
		System.out.println("Velocidad m�xima: " + super.maxSpeed);
	}
}

/* Programa de controlador Test */
class Test {
	public static void main(String[] args) {
		Car small = new Car();
		small.display();
	}
}