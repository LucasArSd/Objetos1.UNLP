package ar.edu.unlp.info.oo1.MethodLookUp;

public class Empleado {
	private String nombre;
	
	public Empleado(String unNombre) {
		this.nombre = unNombre;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
}
