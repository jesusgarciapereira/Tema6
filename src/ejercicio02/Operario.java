package ejercicio02;

/**
 * Clase que representa a los Operarios, es una extension de Empleado
 */
public class Operario extends Empleado {

	/**
	 * Constructor sin parametros
	 */
	public Operario() {
		// Llama al constructor sin parámetros del padre
		super();

	}

	/**
	 * Constructor con el atributo como parametro
	 * @param nombre Nombre del operario
	 */
	public Operario(String nombre) {
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
		// Y la palabra "Operario"
		cadena += " -> Operario";
		
		// Devuelve la cadena que hemos construido
		return cadena;
	}
}
