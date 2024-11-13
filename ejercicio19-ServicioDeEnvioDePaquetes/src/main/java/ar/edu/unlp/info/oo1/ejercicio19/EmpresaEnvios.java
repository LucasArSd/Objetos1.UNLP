package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;


public class EmpresaEnvios {

	
	public void agregarEnvio(Cliente unCliente, Envio unEnvio) {
		unCliente.AgregarEnvio(unEnvio);
	}
	
	public double montoAPagar(Cliente unCliente, LocalDate fInicio, LocalDate fFin) {
		return unCliente.montoTotalAPagar(fInicio, fFin);
	}
}
