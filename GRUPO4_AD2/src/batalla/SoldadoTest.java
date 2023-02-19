package batalla;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoldadoTest {
	Soldado soldado;
	
	@BeforeEach
	void setUp() {
		this.soldado = new Soldado(75);
	}

	@Test
	void valoresDefecto() {
		assertEquals(75, soldado.getNumeroBalas());
		assertFalse(soldado.isEstaMuerto());
	}

	@Test
	void setEstaMuertoTrue() {
		soldado.setEstaMuerto(true);
		
		assertTrue(soldado.isEstaMuerto());
	}
	@Test
	void setEstaMuertoFalse() {
		soldado.setEstaMuerto(true);
		soldado.setEstaMuerto(false);
		
		assertFalse(soldado.isEstaMuerto());
	}

	@Test
	void setNumeroBalas() {
		soldado.setNumeroBalas(13);

		assertEquals(13, soldado.getNumeroBalas());
	}
	@Test
	void setNumeroBalasNegativo() {
		soldado.setNumeroBalas(-13);

		assertEquals(0, soldado.getNumeroBalas());
	}

	@Test
	void puedeDispararConBalas() {
		soldado.setNumeroBalas(20);

		assertTrue(soldado.puedeDisparar());
	}
	@Test
	void puedeDispararSinBalas() {
		soldado.setNumeroBalas(0);

		assertFalse(soldado.puedeDisparar());
	}

	@Test
	void dispararConBalas() {
		Soldado soldadoObjetivo = new Soldado(1);
		soldado.setNumeroBalas(20);

		soldado.disparar(soldadoObjetivo);
		
		assertEquals(19, soldado.getNumeroBalas());
		assertFalse(soldado.isEstaMuerto());
		assertEquals(1, soldadoObjetivo.getNumeroBalas());
		assertTrue(soldadoObjetivo.isEstaMuerto());
	}
	@Test
	void dispararSinBalas() {
		Soldado soldadoObjetivo = new Soldado(1);
		soldado.setNumeroBalas(0);

		soldado.disparar(soldadoObjetivo);
		
		assertEquals(0, soldado.getNumeroBalas());
		assertFalse(soldado.isEstaMuerto());
		assertEquals(1, soldadoObjetivo.getNumeroBalas());
		assertFalse(soldadoObjetivo.isEstaMuerto());
	}
	@Test
	void dispararSinSoldado() {
		soldado.setNumeroBalas(10);

		soldado.disparar(null);
		
		assertEquals(9, soldado.getNumeroBalas());
		assertFalse(soldado.isEstaMuerto());
	}
}
