package partido;
/**
 * La clase jugador asignara un dorsal a cada jugador y
 * nos mostrara cuando el jugador esta expulsado del juego.
 * Se compone de tres atributos y dos métodos, que permiten al soldado
 * efectuar diferentes acciones.
 * @author Marian
 * @author Gabriela
 * @author Cristian
 * @author Libertad
 *
 */
public class Jugador {
	/**
	 * Es un atributo private, de tipo int, denominado Dorsal del jugador, 
	 * comprendido entre el 1 y el 30.
	 */
	private int dorsal;
	
	/**
	 * Es un atributo private, de tipo int, denominado numeroTarjetasAmarillas
     * El jugador puede ser apersibido con hasta
     * dos tarjetas amarillas.
     */
	private int numeroTarjetasAmarillas;
	
	/**
	 * Es un atributo private, de tipo int, denominado numeroTarjetasRojas.
     * El jugador sera expulsado con 1 tarjeta roja,
     * debido a la acumulación de 2 tarjetas amarillas.
     */
	private int numeroTarjetasRojas;
	
	/**
	 * Consulta el numero del dorsal
	 * @return el numero del dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}
	
	/**
	 * Consulta el numero de tarjetas amarillas
	 * @return numero de tarjetas amarillas
	 */
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	
	/**
	 * Define el numero de tarjetas amarillas especificando que si el numero es mayor que 2 se guardara el valor maximo permitido (2),
	 * y si el numero es menor que 0 se guardara el valor menor permitido (0)
	 * @param numeroTarjetasAmarillas numero entero
	 */
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas){
		if (numeroTarjetasAmarillas > 2) 
			this.numeroTarjetasAmarillas = 2;
		else if (numeroTarjetasAmarillas < 0) 
			this.numeroTarjetasAmarillas = 0;
		else
			this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	
	/**
	 * Evalua el numero de tarjetas rojas
	 * @return numero de tarjetas rojas
	 */
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	
	/**
	 * Define el numero de tarjetas rojas especificando que si el numero es mayor que 1 se guardara el valor maximo permitido (1),
	 * y si el numero es menor que 0 se guardara el valor menor permitido (0)
	 * @param numeroTarjetasRojas numero entero
	 */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		if (numeroTarjetasRojas > 1) 
			this.numeroTarjetasRojas = 1;
		else if (numeroTarjetasRojas < 0) 
			this.numeroTarjetasRojas = 0;
		else
			this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Método que no devuelve nada.
 	 * Recibe un parámetro. Trabaja con el atributo de instancia dorsal.
 	 * Analiza si el dorsal contiene el un número entre el 1 y el 30, incluidos. En otro, se configura como -1.
 	 * Si es así, establece este número como dorsal. En caso contrario, no establece número en el dorsal.
	 *  
	 * @param dorsal numero entre 1 y 30
	 */
	public void ponerDorsal(int dorsal){
		if(dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		}else {
			this.dorsal = -1;
		}
	}
	
	/**
	 * Método que devuelve un valor de tipo boolean.
 	 * No recibe parámetros.
 	 * Inicializa una variable, expulsado, a false. Estableciendo dos casos, en los que su valor
 	 * será establecido en true. En un caso, iguala el atributo numeroTarjetasAmarillas a 2. 
 	 * En el otro, iguala el atributo numeroTarjetasRojas a 1. Si uno de estos casos se cumple, el 
 	 * @return true si esta expulsado y false en cualquier otro caso.
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if(numeroTarjetasAmarillas==2) { expulsado= true;}
		if(numeroTarjetasRojas == 1) { expulsado= true;}
		return expulsado;
	}	
}
