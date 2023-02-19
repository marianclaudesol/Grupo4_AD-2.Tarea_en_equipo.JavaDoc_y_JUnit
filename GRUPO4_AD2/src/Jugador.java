/**
 * 
 * @author Libertad
 *
 */


class Jugador {

private int dorsal;
private int numeroTarjetasAmarillas;
private int numeroTarjetasRojas;

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
 * @param dorsal representa al dorsal que se asignara al jugador del 1 al 30.
 */
public void ponerDorsal(int dorsal) {
	if(dorsal>= 1&&dorsal<=30) {
		this.dorsal=dorsal;
	}else {
		this.dorsal=-1;
	}
}
/**
 * Este metodo consulta si esta expulsado, si tiene 2 tarjetas amarillas o una roja esta expulsado.
 * @return retorna el valor true si esta expulsado, caso contrario false
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