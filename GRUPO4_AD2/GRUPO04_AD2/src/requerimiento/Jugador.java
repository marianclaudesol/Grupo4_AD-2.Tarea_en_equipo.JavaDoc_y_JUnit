package requerimiento;

/**
 *  El objetivo de esta clase es proporcionar información sobre funcionalidades aplicadas a un jugador, 
 *  antes y durante un partido
 * 
 * Se compone de tres atributos y dos métodos, que permiten al soldado
 * efectuar diferentes acciones.
 * 
 * @author artilino48
 * @version 1.0
 */
public class Jugador {
	/**
	 * Es un atributo private, de tipo int, denominado dorsal.
	 * 
	 */
     private int dorsal;
     /**
 	 * Es un atributo private, de tipo int, denominado numeroTarjetasAmarillas.
 	 * 
 	 */
     private int numeroTarjetasAmarillas;
     /**
     * Es un atributo private, de tipo int, denominado numeroTarjetasRojas.
     * 
   	 */
     private int numeroTarjetasRojas;

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
     
     
     /**
 	 * Método que no devuelve nada.
 	 * Recibe un parámetro. Trabaja con el atributo de instancia dorsal.
 	 * Analiza si el dorsal contiene el un número entre el 1 y el 30, incluidos. 
 	 * Si es así, establece este número como dorsal. En caso contrario, no establece número en el dorsal.
 	 * @param dorsal
 	 * @since version 1.o
 	 */

	 public void ponerDorsal(int dorsal) {
          if(dorsal >= 1 && dorsal <= 30) {
              this.dorsal = dorsal;
          }else {
              this.dorsal = -1;
          }
     }

	  
     /**
 	 * Método que devuelve un valor de tipo boolean.
 	 *No recibe parámetros.
 	 * Inicializa una variable, expulsado, a false. Estableciendo dos casos, en los que su valor
 	 * será establecido en true. En un caso, iguala el atributo numeroTarjetasAmarillas a 2. 
 	 * En el otro, iguala el atributo numeroTarjetasRojas a 1. Si uno de estos casos se cumple, el 
 	 * método devuelve la variable expulsado.
 	 * @return boolean
 	 * @since version 1.o
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
