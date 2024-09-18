package ar.edu.unlp.info.oo1.ej3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> productos;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.productos = new ArrayList<Item>();
	}
	
	public void agregarItem(Item unItem) {
		this.productos.add(unItem);
	}
	
	public double calcularTotal() {
		double cant = 0;
		for (Item elemento : productos) {
		    cant += elemento.costo();
		}
		return cant;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
	
}
