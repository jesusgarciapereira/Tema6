package ejercicio04;

/**
 * Subclase de Electrodomestico que representa a cada una de las lavadoras
 */
public class Lavadora extends Electrodomestico {

	/**
	 * Carga maxima de ropa que puede lavar la lavadora, por defecto 5
	 */
	private double carga = 5;

	/**
	 * Constructor sin parametros
	 */
	public Lavadora() {
		super();
	}

	/**
	 * Constructor con el precio y el peso
	 * 
	 * @param precioBase Precio base de la lavadora
	 * @param peso       Peso de la lavadora
	 */
	public Lavadora(double precioBase, double peso) {
		// Llamamos al constructor del padre con el precio y el peso
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los atributos, incluidos los del padre
	 * 
	 * @param precioBase        Precio base de la lavadora
	 * @param color             Color de la lavadora
	 * @param consumoEnergetico Consumo energetico de la lavadora
	 * @param peso              Peso de la lavadora
	 * @param carga             Carga de la lavadora
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		// Llamamos al constructor del padre con todos sus atributos
		super(precioBase, color, consumoEnergetico, peso);
		// Para la carga, sólo admitirá valores mayores que 0
		if (carga > 0)
			this.carga = carga;
	}

	/**
	 * Funcion que devuelve el valor de carga
	 * 
	 * @return Carga de la lavadora
	 */
	public double getCarga() {
		return carga;
	}
	
	/**
	 * Metodo precioFinal() sobreescrito
	 */
	@Override
	public void precioFinal() {
		// Llamamos al método precioFinal() del padre
		super.precioFinal();
		
		// Si la carga de la lavadora es mayor que 30
		if(this.carga > 30)
			// Se incrementa el precio base en 50
			this.precioBase += 50;
	}


	
	

}
