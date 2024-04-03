package ejercicio02;

/**
 * Clase que representa a los Directivos, es una extension de Empleado
 */
public class Directivo extends Empleado {

	/**
	 * Constructor sin parametros
	 */
	public Directivo() {
		// Llama al constructor sin parámetros del padre
		super();

	}

	/**
	 * Constructor con el atributo como parametro
	 * @param nombre Nombre del directivo
	 */
	public Directivo(String nombre) {
		// Llama al constructor del padre con el parámetro
		super(nombre);

	}

	/**
	 * Metodo toString() sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "";

		// Le concatenamos el valor devuelto por el método toString del padre
		cadena += super.toString();
		// Y la palabra "Directivo"
		cadena += " -> Directivo";
		
		// Devuelve la cadena que hemos construido
		return cadena;
	}
}
