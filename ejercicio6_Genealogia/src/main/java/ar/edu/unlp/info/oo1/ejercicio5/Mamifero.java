package ar.edu.unlp.info.oo1.ejercicio5;

import java.sql.Date;

public class Mamifero {
	//atributos
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private String identificador;
	
	
	//metodos de clase
	public Mamifero() {
		
	}
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null){
			return this.getPadre().getPadre();
		}else {
			return null;
		}
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null) {
			return this.getPadre().getMadre();
		}else {
			return null;
		}	
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null) {
			return this.getMadre().getPadre();
		}else {
			return null;
		}
		
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null) {
			return this.getMadre().getMadre();
		}else {
			return null;
		}
		
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    //pregunto al padre si es el ancestro, o si tiene ese ancestro
	    if (this.getPadre() != null && (this.getPadre().equals(unMamifero) || 
	    		this.getPadre().tieneComoAncestroA(unMamifero))) {
	        return true;
	    }
	    //pregunto a mi madre si es el ancestro, o si tiene ese ancestro
	    if (this.getMadre() != null && (this.getMadre().equals(unMamifero) || 
	    		this.getMadre().tieneComoAncestroA(unMamifero))) {
	        return true;
	    }
	    //retorno false en caso de que no se haya podido ingresar en los ifs
	    return false;
	}
}
