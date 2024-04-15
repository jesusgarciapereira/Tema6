package interfaces.ejercicio03;

import java.util.Random;

/**
 * Clase que representa a cada gato
 */
public class Gato extends AnimalDomestico {
	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre del gato
	 * @param raza   Raza del gato
	 * @param peso   Peso del gato
	 * @param color  Color del gato
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		// Llama al constructor del padre con todos los parámetros
		super(nombre, raza, peso, color);

	}

	/**
	 * Metodo hacerRuido() sobreescrito
	 */
	@Override
	public void hacerRuido() {
		// Mostrará un maullido
		System.out.println("Miau");

	}

	/**
	 * Metodo hacerCaso() sobreescrito
	 * 
	 * @return True o false segun si el perro te va a hacer caso o no
	 */
	@Override
	public boolean hacerCaso() {
		// Resultado que devolverá la función, inicializado como false
		boolean resultado = false;

		// Creamos un objeto de tipo aleatorio
		Random aleatorio = new Random();
		// Declaramos la variable numero y le asignamos un valor aleatorio entre 1 y 100
		int numero = aleatorio.nextInt(1, 101);

		// Si es menor o igual que 5
		if (numero <= 5)
			// Asignamos resultado como true
			resultado = true;

		// Devolverá el valor del resultado
		return resultado;
	}

	/**
	 * Metodo que hace toser una bola de pelo al gato y muestra el mensaje
	 */
	public void toserBolaPelo() {
		System.out.println(this.nombre + " ha tosido una bola de pelo");
	}
}
