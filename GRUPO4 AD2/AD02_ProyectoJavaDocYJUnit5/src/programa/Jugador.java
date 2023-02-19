package programa;

/**
 * La clase jugador asignara un dorsal a cada jugador y
 * nos mostrara cuando el jugador esta expulsado del juego.
 * 
 * @author Gabriela Prieto
 * @version 1.0
 *
 */
 
public class Jugador {
	
	//ATRIBUTOS
	/**
	 * Dorsal del jugador, 
	 * comprendido entre el 1 y el 30.
	 *
	 */

    private int dorsal;
    /**
     * El jugador puede ser apersibido con hasta
     * dos tarjetas amarillas.
     */
    
    private int numeroTarjetasAmarillas;
    /**
     * El jugador sera expulsado con 1 tarjeta roja,
     * debido a la acumulación de 2 tarjetas amarillas.
     * 
     */
    
    private int numeroTarjetasRojas;

     /**
      * Contructor por defecto.
      */
    
    public Jugador() {
		super();
	}
    
    /**
     * Constructor con parametros:
     * 
     * @param dorsal representa el dorsal de cada jugador.
     * @param numeroTarjetasAmarillas representa el número de tarjetas amarillas.
     * @param numeroTarjetasRojas representa el número de tarjetas rojas.
     */

	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
	super();
	this.dorsal = dorsal;
	this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	this.numeroTarjetasRojas = numeroTarjetasRojas;
}

	// Getters and Setters:

	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	

	// METODOS:
		
		/**
		 * Metodo por el cual se le asignara un dorsal a cada jugador,
		 * comprendido entre el 1 y el 30, si no esta comprendido entre
		 * esos números se mostrara un -1.
		 * @return el dorsal dorsal.
		 */
	
	public void ponerDorsal(int dorsal) {

                  if(dorsal >= 1 && dorsal <= 30) {

                                this.dorsal = dorsal;

                  }else {

                                this.dorsal = -1;

                  }

    }

   /**
	 * Metodo que compara cuando un jugador puede ser expulsado,
	 * siendo esto posible si suma dos tajertas amarillas o una roja.
	 * 
	 * @return la palabra expulsado cuando se cumpla la condición.
	 */

    public boolean estaExpulsado() {
    	

                  boolean expulsado = false;                                                  

                  if(numeroTarjetasAmarillas == 2) {

                                expulsado = true;

                  }                          

                  if(numeroTarjetasRojas == 1) {

                                expulsado = true;

                  }                          

                  return expulsado;

    }            

}
