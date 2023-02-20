package Junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import project.Soldado;

class TestSoldado {

Soldado sold;
	
	@BeforeEach
	public void setUp() {
		this.sold = new Soldado();
	}
	

	@Test
	public void EstaMuerto() {
		sold.setEstaMuerto(true);
		
		assertTrue(sold.isEstaMuerto());
	}
	@Test
	public void EstaMuertoFalse() {
		sold.setEstaMuerto(true);
		sold.setEstaMuerto(false);
		
		assertFalse(sold.isEstaMuerto());
	}

	@Test
	public void NumeroBalas() {
		sold.setNumeroBalas(5);

		assertEquals(5, sold.getNumeroBalas());
	}
	

	@Test
	public void puedeDisparar() {
		sold.setNumeroBalas(20);

		assertTrue(sold.puedeDisparar());
	}
	@Test
	public void puedeDispararSinBalas() {
		sold.setNumeroBalas(0);

		assertFalse(sold.puedeDisparar());
	}

	
	
}
