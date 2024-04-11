package ejercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	/**
	 * Scanner activado
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Opcion seleccionada por el usuario
		int opcion;

		// Para poder escribir decimales con un punto
		sc.useLocale(Locale.US);

		do {
			// Inicializamos la opción a 0
			opcion = 0;

			// Mostramos el menú
			muestraMenu();

			// Le pedimos al usuario una opcion
			System.out.println("Seleccione una opción");
			// Y la asignamos
			opcion = sc.nextInt();

			// Switch para cada caso de la variable opción
			switch (opcion) {
			// Si es 1
			case 1:
				// Llama a la función introduceTriangulo() y muestra el correspondiente mensaje
				System.out.println(ArrayPoligono.introduceTriangulo() ? "Triángulo introducido correctamente"
						: "El array de polígonos está lleno");
				System.out.println();
				break;
				// Si es 2
			case 2:
				// Llama a la función introduceRectangulo() y muestra el correspondiente mensaje
				System.out.println(ArrayPoligono.introduceRectangulo() ? "Rectángulo introducido correctamente"
						: "El array de polígonos está lleno");
				System.out.println();
				break;
				// Si es 3
			case 3:
				// Llama a la función muestraArray() para mostrar todo su contenido
				ArrayPoligono.muestraArray();
				break;
				// Si es 4, no hace nada
			case 4:
				break;
				// Si es otro valor, tampoco hace nada
			default:
				break;
			}

			// Mientras la opción sea distinta de 4, repetiremos todas las instrucciones del
			// do
		} while (opcion != 4);

		// Mensaje de salida del programa
		System.out.println("Saliendo del programa");
		// Cerramos el Scanner
		sc.close();

	}

	/**
	 * Funcion que mostrara este menu
	 */
	private static void muestraMenu() {
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar contenido del array");
		System.out.println("4. Salir del menú");
		System.out.println();

	}

}
