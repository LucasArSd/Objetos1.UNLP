package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ClienteTest {

	private Cliente clienteFisico;
	private Cliente clienteCorpo;
	
	@Test
	void testMontoTotalClienteFisico() {
		clienteFisico = new Fisico("Juan", "8 y 49 La Plata", 40465487);
		clienteFisico.AgregarEnvio(new Local(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, true));
		//Envios que no esten dentro del rango
		assertEquals(0, clienteFisico.montoTotalAPagar(LocalDate.of(2023, 5, 12), LocalDate.of(2023, 8, 12)));
		//Envios con 10% descuento
		assertEquals(1350, clienteFisico.montoTotalAPagar(LocalDate.of(2023, 5, 12), LocalDate.of(2024, 8, 12)));
		clienteFisico.AgregarEnvio(new InterUrbano(LocalDate.of(2024, 6, 12), "Bs As", "Cordoba", 5000, 50));
		assertEquals(91350, clienteFisico.montoTotalAPagar(LocalDate.of(2023, 5, 12), LocalDate.of(2024, 8, 12)));
	}
	
	@Test
	void testMontoTotalClienteCorporativo() {
		clienteCorpo = new Corporativo("Entidad", "7 y 41 La Plata", 2025468795);
		clienteCorpo.AgregarEnvio(new Local(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, true));
		//Envios que no esten dentro del rango
		assertEquals(0, clienteCorpo.montoTotalAPagar(LocalDate.of(2023, 5, 12), LocalDate.of(2023, 8, 12)));
		//Envios con 10% descuento
		assertEquals(1500, clienteCorpo.montoTotalAPagar(LocalDate.of(2023, 5, 12), LocalDate.of(2024, 8, 12)));
		clienteCorpo.AgregarEnvio(new InterUrbano(LocalDate.of(2024, 6, 12), "Bs As", "Cordoba", 5000, 50));
		assertEquals(101500, clienteCorpo.montoTotalAPagar(LocalDate.of(2023, 5, 12), LocalDate.of(2024, 8, 12)));
	}
	
	

}
