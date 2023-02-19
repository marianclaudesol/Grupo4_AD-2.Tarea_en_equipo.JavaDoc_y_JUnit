package requerimiento01;

/**
 * El objetivo de esta clase es proporcionar información sobre funcionalidad
 * o acciones realizables por un soldado.
 * 
 * Se compone de dos atributos y dos métodos, que permiten al soldado
 * efectuar diferentes acciones.
 * 
 * @author artilino48
 * @version 1.0
 *
 */
public class Soldado {
	/**
	 * Es un atributo private, de tipo boolean, denominado estaMuerto.
	 * 
	 */
    private boolean estaMuerto;
    
    /**
	 * Es un atributo private, de tipo int, denominado numeroBalas.
	 * 
	 */
    private int numeroBalas;

    
    public boolean isEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Método que devuelve un valor de tipo boolean.
	 * No recibe parámetros. Trabaja con el atributo de instancia numeroBalas.
	 * El boolean que nos retorna, nos indica si el soldado puedeDisparar,
	 * partiendo de si el numeroBalas es >0, es true. En caso contrario, false
	 * y no podrá disparar.
	 * @return un valor tipo Boolean
	 * @since version 1.o
	 */
	public boolean puedeDisparar() {
         if(this.numeroBalas > 0) {
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
	 * @return un valor tipo Boolean
	 * @since version 1.o
	 */

    public void disparar(Soldado sol) {
          this.numeroBalas--;
          sol.estaMuerto = true;
    }
}
