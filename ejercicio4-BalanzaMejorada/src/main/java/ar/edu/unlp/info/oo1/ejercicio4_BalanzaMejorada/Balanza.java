package ar.edu.unlp.info.oo1.ejercicio4_BalanzaMejorada;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Balanza {
	
	//Atributos
	
	private List<Producto> productos = new ArrayList<>();
	
	//Metodos
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public void ponerEnCero(){
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPrecioTotal() {
		return this.productos
					.stream()
					.mapToDouble(producto -> producto.getPrecio())
					.sum();
	}

	public double getPesoTotal() {
		return this.productos
					.stream()
					.mapToDouble(producto -> producto.getPeso())
					.sum();
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.getProductos());
	};
	
}
