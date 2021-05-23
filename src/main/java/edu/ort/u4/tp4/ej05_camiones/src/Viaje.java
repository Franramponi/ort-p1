package edu.ort.u4.tp4.ej05_camiones.src;

public class Viaje {
	private int idCamion;
	private String idChofer;
	private double kms;

	public Viaje(int idCamion, String idChofer, double kms) {
		super();
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.kms = kms;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public void setIdCamion(int idCamion) {
		this.idCamion = idCamion;
	}

	public String getIdChofer() {
		return idChofer;
	}

	public void setIdChofer(String idChofer) {
		this.idChofer = idChofer;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

}
