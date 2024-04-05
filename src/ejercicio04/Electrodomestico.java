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
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		// Llamamos al constructor con el precio y el peso
		this(precioBase, peso);
		// Llama a la función comprobarConsumoEnergetico para asignar el valor
		// correspondiente al consumo energético
		comprobarConsumoEnergetico(consumoEnergetico);
		// Llama a la función comprobarColor para asignar el valor correspondiente al
		// color
		comprobarColor(color);

	}

	/**
	 * Funcion que devuelve el valor de precioBase
	 * 
	 * @return Precio base del electrodomestico
	 */
	public double getPrecioBase() {
		return this.precioBase;
	}

	/**
	 * Funcion que devuelve el valor de color
	 * 
	 * @return Color del electrodomestico
	 */
	public String getColor() {
		return String.valueOf(this.color);
	}

	/**
	 * Funcion que devuelve el valor de consumoEnergetico
	 * 
	 * @return Consumo energetico del electrodomestico
	 */
	public char getConsumoEnergetico() {
		return String.valueOf(this.consumoEnergetico).charAt(0);
	}

	/**
	 * Funcion que devuelve el valor de peso
	 * 
	 * @return Peso del electrodomestico
	 */
	public double getPeso() {
		return this.peso;
	}

	/**
	 * Funcion para comprobar que la letra del parametro es correcta
	 * 
	 * @param letra Letra que queremos asignar como valor del consumo energetico
	 */
	private void comprobarConsumoEnergetico(char letra) {
		// Switch para cada caso del parámetro
		switch (letra) {
		// Si es uno de estos casos
		case 'A', 'B', 'C', 'D', 'E', 'F':
			// Se asigna el char elegido, convertido a String y luego a ConsumoEnergetico con el valueOf
			this.consumoEnergetico = ConsumoEnergetico.valueOf(String.valueOf(letra).toUpperCase());
			break;
		// En cualquier otro caso, se asigna al consumo energético el valor por defecto
		// (F)
		default:
			break;
		}
	}

	/**
	 * Funcion para comprobar que el color del parametro es correcto
	 * 
	 * @param color String que queremos asignar como valor del color
	 */
	private void comprobarColor(String color) {
		// Switch para cada caso del parámetro
		switch (color.toUpperCase()) {
		// Si es uno de estos casos
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS":
			// Se asigna el char elegido, convertido  a ConsumoEnergetico con el valueOf
			this.color = Color.valueOf(color.toUpperCase());
			break;
		// En cualquier otro caso, se asigna al color el valor por defecto (BLANCO)
		default:
			break;

		}
	}

	/**
	 * Funcion que incrementa el precio base del electrodomestico segun su consumo
	 * energetico y su peso
	 */
	public void precioFinal() {
		// Switch para cada caso del consumo energético del electrodoméstico
		switch (this.consumoEnergetico) {
		// Si es A, se incrementa el precio base en 100
		case A:
			this.precioBase += 100;
			break;
		// Si es B, se incrementa el precio base en 80
		case B:
			this.precioBase += 80;
			break;
		// Si es C, se incrementa el precio base en 60
		case C:
			this.precioBase += 60;
			break;
		// Si es D, se incrementa el precio base en 50
		case D:
			this.precioBase += 50;
			break;
		// Si es E, se incrementa el precio base en 30
		case E:
			this.precioBase += 30;
			break;
		// Si es F, se incrementa el precio base en 10
		case F:
			this.precioBase += 10;
			break;

		}

		// Si el peso del electrodoméstico está entre 0 y 19
		if (this.peso >= 0 && this.peso <= 19)
			// Se incrementa el precio base en 10
			this.precioBase += 10;
		// Si el peso del electrodoméstico está entre 20 y 49
		else if (this.peso >= 20 && this.peso <= 49)
			// Se incrementa el precio base en 50
			this.precioBase += 50;
		// Si el peso del electrodoméstico está entre 50 y 79
		else if (this.peso >= 50 && this.peso <= 79)
			// Se incrementa el precio base en 80
			this.precioBase += 80;
		// En cualquier otro caso (80 o más)
		else
			// Se incrementa el precio base en 100
			this.precioBase += 100;

	}

}
