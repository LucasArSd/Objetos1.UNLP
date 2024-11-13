package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreoConAdjuntos;

public class Archivo {
	private String nombre;
	
	
	public Archivo(String nombre){
		this.nombre = nombre;
	}
	
	public int devolverTamaño() {
		return nombre.length();
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
