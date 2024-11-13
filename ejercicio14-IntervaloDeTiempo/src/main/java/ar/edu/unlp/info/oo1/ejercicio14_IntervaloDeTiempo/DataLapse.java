package ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataLapse implements IntervaloDeTiempo{
	private LocalDate from;
	private LocalDate to;
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return (int)this.getFrom().until(this.getTo(), ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.getFrom()) && 
				other.isBefore(this.getTo()));
	}
	
	
}
