package batalla;
/**
 * El objetivo de esta clase es proporcionar información sobre funcionalidad
 * o acciones realizables por un soldado.
 * 
 * Se compone de dos atributos y dos métodos, que permiten al soldado
 * efectuar diferentes acciones.
 * 
 * @author Marian
 * @author Gabriela
 * @author Cristian
 * @author Libertad
 *
 */
public class Soldado {
	/**
	 * Es un atributo private, de tipo boolean, denominado estaMuerto.
	 */
	private boolean estaMuerto;
	
	/**
     * Es un atributo private, de tipo int, denominado numeroBalas.
     */
	private int numeroBalas;
	
	/**
	 * Evalua si el soldado esta muerto
	 * @return true si esta muerto o false si esta vivo.
	 */
	public boolean isEstaMuerto() {
		return estaMuerto;
	}
	
	/**
	 * clasifica si esta vivo el soldado.
	 * @param estaMuerto true si esta muerto o false si esta vivo.
	 */
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	
	/**
	 * Indica las balas que le quedan en el arma.
	 * @return numero de balas.
	 */
	public int getNumeroBalas() {
		return numeroBalas;
	}
	
	/**
	 * 	Le indica al soldado la disponibilidad de numero de balas.
	 * @param numeroBalas numero de balas
	 */
	public void setNumeroBalas(int numeroBalas) {
		if(numeroBalas < 0)
			this.numeroBalas = 0;
		else
			this.numeroBalas = numeroBalas;
	}
	
	/**
	 *  Método que devuelve un valor de tipo boolean.
	 * No recibe parámetros. Trabaja con el atributo de instancia numeroBalas.
	 * El boolean que nos retorna, nos indica si el soldado puedeDisparar,
	 * partiendo de si el numeroBalas es >0, es true. En caso contrario, false
	 * y no podrá disparar.
	 * @return un valor tipo Boolean, que indica si puede disparar.
	 * 
	 */
	 
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;	
	}
	
	/**
	 * Método void que no devuelve ningún valor.
	 * Recibe como parámetro un objeto de la clase Soldado. 
	 * Este método reduce en uno el número de balas, a través del atributo
	 * numeroBalas.
	 * Después, establece el atributo estaMuerto, del objeto sol, a true. 
	 *
	 *@param sol, objeto de la clase Soldado
	 * 
	 */
	public void disparar(Soldado sol) {
		if(this.numeroBalas > 0) {
			this.numeroBalas--;
			if(sol != null)
				sol.estaMuerto=true;
		}	
	}
}
