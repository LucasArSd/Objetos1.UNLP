package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Internacional extends Envio {
	
	
	public Internacional(LocalDate fDespacho, String unaDO, String unaDD, double unPesoGr) {
		super(fDespacho, unaDO, unaDD, unPesoGr);
	}
	
	public double retornarMontoEnvio(){
		return 5000 + super.getPesoGr()*this.precioPorGramo();
	}
	
	private double precioPorGramo() {
		if (super.getPesoGr() < 1000) {
			return 10;
		}
		return 12;
	}

}
