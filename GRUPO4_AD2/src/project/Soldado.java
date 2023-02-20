package project;

/**
 * El objetivo de esta clase pretende mostrarnos a un soldado en batalla.
 * Cuenta con un atributo privado de tipo booleano y otro de tipo entero.
 * Tambien incluye dos metodos uno en el que evalua si tiene cierto numero de balas o no para poder disparar.
 * y el otro metodo indica que si el soldado se queda sin balas para disparar muere.
 * 
 * @author Libertad
 *
 */
public class Soldado {
	//ATRIBUTOS de tipo booleano y entero

	private boolean estaMuerto;
	private int numeroBalas;
	
	//Constructores
	
	public Soldado() {
		super();
	}
	
	
	//GETTER Y SETTER
	
	
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
	/*
	 * Metodo clave que comprueba si el numero de balas es mayor a cero para poder disparar. 
	 * @return  verdadero  en caso de tener mas de 0 balas o falso si tiene 0
	 */
	
	public boolean puedeDisparar() {
		if(this.numeroBalas>0) {
			return true;
		}
		return false;
	}
	/*
	 * Este metodo representa que si el soldado se queda sin balas  esta muerto. 
	 * @param sol representa al soldado.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto=true;
	}

}

