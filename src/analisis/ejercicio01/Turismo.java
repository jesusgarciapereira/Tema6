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
	public Tipo tipoUso;

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

		// Llama a la función comprobarTipo para asignar el valor correspondiente al
		// tipo de uso
		comprobarTipo(tipoUso);

	}

	/**
	 * Funcion para comprobar que el tipoUso del parametro es correcto
	 * 
	 * @param texto String que queremos asignar como valor del tipoUso
	 */
	private void comprobarTipo(String texto) {

		// Switch para cada caso del parámetro (en mayúsculas)
		switch (texto.toUpperCase()) {
		// Si es uno de estos casos
		case "PROFESIONAL", "PARTICULAR":
			// Se asigna el String al Tipo con el valueOf
			this.tipoUso = Tipo.valueOf(texto.toUpperCase());
			break;
		// En cualquier otro caso, no se asigna nada
		default:
			break;
		}
	}

}
