package interfaces.ejercicio03;

/**
 * Interfaz que sera implementada en la clase AnimalDomestico
 */
public interface Animal {

	/**
	 * Metodo abstracto comer(), por defecto enseña ese texto
	 */
	default void comer() {
		System.out.println("Ñam");
	};
	
	/**
	 * Metodo abstracto dormir(), por defecto enseña ese texto
	 */
	default void dormir() {
		System.out.println("Zzz");
	};
	
	/**
	 * Metodo abstracto hacerRuido()
	 */
	public void hacerRuido();
}
