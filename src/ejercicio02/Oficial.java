package ejercicio02;

/**
 * Clase que representa a los Oficiales, es una extension de Operario
 */
public class Oficial extends Operario {

	/**
	 * Constructor sin parametros
	 */
	public Oficial() {
		// Llama al constructor sin parámetros del padre
		super();

	}

	/**
	 * Constructor con el atributo como parametro
	 * @param nombre Nombre del oficial
	 */
	public Oficial(String nombre) {
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
		// Y la palabra "Oficial"
		cadena += " -> Oficial";
		
		// Devuelve la cadena que hemos construido
		return cadena;
	}
}
