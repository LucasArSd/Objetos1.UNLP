package ar.edu.unlp.info.oo1.ejercicio19;

public class Corporativo extends Cliente{
	private long cuit;
	
	public Corporativo(String unNom, String unaDire, long unCuit) {
		super(unNom, unaDire);
		this.cuit = unCuit;
	}
	
}
