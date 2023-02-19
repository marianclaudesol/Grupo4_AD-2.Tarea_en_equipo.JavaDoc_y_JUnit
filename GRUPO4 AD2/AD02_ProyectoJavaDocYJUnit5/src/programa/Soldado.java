package programa;
   /**
    * Clase que representa a un soldado y nos 
    * especifica el numero de valas y cuando 
    * esta muerto.
    * 
    * @author Gabriela Prieto
    * @version 1.0
    */

public class Soldado {
	
	// ATRIBUTOS:
	/**
	 * la vida del soldado si el numero de valas llega a 0
	 * el soldado esta muerto.
	 * 
	 */
        private boolean estaMuerto;

        /**
         * El numero de balas que tiene el soldado.
         */
        private int numeroBalas;

        /**
         * Conductor por defecto.
         */

        public Soldado() {
			super();
		}
        /**
         * Constructor con parametros.
         * 
         * @param estaMuerto representa la muerte del soldado.
         * @param numeroBalas representa el numero de valas.
         */
        
		public Soldado(boolean estaMuerto, int numeroBalas) {
			super();
			this.estaMuerto = estaMuerto;
			this.numeroBalas = numeroBalas;
		}
		
		// GETTERS AND SETTERS:
		
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

		// METODOS:

		/**
		 * Metodo que especifica si el soldado puede disparar
		 * o no, segun el numero de valas.
		 * 
		 * @return true, puede seguir disparando o false cuando
		 * el numero de valas llege a 0.
		 */
		public boolean puedeDisparar() {

                      if(this.numeroBalas > 0) {

                                    return true;

                      }                          

                      return false;
        }
                     
		/**
		 * Metodo que determina cuando el soldado se queda sin valas
		 * y por lo tanto muere.
		 * 
		 * @param sol repsenta al soldado.
		 */
		
		public void disparar(Soldado sol) {

                          this.numeroBalas--;

                          sol.estaMuerto = true;

            }

        

}
