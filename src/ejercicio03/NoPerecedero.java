package ejercicio03;

/**
 * Clase que representa los Productos No Perecederos
 */
public class NoPerecedero extends Producto {

	/**
	 * Tipo del producto
	 */
	private String tipo = "";

	/**
	 * Constructor sin parametros
	 */
	public NoPerecedero() {
		super();

	}

	/**
	 * Constructor con todos los atributos, incluidos los heredados del padre
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param tipo   Tipo del producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		// Llama al constructor del padre con el nombre y el precio
		super(nombre, precio);
		// Para el tipo sólo admitirá un String distinto de null y de cadena vacía
		if (tipo != null && !tipo.equals(""))
			this.tipo = tipo;
	}

	/**
	 * Metodo para obtener el tipo del producto
	 * 
	 * @return Tipo del producto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Metodo para modificar el tipo del producto por el escrito en el parametro
	 * 
	 * @param tipo Tipo del producto
	 */
	public void setTipo(String tipo) {
		// Para el tipo sólo admitirá un String distinto de null y de cadena vacía
		if (tipo != null && !tipo.equals(""))
			this.tipo = tipo;
	}

	/**
	 * Metodo toString() sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función al que asignamos el valor devuelto por el
		// método toString() del padre
		String cadena = super.toString();

		// Le concatenamos el valor del atributo de la clase NoPerecedero
		cadena += "\nTipo: " + this.tipo;

		// Devolverá la cadena que hemos creado
		return cadena;
	}

}
