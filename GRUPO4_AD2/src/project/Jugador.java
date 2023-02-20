package project;

	/**
	 * La clase jugador nos muestra las acciones de penalizacion que pueden efectuarse en un partido,
	 * asi como el numero de dorsal que llevara el jugador.
	 * Para ello cuenta con tres atributos privados.
	 * un metodo con el cual se determinara que numero de dorsal llevara el jugador
	 * y otro si el jugador a sido expulsado.
	 * 
	 * @author Libertad
	 *
	 */
public class Jugador {

	/*
	 * Dorsal  comprendido entre el 1 y 30
	 */
	private int dorsal;

	/*
	 * Sanciones impuestas al jugador por cometer faltas durante el partido.
	 */
	private int numeroTarjetasAmarillas;

	/*
	 * Sancion de expulsion que se le realiza al jugador por cometer una falta grave.
	 */
	private int numeroTarjetasRojas;
	
	
// Se han generado los constructores
	public Jugador() {
		super();
	}
	

	//GETTER Y SETTER
	//Estos metodos no hace falta hacer javadoc

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
	/*
	 * Este metodo configura el valor del dorsal que estan comprendidos entre 1 y 30. Caso contrario como -1.
	 * @param dorsal que se le asignara al jugador del 1 al 30.
	 */
	public void ponerDorsal(int dorsal) {
		if(dorsal>= 1&&dorsal<=30) {
			this.dorsal=dorsal;
		}else {
			this.dorsal=-1;
		}
	}
	/**
	 * Este metodo evalua en que momento puede un jugador ser expulsado, si tiene 2 tarjetas amarillas o una roja esta expulsado.
	 * @return expulsado en caso de que se cumpla la condicion.
	 */
	public boolean estaExpulsado() {
		boolean expulsado =false;
		if(numeroTarjetasAmarillas == 2) {
			expulsado = true;
			}
		if(numeroTarjetasRojas == 1) {
			expulsado = true;
			}
		return expulsado;
	}


	}

