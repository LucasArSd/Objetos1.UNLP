package ar.edu.unlp.info.oo1.ejercicio13_ClienteDeCorreoConAdjuntos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
	
	private Carpeta carpetaConEmails;
	private Carpeta carpetaSinEmails;
	private Email email;
	private Email email2;

	@BeforeEach
	void setUp() throws Exception {
		this.carpetaConEmails = new Carpeta("TengoMails");
		this.carpetaSinEmails = new Carpeta("NoTengoMails");
		this.email= new Email ("SoyUnMail","12345Hola");
		this.email2= new Email ("Soy","12");
		
	}

	@Test
	void testAgregarYRemoverCorreo() {
		this.carpetaConEmails.agregarEmail(email);
		assertEquals(1,this.carpetaConEmails.getEmails().size());
		this.carpetaConEmails.borrarEmail(email);
		assertEquals(0,this.carpetaConEmails.getEmails().size());
		
	}
	
	@Test
	void testBuscar() {
		this.carpetaConEmails.agregarEmail(email);
		assertEquals(this.email,this.carpetaConEmails.retornarPrimerEmailConTexto("12345Hola"));
		assertNull(this.carpetaSinEmails.retornarPrimerEmailConTexto("1234"));
	}
	
	@Test
	void testEspacioOcupado() {
		this.carpetaConEmails.agregarEmail(email);
		this.carpetaConEmails.agregarEmail(email2);
		assertEquals(23.00,this.carpetaConEmails.espacioOcupado());
		
	}

}
