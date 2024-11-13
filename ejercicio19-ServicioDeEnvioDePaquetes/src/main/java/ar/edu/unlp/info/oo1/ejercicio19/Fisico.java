package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Fisico extends Cliente{
	private long dni;
	
	public Fisico(String unNom, String unaDire, long unDni) {
		super(unNom, unaDire);
		this.dni = unDni;
	}
	
	public double montoTotalAPagar(LocalDate fInicio, LocalDate fFin) {
		double m = super.montoTotalAPagar(fInicio, fFin);
		return m - (m*0.10);
	}
	
}
	