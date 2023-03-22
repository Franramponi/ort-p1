package ar.edu.ort.p1.unidades.u1.practico01.ej03_ort_informes_carreras.src;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Alumno> alumnos;

	/*----------------------------------------------------------------------------*/

	public Carrera() {
		this.alumnos = new ArrayList<Alumno>();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo getInformeMaxMaterias de la clase
	 * Carrera, que debe crear y devolver un unico que contenga como datos:
	 * 
	 * I. Cantidad de materias aprobadas.
	 * 
	 * II. Lista con unicamente los nombres y mails de todos aquellos alumnos que
	 * sean quienes mas materias tienen aprobadas.
	 * 
	 * @return
	 */
	public Informe getInformeMaxMaterias() {
		int maxCantAprobadas = maxCantMateriasAprobadas();
		Informe informe = new Informe(maxCantAprobadas);

		for (Alumno alumno : this.alumnos) {
			if (alumno.cantAprobadas() == maxCantAprobadas) {
				AlumnoSimplificado as = new AlumnoSimplificado(alumno.getNombre(), alumno.getMail());
				informe.addAlumnoSimplificado(as);
			}
		}
		return informe;
	}

	/**
	 * 
	 * @return
	 */
	private int maxCantMateriasAprobadas() {
		int max = 0;
		int cantAprobadas;

		for (Alumno alumno : this.alumnos) {
			cantAprobadas = alumno.cantAprobadas();
			if (cantAprobadas > max) {
				max = cantAprobadas;
			}
		}
		return max;
	}
	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public void mostrarInformeMaxMaterias() {
		Informe informe = this.getInformeMaxMaterias();
		System.out.println(informe.toString());
	}
}
