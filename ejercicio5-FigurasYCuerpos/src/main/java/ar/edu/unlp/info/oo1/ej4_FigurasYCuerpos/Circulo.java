package ar.edu.unlp.info.oo1.ej4_FigurasYCuerpos;

public class Circulo implements FiguraGeometrica {
	private double radio;

	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return this.getRadio()*2;
	}
	
	public void setRadio(double newRadio) {
		this.radio = newRadio;
	}
	
	public void setDiametro(double newDiametro) {
		this.radio = newDiametro/2;
	}
	
	public double getPerimetro() {
		return this.getDiametro()*Math.PI;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
}