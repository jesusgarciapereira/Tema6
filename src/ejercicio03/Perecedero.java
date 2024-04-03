package ejercicio03;

/**
 * Clase que representa los Productos Perecederos
 */
public class Perecedero extends Producto {

	/**
	 * Dias que le quedan al producto para caducar
	 */
	private int diasACaducar;

	/**
	 * Constructor sin parametros
	 */
	public Perecedero() {
		super();

	}

	/**
	 * Constructor con todos los atributos, incluidos los heredados del padre
	 * 
	 * @param nombre       Nombre del producto
	 * @param precio       Precio del producto
	 * @param diasACaducar Dias que le quedan al producto para caducar
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		// Llama al constructor del padre con el nombre y el precio
		super(nombre, precio);
		// Para los días a caducar sólo admitirá valores mayores o iguales que 0
		if (diasACaducar >= 0)
			this.diasACaducar = diasACaducar;
	}

	/**
	 * Metodo para obtener los dias que le quedan al producto para caducar
	 * 
	 * @return Dias que le quedan al producto para caducar
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Metodo para modificar los dias que le quedan al producto para caducar por el
	 * escrito en el parametro
	 * 
	 * @param diasACaducar Dias que le quedan al producto para caducar
	 */
	public void setDiasACaducar(int diasACaducar) {
		// Para los días a caducar sólo admitirá valores mayores o iguales que 0
		if (diasACaducar >= 0)
			this.diasACaducar = diasACaducar;
	}

	/**
	 * Metodo toString() sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función al que asignamos el valor devuelto por el
		// método toString() del padre
		String cadena = super.toString();

		// Le concatenamos el valor del atributo de la clase Perecedero
		cadena += "\nDías a caducar: " + this.diasACaducar;

		// Devolverá la cadena que hemos creado
		return cadena;
	}

	/**
	 * Metodo calcular() modificado
	 */
	@Override
	public double calcular(int cantProductos) {
		// Resultado que devolverá la función, le asignamos el valor recibido por el
		// método calcular() del padre
		double resultado = super.calcular(cantProductos);

		// Según cada caso de los dias que le quedan al producto para caducar
		switch (this.diasACaducar) {
		// Si es 1
		case 1:
			// Dividimos el resultado entre 4
			resultado /= 4;
			break;
		// Si son 2
		case 2:
			// Dividimos el resultado entre 3
			resultado /= 3;
			break;
		// Si son 3
		case 3:
			// Dividimos el resultado entre 2
			resultado /= 2;
			break;
		// En cualquier otro caso, no hacemos nada más
		default:
			break;
		}
		
		// Devolverá el resultado
		return resultado;
	}

}
