package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class EnvioTest {
	
	private Envio envioLocal;
	private Envio envioInterU;
	private Envio envioInterN;
	
	@Test
	void testEnvioLocal() {
		envioLocal = new Local(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, true); 
		assertEquals(1500, envioLocal.retornarMontoEnvio());
		envioLocal = new Local(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, false); 
		assertEquals(1000, envioLocal.retornarMontoEnvio());
	}
	
	@Test
	void testEnvioInterUrbano() {
		envioInterU = new InterUrbano(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, 50); 
		assertEquals(100000, envioInterU.retornarMontoEnvio());
		envioInterU = new InterUrbano(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, 250); 
		assertEquals(125000, envioInterU.retornarMontoEnvio());
		envioInterU = new InterUrbano(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 5000, 600); 
		assertEquals(150000, envioInterU.retornarMontoEnvio());
	}

	@Test
	void testEnvioInternacional() {
		envioInterN = new Internacional(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 500); 
		assertEquals(10000, envioInterN.retornarMontoEnvio());
		envioInterN = new Internacional(LocalDate.of(2023, 11, 12), "Bs As", "Cordoba", 1100); 
		assertEquals(18200, envioInterN.retornarMontoEnvio());
	}

}
