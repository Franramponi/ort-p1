package ar.edu.ort.p1.examenes.ds.empresa_logistica.src;

public class Destino {

	private int ID;
	private String nombre;

	public Destino(int iD, String nombre) {
		super();
		ID = iD;
		this.nombre = nombre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Destino [ID=" + ID + ", nombre=" + nombre + "]";
	}

}