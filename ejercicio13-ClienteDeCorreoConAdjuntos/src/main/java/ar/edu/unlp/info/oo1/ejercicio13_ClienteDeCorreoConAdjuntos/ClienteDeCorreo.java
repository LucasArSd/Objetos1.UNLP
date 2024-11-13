package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreoConAdjuntos;

import java.util.List;
import java.util.ArrayList;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta("SoyElInbox");
		this.carpetas.add(this.inbox);
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	public void agregarCarpeta(Carpeta unaCarpeta) {
		this.carpetas.add(unaCarpeta);
	}
	
	public void recibir(Email unEmail) {
		inbox.agregarEmail(unEmail);
	}
	
	public void mover(Email unEmail, Carpeta Origen, Carpeta Destino){
		Origen.borrarEmail(unEmail);
		Destino.agregarEmail(unEmail);
	}
	
	public List<Carpeta> getCarpetas(){
		return this.carpetas;
	}
	
	public Email buscar(String unTexto){
		return this.getCarpetas()
				.stream()
				.map(carpeta -> carpeta.retornarPrimerEmailConTexto(unTexto))
				.filter(email -> email != null)
				.findFirst()
				.orElse(null);
	}
	
	public int espacioOcupado() {
		return this.getCarpetas()
				.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado())
				.sum();
	}
}
