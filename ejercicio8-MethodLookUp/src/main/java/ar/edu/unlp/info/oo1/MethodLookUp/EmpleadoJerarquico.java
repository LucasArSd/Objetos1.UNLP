package ar.edu.unlp.info.oo1.MethodLookUp;

public class EmpleadoJerarquico extends Empleado{
	
	public EmpleadoJerarquico (String unNombre) {
		super(unNombre);
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico()+ this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
}
