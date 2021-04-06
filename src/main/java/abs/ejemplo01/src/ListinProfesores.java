package abs.ejemplo01.src;

import java.util.ArrayList;
import java.util.Iterator;

public class ListinProfesores {

	private ArrayList<Profesor> listinProfesores;

	// Constructor
	public ListinProfesores() {
		listinProfesores = new ArrayList<Profesor>();
	}

	public void addProfesor(Profesor profesor) {
		listinProfesores.add(profesor);
	}

	public void imprimirListin() {
		String tmpStr1 = ""; // String temporal que usamos como auxiliar

		System.out.println("*** Se muestran los datos de los profesores en el listin ***\n");

		for (Profesor tmp : listinProfesores) {
			System.out.println(tmp.toString());

			if (tmp instanceof ProfesorInterino) {
				tmpStr1 = "Interino";
			} else {
				tmpStr1 = "Titular";
			}

			System.out.println("-Tipo: " + tmpStr1 + "\n-Nomina de este profesor: " + (tmp.importeNomina()) + "\n");
		}
	}

	public float importeTotalNominaProfesorado() {
		float importeTotal = 0f;
		Iterator<Profesor> it = listinProfesores.iterator();
		while (it.hasNext()) {
			importeTotal = importeTotal + it.next().importeNomina();
		}
		return importeTotal;
	}
}