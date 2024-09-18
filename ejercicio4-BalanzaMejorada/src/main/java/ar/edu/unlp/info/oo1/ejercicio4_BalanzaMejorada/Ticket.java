package ar.edu.unlp.info.oo1.ejercicio4_BalanzaMejorada;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Ticket {
	
	//Atributos
	
	private LocalDate fecha;
	private List<Producto> productos;
	
	//Metodos
	
	public Ticket(List<Producto> unosProductos) {
		this.productos = new ArrayList<>(unosProductos);
		fecha = LocalDate.now();
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPesoTotal() {
		return this.productos
				.stream()
				.mapToDouble(producto -> producto.getPeso())
				.sum();
	}

	public double getPrecioTotal() {
		return this.productos
				.stream()
				.mapToDouble(producto -> producto.getPrecio())
				.sum();
	}
	
	public double impuesto() {
		return (this.getPrecioTotal() * 0.21);
	}
}
