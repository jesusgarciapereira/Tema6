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
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param numCamiseta Numero de camiseta del futbolista
	 * @param nombre      Nombre del futbolista
	 * @param edad        Edad del futbolista
	 * @param numGoles    Numero de goles del futbolista
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		// El número de camiseta sólo admitirá valores mayores que 0 y menores o igual
		// que 99
		if (numCamiseta > 0 && numCamiseta <= 99)
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

	/**
	 * Metodo compareTo() sobreescrito
	 */
	@Override
	public int compareTo(Futbolista o) {
		// Resultado que devolverá la función, inicializado a 0
		int resultado = 0;

		// Si el número de camiseta del objeto en el que estamos es menor que el del
		// objeto del parámetro
		if (this.numCamiseta < o.numCamiseta)
			// Asignamos -1 al resultado
			resultado = -1;
		// Si el número de camiseta del objeto en el que estamos es mayor que el del
		// objeto del parámetro
		else if (this.numCamiseta > o.numCamiseta)
			// Asignamos 1 al resultado
			resultado = 1;
		// Si son iguales
		else {
			// El resultado sera el compareTo() de los nombres
			resultado = this.nombre.compareTo(o.nombre);
		}

//		// Si el resultado sigue siendo 0 (los números de camisetas de ambos objetos son
//		// iguales), haremos las comparaciones con los nombres
//		if (resultado == 0) {
//			// Si el nombre del objeto en el que estamos es alfabéticamente menor que el del
//			// objeto del parámetro
//			if (this.nombre.compareTo(o.nombre) < 0)
//				// Asignamos -1 al resultado
//				resultado = -1;
//			// Si el nombre del objeto en el que estamos es alfabéticamente mayor que el del
//			// objeto del parámetro
//			else if (this.nombre.compareTo(o.nombre) > 0)
//				// Asignamos 1 al resultado
//				resultado = 1;
//
//		}

		// Devolvemos el valor asignado al resultado
		return resultado;
	}

	/**
	 * Metodo equals() sobreescrito
	 */
	@Override
	public boolean equals(Object obj) {
		// Resultado que devolverá la función, inicializado como false
		boolean resultado = false;
		// Casteamos el objeto del parámetro al mismo tipo que nuestra clase
		Futbolista futbolista = (Futbolista) obj;
		
		// si ambos objetos tienen el mismo número de camiseta y el mismo nombre
		if (this.numCamiseta == futbolista.numCamiseta && this.nombre.equals(futbolista.nombre))
			// Asignamos el resultado como true
			resultado = true;
		
		// La función devolverá el valor del resultado
		return resultado;
	}

	/**
	 * Metodo toString() sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "---------------------\n";

		// Le concatenamos los datos que queremos mostrar
		cadena += "Nº de camiseta: " + this.numCamiseta + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Edad: " + this.edad + "\n";
		cadena += "Nº de goles: " + this.numGoles + "\n";

		// Devolverá la cadena que hemos construido
		return cadena;
	}

}
