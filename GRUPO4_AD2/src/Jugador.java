/**
 * Registro jugador convocado para un partido
 * @author Marian
 *
 */
public class Jugador {
	private int dorsal;
	private int numeroTarjetasAmarillas;
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
		if (numeroTarjetasAmarillas > 2) this.numeroTarjetasAmarillas = 2;
		if (numeroTarjetasAmarillas < 0) this.numeroTarjetasAmarillas = 0;
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
	 * @param numeroTarjetasRojas numero
	 */
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		if (numeroTarjetasRojas > 1) this.numeroTarjetasRojas = 1;
		if (numeroTarjetasRojas < 0) this.numeroTarjetasRojas = 0;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Configura el valor del dorsal que tienen que estar comprendidos entre 1 y 30. En otro, se configura como -1.
	 * @param dorsal numero entre 1 y 30
	 */
	public void ponerDorsal(int dorsal){
		if(dorsal >= 1&&dorsal <= 30) {
			this.dorsal = dorsal;
		}else {
			this.dorsal = -1;
		}
	}
	
	/**
	 * Evalua si es expulsado. Si tiene 2 tarjtas amarillas o una roja esta expulsado.
	 * @return true si esta expulsado y false en cualquier otro caso.
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if(numeroTarjetasAmarillas==2) { expulsado= true;}
		if(numeroTarjetasRojas == 1) { expulsado= true;}
		return expulsado;
	}	
}
