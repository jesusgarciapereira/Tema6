package ejercicio04;

/**
 * Superclase que representa a cada uno de los electrodomesticos
 */
public class Electrodomestico {

	/**
	 * Enumeracion que representa los posibles colores de los electrodomesticos
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Enumeracion que representa los posibles tipos de consumo energetico de los
	 * electrodomesticos
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * Precio base del electrodomestico, por defecto 100
	 */
	protected double precioBase = 100;
	/**
	 * Color del electrodomestico, por defecto BLANCO
	 */
	protected Color color = Color.BLANCO;
	/**
	 * Tipo de consumo energetico del electrodomestico, por defecto F
	 */
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.F;
	/**
	 * Peso del electrodomestico, por defecto 5
	 */
	protected double peso = 5;

	/**
	 * Constructor sin parametros
	 */
	public Electrodomestico() {

	}

	/**
	 * Constructor con el precio y el peso
	 * 
	 * @param precioBase Precio base del electrodomestico
	 * @param peso       Peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, double peso) {
		// Para el precio base, sólo admitirá valores mayores que 0
		if (precioBase > 0)
			this.precioBase = precioBase;
		// Para el peso, sólo admitirá valores mayores que 0
		if (peso > 0)
			this.peso = peso;
	}

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param precioBase        Precio base del electrodomestico
	 * @param color             Color del electrodomestico
	 * @param consumoEnergetico Consumo energetico del electrodomestico
	 * @param peso              Peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		// Llamamos al constructor con el precio y el peso
		this(precioBase, peso);
		// Para el color sólo admitirá valores distintos de null y de cadena vacía
		if (color != null && !color.equals(""))
			this.color = Color.valueOf(color.toUpperCase());
		// Para el consumo energético sólo admitirá valores distintos de null y de cadena vacía
		if (consumoEnergetico != null && !consumoEnergetico.equals(""))
			this.consumoEnergetico = ConsumoEnergetico.valueOf(consumoEnergetico.toUpperCase());

	}
	


}
