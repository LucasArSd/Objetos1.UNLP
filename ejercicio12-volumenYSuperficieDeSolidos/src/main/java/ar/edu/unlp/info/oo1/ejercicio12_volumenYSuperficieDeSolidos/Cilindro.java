package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(String unMaterial, String unColor, int unRadio, int unaAltura) {
		super(unMaterial, unColor);
		this.radio = unRadio;
		this.altura = unaAltura;
	}
	
	public int getRadio() {
		return this.radio;
	}
	public int getAltura() {
		return this.altura;
	}
	
	public double getVolumen() {
		return (Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura());
	}
	
	public double getSuperficie() {
		return ((2 * Math.PI * this.getRadio() * this.getAltura())+
				(2 * Math.PI * Math.pow(this.getRadio(), 2)));
	}
}
