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
				System.out.println(introduceTriangulo() ? "Triángulo introducido correctamente"
						: "No ha sido posible la introducción del triángulo");
				System.out.println();
				break;
				// Si es 2
			case 2:
				// Llama a la función introduceRectangulo() y muestra el correspondiente mensaje
				System.out.println(introduceRectangulo() ? "Rectángulo introducido correctamente"
						: "No ha sido posible la introducción del rectángulo");
				System.out.println();
				break;
				// Si es 3
			case 3:
				// Llama a la función muestraArray() para mostrar todo su contenido
				muestraArray();
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
	 * Funcion que introduce un triangulo en el array con los datos introducidos por
	 * el usuario
	 * 
	 * @return True o false segun si ha podido llevar a cabo la operacion o no
	 */
	public static boolean introduceTriangulo() {
		// Boolean que devolverá la función, inicializada como false
		boolean hecho = false;
		// Los tres lados del triángulo
		double lado1;
		double lado2;
		double lado3;

		// Si existe una posición libre en el array
		if (ArrayPoligono.posicionLibre() != -1) {
			// Pedimos la longitud de los tres lados del triángulo y las asignamos
			System.out.println("Introduzca la longitud del primer lado del triángulo");
			lado1 = sc.nextDouble();
			System.out.println("Introduzca la longitud del segundo lado del triángulo");
			lado2 = sc.nextDouble();
			System.out.println("Introduzca la longitud del tercer lado del triángulo");
			lado3 = sc.nextDouble();

			// Creamos un obgeto de tipo Triangulo con los valores introducidos
			Triangulo triangulo = new Triangulo(3, lado1, lado2, lado3);

			// Si el área del triángulo es mayor que 0
			if (triangulo.area() > 0) {
				// Asignamos el objeto al array en una posición que esté libre
				ArrayPoligono.poligonos[ArrayPoligono.posicionLibre()] = triangulo;
				// Y asignamos el boolean como true
				hecho = true;
			}
		}

		// Devolverá el valor de nuestro boolean
		return hecho;

	}

	/**
	 * Funcion que introduce un rectangulo en el array con los datos introducidos
	 * por el usuario
	 * 
	 * @return True o false segun si ha podido llevar a cabo la operacion o no
	 */
	public static boolean introduceRectangulo() {
		// Boolean que devolverá la función, inicializada como false
		boolean hecho = false;
		// Los dos lados distintos del rectángulo
		double lado1;
		double lado2;

		// Si existe una posición libre en el array
		if (ArrayPoligono.posicionLibre() != -1) {
			// Pedimos la longitud de los dos lados del rectángulo y las asignamos
			System.out.println("Introduzca la longitud del lado largo del rectángulo");
			lado1 = sc.nextDouble();
			System.out.println("Introduzca la longitud del lado ancho del rectángulo");
			lado2 = sc.nextDouble();

			// Creamos un obgeto de tipo Rectangulo con los valores introducidos
			Rectangulo rectangulo = new Rectangulo(4, lado1, lado2);

			// Si el área del rectángulo es mayor que 0
			if (rectangulo.area() > 0) {
				// Asignamos el objeto al array en una posición que esté libre
				ArrayPoligono.poligonos[ArrayPoligono.posicionLibre()] = rectangulo;
				// Y asignamos el boolean como true
				hecho = true;
			}
		}

		// Devolverá el valor de nuestro boolean
		return hecho;

	}

	/**
	 * Funcion que muestra la informacion contenida en el array
	 */
	public static void muestraArray() {
		// Buble for-each para recorrer cada elemento de la tabla
		for (Poligono poligono : ArrayPoligono.poligonos) {
			// Si el elemento es distinto de null
			if (poligono != null) {
				// Muestra su información
				System.out.println(poligono.toString());
				// Y su área
				System.out.println("Área: " + poligono.area() + "\n");

			}
		}

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
