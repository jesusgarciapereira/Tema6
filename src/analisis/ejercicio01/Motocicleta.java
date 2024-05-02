package analisis.ejercicio01;

/**
 * Clase que representa a cada Motocicleta, sera una extension de Vehiculo
 */
public class Motocicleta extends Vehiculo {

	/**
	 * cilindrada de la Motocicleta
	 */
	private int cilindrada;

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param marca           Marca de la Motocicleta
	 * @param modelo          Modelo de la Motocicleta
	 * @param color           Color de la Motocicleta
	 * @param matricula       Matricula de la Motocicleta
	 * @param motorEncendido  Indicador de si el motor esta encendido
	 * @param marchaActual    Marcha actual de la Motocicleta
	 * @param velocidadActual Velocidad actual de la Motocicleta
	 * @param cilindrada      Cilindrada de la Motocicleta
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, boolean motorEncendido,
			int marchaActual, double velocidadActual, int cilindrada) {
		// llama al constructor del padre
		super(marca, modelo, color, matricula, motorEncendido, marchaActual, velocidadActual);

		// La cilindrada sólo admitirá valores mayores que 0
		if (cilindrada > 0)
			this.cilindrada = cilindrada;
	}

	/**
	 * Funcion que indica si una Motocicleta requiere carnet
	 * 
	 * @return True o false segun si se requiere carnet o no
	 */
	public boolean requiereCarnet() {

		// Variable que devolverá la función, inicializada como false
		boolean requiere = false;

		// Si la cilindrada es mayor o igual que 125
		if (this.cilindrada >= 125)
			// Asignamos true a nuestro boolean
			requiere = true;

		// Devolverá el valor de nuestro boolean
		return requiere;
	}

}
