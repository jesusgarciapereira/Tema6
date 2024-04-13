package ejercicio05;

public class ArrayPoligono {

	/**
	 * Array de poligonos de tamannio 10
	 */
	public static Poligono[] poligonos = new Poligono[10];


	/**
	 * Busca y devuelve una posicion del array que no contenga ningun objeto
	 * 
	 * @return Posicion libre para rellenar el array, si no hay ninguna libre
	 *         devuelve -1
	 */
	public static int posicionLibre() {
		// Posición libre del array, inicializado en -1
		int posicion = -1;
		// Contador para recorrer el array
		int contador = 0;

		// Mientras el contador sea menor que la longitud del array y la posición sea -1
		while (contador < poligonos.length && posicion == -1) {
			// Si el elemento en el que nos encontramos es null
			if (poligonos[contador] == null) {
				// Asignamos a la posición el valor del contador
				posicion = contador;
			}
			// Incrementamos el contador
			contador++;

		}

		// Devuelve el valor asignado a la posición
		return posicion;

	}

}
