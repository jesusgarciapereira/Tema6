package analisis.ejercicio01;

/**
 * Clase que representa a cada Turismo, sera una extension de Vehiculo
 */
public class Turismo extends Vehiculo {

	/**
	 * Enumeracion que representa los posibles valores del Tipo de Turismo
	 */
	public enum Tipo {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * Numero de plazas del Turismo
	 */
	private int numPlazas;

	/**
	 * Tipo de Turismo
	 */
	private Tipo tipoUso;

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param marca           Marca del Turismo
	 * @param modelo          Modelo del Turismo
	 * @param color           Color del Turismo
	 * @param matricula       Matricula del Turismo
	 * @param motorEncendido  Indicador de si el motor esta encendido
	 * @param marchaActual    Marcha actual del Turismo
	 * @param velocidadActual Velocidad actual del Turismo
	 * @param numPlazas       Numero de plazas del Turismo
	 * @param tipoUso         Tipo de Turismo
	 */
	public Turismo(String marca, String modelo, String color, String matricula, boolean motorEncendido,
			int marchaActual, double velocidadActual, int numPlazas, String tipoUso) {
		// Llama al constructor del padre
		super(marca, modelo, color, matricula, motorEncendido, marchaActual, velocidadActual);
		
		// El número de plazas sólo admitirá valores mayores que 0
		if (numPlazas > 0)
			this.numPlazas = numPlazas;

		// El Tipo que se use debe ser distinto de null y de cadena vacía, además de ser alguno de los valores posibles del Enum
		if (tipoUso != null && !tipoUso.equals("")
				&& (tipoUso.equalsIgnoreCase("PROFESIONAL") || tipoUso.equalsIgnoreCase("PARTICULAR")))
			this.tipoUso = Tipo.valueOf(tipoUso.toUpperCase());
	}

}
