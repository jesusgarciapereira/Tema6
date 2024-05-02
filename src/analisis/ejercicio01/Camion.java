package analisis.ejercicio01;

/**
 * Clase que representa a cada Camion, sera una extension de Vehiculo
 */
public class Camion extends Vehiculo {

	/**
	 * Peso maximo autorizado del Camion
	 */
	private double pesoMaximoAutorizado;

	/**
	 * Valor que indica si el camion transporta mercancia peligrosa
	 */
	private boolean mercanciaPeligrosa;

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param marca                Marca del Camion
	 * @param modelo               Modelo del Camion
	 * @param color                Color del Camion
	 * @param matricula            Matricula del Camion
	 * @param motorEncendido       Indicador de si el motor esta encendido
	 * @param marchaActual         Marcha actual del Camion
	 * @param velocidadActual      Velocidad actual del Camion
	 * @param pesoMaximoAutorizado Peso maximo autorizado del Camion
	 * @param mercanciaPeligrosa   Valor que indica si el camion transporta
	 *                             mercancia peligrosa
	 */
	public Camion(String marca, String modelo, String color, String matricula, boolean motorEncendido, int marchaActual,
			double velocidadActual, double pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
		// Llama al constructor del padre
		super(marca, modelo, color, matricula, motorEncendido, marchaActual, velocidadActual);
		// El peso máximo autorizado sólo admitirá valores mayores que 0
		if (pesoMaximoAutorizado > 0)
			this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	

}
