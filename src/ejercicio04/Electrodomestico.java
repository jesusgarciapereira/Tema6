package ejercicio04;

/**
 * Superclase que representa a cada uno de los electrodomesticos
 */
public class Electrodomestico {
	
	enum Color{
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Precio base del electrodomestico, por defecto 100
	 */
	protected double precioBase = 100;
	
	/**
	 * Color del electrodomestico, por defecto BLANCO
	 */
	protected Color color = Color.BLANCO; 

}
