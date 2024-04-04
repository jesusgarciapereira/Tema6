package ejercicio04;

/**
 * Subclase de Electrodomestico que representa a cada uno de los televisores
 */
public class Television extends Electrodomestico {

	/**
	 * Resolucion del televisor (en pulgadas), por defecto 20
	 */
	private int resolucion = 20;

	/**
	 * Atributo que indica si el televisor tiene o no sintonizador TDT, por defecto
	 * false
	 */
	private boolean sintonizadorTDT = false;

	/**
	 * Constructor sin parametros
	 */
	public Television() {
		super();
	}

	/**
	 * Constructor con el precio y el peso
	 * 
	 * @param precioBase Precio base del televisor
	 * @param peso       Peso del televisor
	 */
	public Television(double precioBase, double peso) {
		// Llamamos al constructor del padre con el precio y el peso
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los atributos, incluidos los del padre
	 * 
	 * @param precioBase        Precio base del televisor
	 * @param color             Color del televisor
	 * @param consumoEnergetico Consumo energetico del televisor
	 * @param peso              Peso del televisor
	 * @param resolucion        Resolicion del televisor
	 * @param sintonizador      Si el televisor tiene sintonizador TDT
	 */
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizadorTDT) {
		// Llamamos al constructor del padre con todos sus atributos
		super(precioBase, color, consumoEnergetico, peso);

		// Para la carga, sólo admitirá valores mayores que 0
		if (resolucion > 0)
			this.resolucion = resolucion;
		
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * Funcion que devuelve el valor de resolucion
	 * 
	 * @return Resolucion del televisor
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * Funcion que devuelve el valor de sintonizadorTDT
	 * 
	 * @return True o false segun si el televisor tiene o no sintonizador TDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	/**
	 * Metodo precioFinal() sobreescrito
	 */
	@Override
	public void precioFinal() {
		// Llamamos al método precioFinal() del padre
		super.precioFinal();
		
		// Si la resolucion del televisor es mayor que 40
		if(this.resolucion > 40)
			// Se incrementa el precio base en un 30%
			this.precioBase += this.precioBase * 0.3;
		
		// Si el televisor tiene un sintonizador TDT
		if(this.sintonizadorTDT)
			// Se incrementa el precio base en 50
			this.precioBase += 50;
	}


	
	

}
