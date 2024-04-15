package interfaces.ejercicio03;

import java.util.Random;

/**
 * Clase que representa a cada perro
 */
public class Perro extends AnimalDomestico {

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param nombre Nombre del perro
	 * @param raza   Raza del perro
	 * @param peso   Peso del perro
	 * @param color  Color del perro
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		// Llama al constructor del padre con todos los parámetros
		super(nombre, raza, peso, color);

	}

	/**
	 * Metodo hacerRuido() sobreescrito
	 */
	@Override
	public void hacerRuido() {
		// Mostrará un ladrido
		System.out.println("Guau");

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
		
		// Si el número es menor o igual que 90
		if (numero <= 90)
			// Asignamos resultado como true
			resultado = true;

		// Devolverá el valor del resultado
		return resultado;
	}
	
	/**
	 * Metodo que saca a pasear al perro y muestra el mensaje
	 */
	public void sacarPaseo() {
		System.out.println("Hemos sacado a pasear a " + this.nombre);
	}

}
