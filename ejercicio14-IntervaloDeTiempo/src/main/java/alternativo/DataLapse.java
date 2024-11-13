package alternativo;

import java.time.LocalDate;
import ar.edu.unlp.info.oo1.ejercicio14_IntervaloDeTiempo.IntervaloDeTiempo;

public class DataLapse implements IntervaloDeTiempo{
	private LocalDate from;
	private int sizeInDays;
	
	@Override
	public LocalDate getFrom() {
		return this.from;
	}
	@Override
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}
	@Override
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.getFrom()) && 
				other.isBefore(this.getTo()));
	}
}
