package interfaces.ejercicio03;

/**
 * Clase que representa a cada animal domestico
 */
public abstract class AnimalDomestico implements Animal {

	/**
	 * Nombre del animal domestico
	 */
	protected String nombre = "";
	/**
	 * Raza del animal domestico
	 */
	private String raza = "";
	/**
	 * Peso del animal domestico
	 */
	private double peso;
	/**
	 * Color del animal domestico
	 */
	private String color = "";

	
	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre del animal domestico
	 * @param raza   Raza del animal domestico
	 * @param peso   Peso del animal domestico
	 * @param color  Color del animal domestico
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		// El nombre sólo admitirá valores distintos de null y de cadena vacía
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		// La raza sólo admitirá valores distintos de null y de cadena vacía
		if (raza != null && !raza.equals(""))
			this.raza = raza;
		// El peso sólo admitirá valores mayores que 0
		if (peso > 0)
			this.peso = peso;
		// El color sólo admitirá valores distintos de null y de cadena vacía
		if (color != null && !color.equals(""))
			this.color = color;
	}

	/**
	 * Metodo que vacuna al animal y muestra el mensaje
	 */
	public void vacunar() {
		System.out.println("Hemos vacunado a " + this.nombre);
	}

	/**
	 * Metodo abstracto hacerCaso()
	 * 
	 * @return True o false
	 */
	public abstract boolean hacerCaso();

}
