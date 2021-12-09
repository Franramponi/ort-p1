package ar.edu.ort.p1.extra.examenes.guard_cambio_climatico.src;

import ar.edu.ort.tp1.u5.tda.nodos.ListaOrdenadaNodos;

public class ListaZonasPorElevacion extends ListaOrdenadaNodos<Integer, Zona>{

	@Override
	public int compare(Zona z1, Zona z2) {
		return z2.getElevacion() - z1.getElevacion();
	}

	@Override
	public int compareByKey(Integer elev, Zona z) {
		return elev - z.getElevacion();
	}

}
