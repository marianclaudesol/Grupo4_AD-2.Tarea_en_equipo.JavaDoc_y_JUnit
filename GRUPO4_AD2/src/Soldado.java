

/**
 * junit soldado
 * @author Libertad
 *
 */
class Soldado {
	//ATRIBUTOS de tipo booleano y entero

	private boolean estaMuerto;
	private int numeroBalas;
	
	//GETTER Y SETTER
	//Estos metodos no hace falta hacer javadoc
	
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
	 * Este método nos devolvera un valor verdadero en caso de que el soldado tenga un numero de balas mayor a cero y podra disparar.
	 * y si no tuviera balas nos retornara falso y no podra disparar
	 * @return  
	 */
	
	public boolean puedeDisparar() {
		if(this.numeroBalas>0) {
			return true;
		}
		return false;
	}
	/*
	 * Este metodo representa que si el soldado no tiene un numero de balas por lo tanto indica que el soldado esta muerto. 
	 * @param sol representa al soldado.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto=true;
	}

}
