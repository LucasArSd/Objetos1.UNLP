package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String direccionO;
	private String direccionD;
	private double pesoGr;
	
	public Envio(LocalDate fDespacho, String unaDO, String unaDD, double unPesoGr) {
		this.fechaDespacho = fDespacho;
		this.direccionO = unaDO;
		this.direccionD = unaDD;
		this.pesoGr = unPesoGr;
	}
	
	public abstract double retornarMontoEnvio();
	
	public boolean seEncuentraEntre(LocalDate fInicio, LocalDate fFin) {
		return (this.fechaDespacho.isAfter(fInicio)&&
				this.fechaDespacho.isBefore(fFin));
	}
	
	public double getPesoGr() {
		return this.pesoGr;
	}
}
