package ar.edu.unlp.info.oo1.ej3_presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		super();
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario*this.cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

}
