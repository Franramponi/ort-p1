package edu.ort.u4.tp4.ej05_camiones.src;

public class Chofer {
	private String ID;
	private String nombre;
	private double pagoXViaje;

	public Chofer(String iD, String nombre, double pagoXViaje) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.pagoXViaje = pagoXViaje;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPagoXViaje() {
		return pagoXViaje;
	}

	public void setPagoXViaje(double pagoXViaje) {
		this.pagoXViaje = pagoXViaje;
	}

}
