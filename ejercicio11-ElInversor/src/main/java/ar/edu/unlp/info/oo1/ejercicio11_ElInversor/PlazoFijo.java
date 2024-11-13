package ar.edu.unlp.info.oo1.ejercicio11_ElInversor;

import java.time.LocalDate;

public class PlazoFijo extends Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fecha, double monto, double intereses){
		this.montoDepositado = monto;
		this.fechaDeConstitucion = LocalDate.now();
		this.porcentajeDeInteresDiario = intereses;
	}
	
	public double valorActual() {
		int dias = (int) Math.abs(LocalDate.now().toEpochDay() - 
					this.getFechaDeConstitucion().toEpochDay());
		double ganancias = (this.getMontoDepositado() * this.porcentajeDeInteresDiario) * dias;
		return  (this.montoDepositado + ganancias);
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public double getMontoDepositado() {
		return montoDepositado;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
}
