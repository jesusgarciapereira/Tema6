package ejercicio03;

/**
 * Clase que representa los Productos
 */
public class Producto {

	/**
	 * Nombre del producto
	 */
	protected String nombre = "";
	/**
	 * Precio del producto
	 */
	protected double precio;

	/**
	 * Constructor sin parametros
	 */
	public Producto() {

	}

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, double precio) {
		// Para el nombre sólo admitirá un String distinto de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		// Para el precio sólo admitirá valores mayores que 0
		if (precio > 0)
			this.precio = precio;
	}

	/**
	 * Metodo para obtener el nombre del producto
	 * 
	 * @return Nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para modificar el nombre del producto por el escrito en el parametro
	 * 
	 * @param nombre Nombre del producto
	 */
	public void setNombre(String nombre) {
		// Para el nombre sólo admitirá un String distinto de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el precio del producto
	 * 
	 * @return Precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo para modificar el precio del producto por el escrito en el parametro
	 * 
	 * @param precio Precio del producto
	 */
	public void setPrecio(double precio) {
		// Para el precio sólo admitirá valores mayores que 0
		if (precio > 0)
			this.precio = precio;
	}

}
