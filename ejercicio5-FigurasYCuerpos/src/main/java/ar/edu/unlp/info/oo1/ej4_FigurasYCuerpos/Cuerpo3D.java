package ar.edu.unlp.info.oo1.ej4_FigurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private FiguraGeometrica caraBasal;
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(FiguraGeometrica carabasal) {
		this.caraBasal = carabasal;
	}
	
	public double getVolumen() {
		return (this.caraBasal.getArea() * this.getAltura());
	}
	
	public double getSuperficieExterior() {
		return (2*this.caraBasal.getArea()) +
				(this.caraBasal.getPerimetro() * this.getAltura());
	}
}
