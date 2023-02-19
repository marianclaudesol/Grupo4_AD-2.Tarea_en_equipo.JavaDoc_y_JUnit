package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Jugador;
/**
 * Test de los metodos de la clase Jugador:
 * Probamos el metodo para adjudicar un dorsal,
 * pasando un numero entre 1 y 30, y pasando un numero
 * fuera de ese rango.
 * Ademas probaremos los metodos de expulsión en los diferentes
 * casos que se podrían dar.
 * 
 * 
 * @author Gabriela Prieto
 *
 */

class JugadorTest {
	
	private Jugador J1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		// objeto jugador.
		J1 = new Jugador();
	}

	@AfterEach
	void tearDown() throws Exception {
		J1 = null;
	}

	/**
	 * Probamos el metodo PonerDorsal.
	 */
	@Test
	public void testDorsalPositivo() {
		J1.ponerDorsal(3);;
		
		int resultadoEsperado = 3;
		int resultado = J1.getDorsal();
		
		// Resultado esperado que el dorsal sea 3.
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void testDorsalNegativo() {
		J1.ponerDorsal(45);
		
		int resultadoEsperado = -1;
		int resultado = -1;
		
		// Resultado esperado, que no se asigne dorsal y muestre -1
		assertEquals(resultadoEsperado, resultado);
	}
	/**
	 * Probamos el metodo EstasExpulsado con
	 * tarjetas amarillas y tarjetas rojas.
	 */
	
	@Test
	public void testEstaExpulsado1() {
		J1.setNumeroTarjetasAmarillas(2);;
		
		// resultado esperado, que el jugador sea expulsado.
		assertTrue(J1.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsado2() {
		J1.setNumeroTarjetasAmarillas(1);;
		
		// Resultado esperado, que el jugador no sea expulsado.
		assertFalse(J1.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsado5() {
		J1.setNumeroTarjetasAmarillas(3);;
		
		// Resultado esperado, false ya que no puede darse la situación.
		assertFalse(J1.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsado3() {
		J1.setNumeroTarjetasRojas(1);;;
		
		// resultado esperado, que el jugador sea expulsado.
		assertTrue(J1.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsado4() {
		J1.setNumeroTarjetasRojas(0);;;
		
		// Resultado esperado, que el jugador no sea expulsado.
		assertFalse(J1.estaExpulsado());
	}
	
	@Test
	public void testEstaExpulsado6() {
		J1.setNumeroTarjetasRojas(2);;;
		
		// Resultado esperado, false ya que no puede darse la situación.
		assertFalse(J1.estaExpulsado());
	}
	
	
	
	

}
