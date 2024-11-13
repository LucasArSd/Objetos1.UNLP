package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreoConAdjuntos;

import java.util.List;
import java.util.ArrayList;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarEmail(Email unEmail) {
		this.getEmails().add(unEmail);
	}
	
	public void borrarEmail(Email unEmail){
		this.getEmails().remove(unEmail);
	}
	
	public List<Email> getEmails(){
		return emails;
	}
	
	public Email retornarPrimerEmailConTexto(String unTexto) {
		return this.getEmails()
					.stream()
					.filter(email -> email.contieneTexto(unTexto))
					.findFirst()
					.orElse(null);
	}
	
	public int espacioOcupado() {
		return this.getEmails()
					.stream()
					.mapToInt(email -> email.devolverTamaño())
					.sum();
	}
}
