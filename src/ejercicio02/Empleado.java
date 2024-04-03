package ejercicio02;

/**
 * Clase que representa a los Empleados
 */
public class Empleado {

	/**
	 * Nombre del empleado
	 */
	private String nombre = "";

	/**
	 * Constructor sin parametros
	 */
	public Empleado() {

	}

	/**
	 * Constructor con el atributo como parametro
	 * @param nombre Nombre del empleado
	 */
	public Empleado(String nombre) {
		// Para el nombre solo admitirá un String distinto de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el nombre del empleado
	 * @return Nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para modificar el nombre del empleado por el escrito en el parametro
	 * @param nombre Nombre del empleado
	 */
	public void setNombre(String nombre) {
		// Para el nombre solo admitirá un String distinto de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	/**
	 * Metodo toString() sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "";

		// Le concatenamos su nombre precedido de la palabra "Empleado"
		cadena += "Empleado " + this.nombre;

		// Devuelve la cadena que hemos construido
		return cadena;
	}

}
