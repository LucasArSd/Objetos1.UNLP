package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class InterUrbano extends Envio{
	private int distanciaKm;
	
	public InterUrbano(LocalDate fDespacho, String unaDO, String unaDD, double unPesoGr, int unaDistancia) {
		super(fDespacho, unaDO, unaDD, unPesoGr);
		this.distanciaKm = unaDistancia;
	}
	
	
	public double retornarMontoEnvio() {
		return super.getPesoGr() * this.costoPorDistancia();
	}
	
	private double costoPorDistancia() {
		if (this.distanciaKm < 100) {
			return 20;
		}else if (this.distanciaKm < 500){
			return 25;
		}
		return 30;
	}
}
