package ar.edu.unlp.info.oo1.ejercicio6_farolas;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean prendida;
	private List<Farola> neighbors;
	
	public Farola() {
		this.prendida= false;
		this.neighbors= new ArrayList <Farola>();
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
	 	if (!this.neighbors.stream().anyMatch(farola -> farola.equals(otraFarola))){
	 		this.neighbors.add(otraFarola);
	 		otraFarola.pairWithNeighbor(this);
	 	};
	}
	
	public List<Farola> getNeighbors (){
		return this.neighbors;
	}
	
	public void turnOn() {
		if (!this.isOn()) {
			this.prendida = true;
			this.neighbors.stream().forEach(Farola::turnOn);
		}
	}
	public void turnOff() {
		if (this.isOn()) {
			this.prendida = false;
			this.neighbors.stream().forEach(Farola::turnOff);
		}
	}
	
	public boolean isOn() {
		return this.prendida;
	}
}
