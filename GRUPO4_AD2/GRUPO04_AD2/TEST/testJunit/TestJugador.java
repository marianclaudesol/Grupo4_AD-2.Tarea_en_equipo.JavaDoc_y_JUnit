package testJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import requerimiento.Jugador;

class TestJugador {

	@Test
	public void testPonerDorsal() {
		Jugador jugador = new Jugador();
		jugador.setDorsal(4);
		assertEquals(4, jugador.getDorsal());
	}
	
	@Test
	public void testEstaExpulsado() {
		Jugador jugador = new Jugador();
		
		jugador.setNumeroTarjetasAmarillas(2);
		assertTrue(jugador.estaExpulsado());
		
		jugador.setNumeroTarjetasAmarillas(1);
		assertFalse(jugador.estaExpulsado());
		
		jugador.setNumeroTarjetasRojas(1);
		assertTrue(jugador.estaExpulsado());
		
		jugador.setNumeroTarjetasRojas(0);
		assertFalse(jugador.estaExpulsado());
		
		
	}
}






