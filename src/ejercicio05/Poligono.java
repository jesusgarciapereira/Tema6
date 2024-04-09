package ejercicio05;

/**
 * Clase abstracta que representa a los poligonos
 */
public abstract class Poligono {

	/**
	 * Numero de lados del poligono
	 */
	protected int numeroLados;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param numeroLados Numero de lados del poligono
	 */
	public Poligono(int numeroLados) {
		// El número de lados sólo admitirá valores mayores que 2
		if (numeroLados > 2)
			this.numeroLados = numeroLados;
	}

	/**
	 * Funcion que devuelve el valor del numero de lados
	 * 
	 * @return Numero de lados del poligono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	
	

}
