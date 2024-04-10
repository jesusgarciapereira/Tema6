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

	/**
	 * Metrodo para calcular el area del poligono, en la clase Poligono es abstracto
	 * porque no podemos calcularlo si no sabemos que tipo de poligono es
	 */
	public abstract double area();

	/**
	 * Metodo toString sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "------------------\n";
		// Le concatenamos los datos que mostrará
		cadena += "Número de lados: " + this.numeroLados + "\n";
		
		// Devolverá la cadena de texto que hemos construido
		return cadena;
	}

}
