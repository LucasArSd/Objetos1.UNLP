package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza{
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public PrismaRectangular(String unMaterial, String unColor, int unLadoMa, int unLadoMe, int unaAltura) {
		super(unMaterial, unColor);
		this.ladoMayor = unLadoMa;
		this.ladoMenor = unLadoMe;
		this.altura = unaAltura;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}
	public int getLadoMenor() {
		return this.ladoMenor;
	}
	public int getAltura() {
		return this.altura;
	}
	
	public double getVolumen() {
		return this.getLadoMayor() * this.getLadoMenor() * this.getAltura();
	}
	
	public double getSuperficie() {
		return 2*((this.getLadoMayor() * this.getLadoMenor())+
				  (this.getLadoMayor() * this.getAltura())+
				  (this.getLadoMenor() * this.getAltura()));
	}
}