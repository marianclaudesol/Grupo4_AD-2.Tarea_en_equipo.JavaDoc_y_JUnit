package testJunit;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import requerimiento.Soldado;

class testSoldado {

	@Test
	public void testePuedeDisparar() {
		Soldado soldado = new Soldado();
		soldado.setNumeroBalas(4);
		assertTrue(soldado.puedeDisparar());
		
		
		soldado.setNumeroBalas(-4);
		assertFalse(soldado.puedeDisparar());
		
		soldado.setNumeroBalas(0);
		assertFalse(soldado.puedeDisparar());
		
		
	}
	
	@Test
	public void testDisparar() {
		Soldado soldado1 = new Soldado();
		Soldado soldado2 = new Soldado();
		
		soldado1.disparar(soldado1.setNumeroBalas(0));
		
		soldado1.setNumeroBalas(0);
		assertTrue(soldado1.disparar());
			
		}
			
	}

