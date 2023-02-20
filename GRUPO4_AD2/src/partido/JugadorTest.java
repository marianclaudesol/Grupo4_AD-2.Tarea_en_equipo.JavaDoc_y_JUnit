package partido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {
	Jugador jugador;
	
	@BeforeEach
	void setUp() {
		this.jugador = new Jugador();
	}

	@Test
	void valoresPorDefecto() {
		assertEquals(0, this.jugador.getDorsal());
		assertEquals(0, this.jugador.getNumeroTarjetasAmarillas());
		assertEquals(0, this.jugador.getNumeroTarjetasRojas());
	}
	
	@Test
	void asignarTarjetasAmarillasBien() {
		jugador.setNumeroTarjetasAmarillas(2);
		
		assertEquals(2, this.jugador.getNumeroTarjetasAmarillas());
	}
	@Test
	void asignarTarjetasAmarillasNegativo() {
		jugador.setNumeroTarjetasAmarillas(-2);
		
		assertEquals(0, this.jugador.getNumeroTarjetasAmarillas());
	}
	@Test
	void asignarTarjetasAmarillasMayorQueLimite() {
		jugador.setNumeroTarjetasAmarillas(3);
		
		assertEquals(2, this.jugador.getNumeroTarjetasAmarillas());
	}
	
	@Test
	void asignarTarjetasRojasBien() {
		jugador.setNumeroTarjetasRojas(1);
		
		assertEquals(1, this.jugador.getNumeroTarjetasRojas());
	}
	@Test
	void asignarTarjetasRojasNegativo() {
		jugador.setNumeroTarjetasRojas(-1);
		
		assertEquals(0, this.jugador.getNumeroTarjetasRojas());
	}
	@Test
	void asignarTarjetasRojasMayorQueLimite() {
		jugador.setNumeroTarjetasRojas(2);
		
		assertEquals(1, this.jugador.getNumeroTarjetasRojas());
	}
	
	@Test
	void asignarDorsalCorrecto() {
		jugador.ponerDorsal(13);
		
		assertEquals(13, this.jugador.getDorsal());
	}
	@Test
	void asignarDorsalNegativo() {
		jugador.ponerDorsal(-13);
		
		assertEquals(-1, this.jugador.getDorsal());
	}
	@Test
	void asignarDorsalMayorQueLimite() {
		jugador.ponerDorsal(45);
		
		assertEquals(-1, this.jugador.getDorsal());
	}

	@Test
	void estaExpulsadoSinTarjetas() {
		assertFalse(this.jugador.estaExpulsado());
	}
	@Test
	void estaExpulsadoUnaAmarilla() {
		jugador.setNumeroTarjetasAmarillas(1);

		assertFalse(this.jugador.estaExpulsado());
	}
	@Test
	void estaExpulsadoUnaRoja() {
		jugador.setNumeroTarjetasRojas(1);

		assertTrue(this.jugador.estaExpulsado());
	}
	@Test
	void estaExpulsadoUnaAmarillaYUnaRoja() {
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(1);

		assertTrue(this.jugador.estaExpulsado());
	}
	@Test
	void estaExpulsadoDosAmarillasYUnaRoja() {
		jugador.setNumeroTarjetasAmarillas(2);
		jugador.setNumeroTarjetasRojas(1);

		assertTrue(this.jugador.estaExpulsado());
	}
	@Test
	void estaExpulsadoDosAmarillas() {
		jugador.setNumeroTarjetasAmarillas(2);

		assertTrue(this.jugador.estaExpulsado());
	}
}
