package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficieDeSolidos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza unaPieza) {
		piezas.add(unaPieza);
	}
	
	public List<Pieza> getPiezas(){
		return this.piezas;
	}
	
	public double getVolumenDeMaterial(String unNombre) {
		return this.getPiezas().stream()
					.filter(pieza -> pieza.getMaterial().equals(unNombre))
					.collect(Collectors.toList())
					.stream()
					.mapToDouble(pieza -> pieza.getVolumen())
					.sum();
	}
	
	public double getSuperficieDeColor(String unColor) {
		return this.getPiezas().stream()
					.filter(pieza -> pieza.getColor().equalsIgnoreCase(unColor))
					.collect(Collectors.toList())
					.stream()
					.mapToDouble(pieza -> pieza.getSuperficie())
					.sum(); 
	}
	
}
