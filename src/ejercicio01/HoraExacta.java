package ejercicio01;

/**
 * Clase que representa la hora exacta, es la superclase Hora incluyendo los segundos
 */
public class HoraExacta extends Hora {

	/**
	 * Numero que representa los segundos
	 */
	protected int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}

}
