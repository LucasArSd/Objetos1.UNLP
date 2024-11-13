package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Local extends Envio{
	private boolean entregaRapida; 
	
	public Local(LocalDate fDespacho, String unaDO, String unaDD, double unPesoGr, boolean tipoEntrega) {
		super(fDespacho, unaDO, unaDD, unPesoGr);
		this.entregaRapida = tipoEntrega;
	}
	
	public double retornarMontoEnvio() {
		return 1000 + this.adicional();
	}
	
	public double adicional() {
		if (entregaRapida) {
			return 500;
		}
		return 0;
	}
}
