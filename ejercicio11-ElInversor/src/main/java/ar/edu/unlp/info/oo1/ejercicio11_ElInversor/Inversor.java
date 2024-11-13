package ar.edu.unlp.info.oo1.ejercicio11_ElInversor;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre){
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}

	public double valorActual() {
		return inversiones.stream()
							.mapToDouble(i -> i.valorActual())
							.sum();
	}
}
