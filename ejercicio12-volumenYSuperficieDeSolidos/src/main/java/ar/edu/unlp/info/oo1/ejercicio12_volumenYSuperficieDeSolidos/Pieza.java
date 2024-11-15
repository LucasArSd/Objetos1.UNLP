package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String unMaterial, String unColor) {
		this.material = unMaterial;
		this.color = unColor;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen();
	
	public abstract double getSuperficie();
}
