package batalla;
/**
 * Representa un soldado en combate.
 * @author Marian
 */
public class Soldado {
	private boolean estaMuerto;
	private int numeroBalas;
	
	/**
	 * Inicializa un soldado con cierto numero de balas.
	 * @param numeroBalas municion inicial
	 */
	public Soldado (int numeroBalas) {
		this.estaMuerto = false;
		this.numeroBalas = numeroBalas; 
	}
	
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
	 * Indica si tiene material para disparar.
	 * @return true en caso de tener mas de 0 balas o false si tiene 0.
	 */ 
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;	
	}
	
	/**
	 * Descuenta una bala y mata al soldadol.
	 * @param sol, soldado a quien dispara.
	 */
	public void disparar(Soldado sol) {
		if(this.numeroBalas > 0) {
			this.numeroBalas--;
			if(sol != null)
				sol.estaMuerto=true;
		}	
	}
}
