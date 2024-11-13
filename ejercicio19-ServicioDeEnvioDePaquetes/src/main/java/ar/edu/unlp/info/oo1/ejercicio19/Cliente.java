package ar.edu.unlp.info.oo1.ejercicio19;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public Cliente(String unNombre, String unaDireccion) {
		this.nombre = unNombre;
		this.direccion = unaDireccion;
		this.envios = new ArrayList<Envio>();
	}
	
	public void AgregarEnvio(Envio unEnvio) {
		this.envios.add(unEnvio);
	}
	
	public double montoTotalAPagar(LocalDate fInicio, LocalDate fFin) {
		return this.envios.
				stream().
				filter(e -> e.seEncuentraEntre(fInicio, fFin))
				.mapToDouble(e -> e.retornarMontoEnvio())
				.sum();
	}
	
}
