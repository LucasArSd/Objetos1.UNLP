package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreoConAdjuntos;

import java.util.List;
import java.util.ArrayList;

public class Email {
	private List<Archivo> adjuntos;
	private String titulo;
	private String cuerpo;
	
	public Email(String titulo, String cuerpo, List<Archivo> adjuntos) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = adjuntos;
	}
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public void adjuntarArchivo(Archivo unArchivo){
		this.getArchivos().add(unArchivo);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> getArchivos(){
		return this.adjuntos;
	}
	
	public boolean contieneTexto(String unTexto) {
		return (this.getTitulo().contains(unTexto) ||
				this.getCuerpo().contains(unTexto));
	}
	
	public int devolverTamaño() {
		return (this.getTitulo().length() + 
				this.getCuerpo().length() +
				this.getTamañoAdjuntos());
	}
	
	public int getTamañoAdjuntos() {
		return this.getArchivos()
				.stream()
				.mapToInt(adjunto -> adjunto.devolverTamaño())
				.sum();
	}
}
