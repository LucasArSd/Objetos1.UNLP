package ar.edu.unlp.info.oo1.ejercicio4_BalanzaMejorada;

public class Producto {
	
	//atributos
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	//metodos
	public double getPrecio() {
		return (this.peso * this.precioPorKilo);
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public double getPeso() {
		return peso;
	}
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
}
