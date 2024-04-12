package interfaces.ejercicio02;

/**
 * Clase que representa y contiene los atributos y metodos de cada futbolista
 */
public class Futbolista implements Comparable<Futbolista> {
	/**
	 * Numero de camiseta del futbolista
	 */
	private int numCamiseta;
	/**
	 * Nombre del futbolista
	 */
	private String nombre = "";
	/**
	 * Edad del futbolista
	 */
	private int edad;
	/**
	 * Numero de goles del futbolista
	 */
	private int numGoles;

	/**
	 * constructor con todos los atributos como parametro
	 * 
	 * @param numCamiseta Numero de camiseta del futbolista
	 * @param nombre      Nombre del futbolista
	 * @param edad        Edad del futbolista
	 * @param numGoles    Numero de goles del futbolista
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		// El número de camiseta sólo admitirá valores mayores que 0
		if (numCamiseta > 0)
			this.numCamiseta = numCamiseta;
		// El nombre sólo admitirá valores distintos de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		// La edad sólo admitirá valores mayores que 0
		if (edad > 0)
			this.edad = edad;
		// el número de goles sólo admitirá valores mayores o igual que 0
		if (numGoles >= 0)
			this.numGoles = numGoles;
	}


}
