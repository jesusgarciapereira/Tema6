package ejercicio05;

import java.util.Scanner;

public class ArrayPoligono {
	/**
	 * Scanner activado
	 */
	public static Scanner sc = new Scanner(System.in);

	/**
	 * Array de poligonos de tamannio 10
	 */
	public static Poligono[] poligonos = new Poligono[10];

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
		if (posicionLibre() != -1) {
			// Pedimos la longitud de los tres lados del triángulo y las asignamos
			System.out.println("Introduzca la longitud del primer lado del triángulo");
			lado1 = sc.nextDouble();
			System.out.println("Introduzca la longitud del segundo lado del triángulo");
			lado2 = sc.nextDouble();
			System.out.println("Introduzca la longitud del tercer lado del triángulo");
			lado3 = sc.nextDouble();

			// Creamos un obgeto de tipo Triangulo con los valores introducidos
			Triangulo triangulo = new Triangulo(3, lado1, lado2, lado3);

			// Asignamos el objeto al array en una posición que esté libre
			poligonos[posicionLibre()] = triangulo;

			// Y asignamos el boolean como true
			hecho = true;
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
		if (posicionLibre() != -1) {
			// Pedimos la longitud de los dos lados del rectángulo y las asignamos
			System.out.println("Introduzca la longitud del lado largo del rectángulo");
			lado1 = sc.nextDouble();
			System.out.println("Introduzca la longitud del lado ancho del rectángulo");
			lado2 = sc.nextDouble();

			// Creamos un obgeto de tipo Rectangulo con los valores introducidos
			Rectangulo rectangulo = new Rectangulo(4, lado1, lado2);

			// Asignamos el objeto al array en una posición que esté libre
			poligonos[posicionLibre()] = rectangulo;

			// Y asignamos el boolean como true
			hecho = true;
		}

		// Devolverá el valor de nuestro boolean
		return hecho;

	}

	/**
	 * Funcion que muestra la informacion contenida en el array
	 */
	public static void muestraArray() {
		// Buble for-each para recorrer cada elemento de la tabla
		for (Poligono poligono : poligonos) {
			// Si el elemento es distinto de null
			if (poligono != null) {
				// Muestra su información
				System.out.println(poligono.toString());
				// Y su área
				System.out.println("Área: " + poligono.area() + "\n");
				
				// Si el área del polígono es 0 
				if(poligono.area() == 0) {
					// Muestra este mensaje
					System.out.println("En este caso, los valores introducidos describen un polígono imposible\n");
				}
			}
			
			
		}
	}

	/**
	 * Busca y devuelve una posicion del array que no contenga ningun objeto
	 * 
	 * @return Posicion libre para rellenar el array, si no hay ninguna libre
	 *         devuelve -1
	 */
	private static int posicionLibre() {
		// Posición libre del array, inicializado en -1
		int posicion = -1;
		// Contador para recorrer el array
		int contador = 0;

		// Mientras el contador sea menor que la longitud del array y la posición sea -1
		while (contador < poligonos.length && posicion == -1) {
			// Si el elemento en el que nos encontramos es null
			if (poligonos[contador] == null) {
				// Asignamos a la posición el valor del contador
				posicion = contador;
			}
			// Incrementamos el contador
			contador++;

		}
		
		// Devuelve el valor asignado a la posición
		return posicion;

	}

}
