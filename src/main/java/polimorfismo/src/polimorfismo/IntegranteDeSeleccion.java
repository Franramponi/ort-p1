package polimorfismo.src.polimorfismo;

public abstract class IntegranteDeSeleccion {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public IntegranteDeSeleccion() {
	}

	public IntegranteDeSeleccion(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void viajar() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido() + " y estoy vianajdno (Clase Padre)");
	}

	public void concentrarse() {
		System.out.println(
				"Soy " + this.getNombre() + " " + this.getApellido() + " y estoy concentrandome (Clase Padre)");
	}

	public void participarEnPartido() {
		System.out.println("Soy " + this.getNombre() + " " + this.getApellido()
				+ " y estoy asistiendo al Partido de Fútbol (Clase Padre)");
	}

	// IMPORTANTE -> METODO ABSTRACTO => no se implementa en la clase abstracta
	// pero si en la clases hijas
	public abstract void participarEnEntrenamiento();

}