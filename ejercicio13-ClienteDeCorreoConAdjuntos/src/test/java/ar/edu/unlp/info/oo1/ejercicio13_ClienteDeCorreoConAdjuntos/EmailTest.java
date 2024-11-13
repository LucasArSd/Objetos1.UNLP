package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailTest {
	
	private Email emailConAdjuntos;
	private Email emailSinAdjuntos;
	private Archivo archivo;
	private Archivo archivo2;

	@BeforeEach
	void setUp() throws Exception {
		this.emailConAdjuntos = new Email ("SoyUnMail","12345Hola");
		this.emailSinAdjuntos = new Email ("Soy","12345Hola");
		this.archivo = new Archivo("LanaDelRey");
		this.archivo2 = new Archivo("TaylorSwift");
		
	}

	@Test
	void testConstructor() {
		assertEquals("SoyUnMail",this.emailConAdjuntos.getTitulo());
		assertEquals("12345Hola",this.emailConAdjuntos.getCuerpo());
		assertNotNull(this.emailConAdjuntos.getArchivos());
	}
	
	@Test
	void testEspacioOcupado() {
		this.emailConAdjuntos.adjuntarArchivo(archivo);
		this.emailConAdjuntos.adjuntarArchivo(archivo2);
		assertEquals(39.00,this.emailConAdjuntos.devolverTamaño());
		assertEquals(12.00,this.emailSinAdjuntos.devolverTamaño());
	}
	
	@Test
	void contiene() {
		assertTrue(this.emailSinAdjuntos.contieneTexto("12345"));
		assertFalse(this.emailSinAdjuntos.contieneTexto("Mail"));
		
	}

}
