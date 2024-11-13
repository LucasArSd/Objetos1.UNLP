package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public class Esfera extends Pieza{
	private int radio;
	
	public Esfera(String unMaterial, String unColor, int unRadio) {
		super(unMaterial, unColor);
		this.radio = unRadio;
	}
	
	public int getRadio() {
		return this.radio;
	}
	
	public double getVolumen() {
		return (4/3 * Math.PI * Math.pow(this.getRadio(), 3));
	}
	
	public double getSuperficie() {
		return (4 * Math.PI * Math.pow(this.getRadio(), 2));
	}
}
