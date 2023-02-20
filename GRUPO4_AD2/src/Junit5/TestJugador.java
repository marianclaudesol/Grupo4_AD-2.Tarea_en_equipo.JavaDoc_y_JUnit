
	package Junit5;
	import static org.junit.jupiter.api.Assertions.*;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

	import project.Jugador;

	class TestJugador {
			Jugador jug;
			
			@BeforeEach
			public void setUp() {
				this.jug = new Jugador();
			}
			
			@Test
			public void pruebaEstaExpulsado() {
				Jugador jug = new Jugador();
				
				jug.setNumeroTarjetasAmarillas(1);
				assertTrue(jug.estaExpulsado());
				
				jug.setNumeroTarjetasAmarillas(2);
				assertFalse(jug.estaExpulsado());
				
				jug.setNumeroTarjetasRojas(1);
				assertTrue(jug.estaExpulsado());
				
				jug.setNumeroTarjetasRojas(0);
				assertFalse(jug.estaExpulsado());
			}
							
			@Test
			public void generarTarjetasRojas() {
				jug.setNumeroTarjetasRojas(1);
				
				assertEquals(1, this.jug.getNumeroTarjetasRojas());
			}
					
			@Test
			public void otorgarDorsalExistente() {
				jug.ponerDorsal(7);
				
				assertEquals(7, this.jug.getDorsal());
			}
			@Test
			public void otorgarDorsalInexistente() {
				jug.ponerDorsal(-7);
				
				assertEquals(-1, this.jug.getDorsal());
			}
			
			
		
				
	}
	


