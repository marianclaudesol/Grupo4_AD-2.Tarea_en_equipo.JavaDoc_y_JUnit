package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Soldado;

/**
 * Test de la clase Soldado, donde se probaran los 
 * metodos PuedeDisparar, siendo este positivo o negativo,
 * y el metodo Disparar que nos dira si el Soldado esta vivo 
 * o muerto.
 * 
 * @author Gabriela Prieto
 *
 */

class SoldadoTest {
	
	private Soldado soldado1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		soldado1 = new Soldado();
	}

	@AfterEach
	void tearDown() throws Exception {
		soldado1 = null;
	}
	/**
	 * Test PuedeDisparar donde se compara
	 * si el soldado tiene valas o no.
	 */

	@Test
	public void testPuedeDispara1() {
		soldado1.setNumeroBalas(105);
		
		assertTrue(soldado1.puedeDisparar());
	
	}
	
	@Test
	public void testPuedeDispara2() {
		soldado1.setNumeroBalas(0);
		
		assertFalse(soldado1.puedeDisparar());
		
	}
	/**
	 * Test EstaMuerto comprueba si el numero de valas es superior
	 * a 0 y nos indica si el soldado esta muerto o vivo.
	 */
	@Test
	public void testEstaMuertoPositivo() {
		soldado1.setNumeroBalas(0);
		soldado1.disparar(soldado1);
		
		assertTrue(soldado1.isEstaMuerto());
	
	}
	
	@Test
	public void testEstaMuertoNegativo() {
		soldado1.setNumeroBalas(30);
		soldado1.disparar(soldado1);
		soldado1.setEstaMuerto(false);
		
		assertFalse(soldado1.isEstaMuerto());
	}
	

}
