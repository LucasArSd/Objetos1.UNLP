package ar.edu.unlp.info.oo1.balanzaElectronica;
import java.time.LocalDate;

public class Balanza {
	
	//Atributos
	private double precioTotal;
	private double pesoTotal;
	private int cantidadDeProductos;
	
	//Metodos
	
	public void ponerEnCero(){
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
		this.cantidadDeProductos += 1;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public Ticket emitirTicket() {
		Ticket unTicket = new Ticket();
		unTicket.setCantidadDeProductos(this.cantidadDeProductos);
		unTicket.setPrecioTotal(this.precioTotal);
		unTicket.setPesoTotal(this.pesoTotal);
		unTicket.setFecha(LocalDate.now());
		return unTicket;
	};
	
}
