package interfaces.ejercicio01;

/**
 * clase que representa y contiene los atributos y metodos de cada socio
 */
public class Socio implements Comparable<Socio> {

	/**
	 * Numero identificativo del socio
	 */
	private int id;

	/**
	 * Nombre del socio
	 */
	private String nombre = "";

	/**
	 * Edad del socio
	 */
	private int edad;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param id     Numero identificativo del socio
	 * @param nombre Nombre del socio
	 * @param edad   Edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		// El id sólo admitirá valores mayores que 0
		if (id > 0)
			this.id = id;
		// El nombre sólo admitirá valores distintos de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		// La edad sólo admitirá valores mayores que 0
		if (edad > 0)
			this.edad = edad;
	}

	/**
	 * Metodo toString() sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "---------------------\n";

		// Le concatenamos los datos que queremos mostrar
		cadena += "ID: " + this.id + "\n";
		cadena += "Nombre: " + this.nombre + "\n";
		cadena += "Edad: " + this.edad + "\n";

		// Devolverá la cadena que hemos construido
		return cadena;

	}

	/**
	 * Metodo compareTo() sobreescrito
	 */
	@Override
	public int compareTo(Socio o) {
		// Resultado que devolverá la función, inicializado a 0
		int resultado = 0;

		// Si el id del objeto en el que estamos es menor que el del objeto del
		// parámetro
		if (this.id < o.id)
			// Asignamos -1 al resultado
			resultado = -1;
		// Si el id del objeto en el que estamos es mayor que el del objeto del
		// parámetro
		if (this.id > o.id)
			// Asignamos 1 al resultado
			resultado = 1;

		// Devolvemos el valor asignado al resultado
		return resultado;
	}

}
