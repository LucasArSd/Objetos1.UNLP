package ar.edu.unlp.info.oo1.ej4_FigurasYCuerpos;

public class Cuadrado implements FiguraGeometrica {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.getLado()*4;
	}
	
	public double getArea() {
		return Math.pow(this.getLado(), 2);
	}
	
}
