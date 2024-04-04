package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// Tabla de tipo Electrodomestico de 10 posiciones
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];

		// Suma total de los precios de cada tipo de objeto
		double totalElectrodomesticos = 0;
		double totalLavadoras = 0;
		double totalTelevisiones = 0;

		// Creamos los objetos para nuestra tabla
		electrodomesticos[0] = new Electrodomestico(300, "blanco", 'a', 500);
		electrodomesticos[1] = new Lavadora(230, "rojo", 'c', 50, 5);
		electrodomesticos[2] = new Television(120, "azul", 'a', 100, 44, true);
		electrodomesticos[3] = new Electrodomestico(1000, "gris", 'a', 30);
		electrodomesticos[4] = new Lavadora(200, "gris", 'a', 400, 5);
		electrodomesticos[5] = new Television(123, "negro", 'a', 23, 32, false);
		electrodomesticos[6] = new Electrodomestico(300, "blanco", 'a', 23);
		electrodomesticos[7] = new Lavadora(150, "azul", 'a', 567, 5);
		electrodomesticos[8] = new Television(500, "rojo", 'a', 300, 90, true);
		electrodomesticos[9] = new Electrodomestico(450, "gris", 'a', 400);

		// Bucle for que recorre todos los elementos de la tabla
		for (int i = 0; i < electrodomesticos.length; i++) {
			// Ejecutamos el método precioFinal() en cada posición de la tabla
			electrodomesticos[i].precioFinal();
			// Y luego mostramos el precio base de dicho objeto
			System.out.println(i+1 +"- Precio: "+ electrodomesticos[i].precioBase);

			// Si el objeto en el que nos encontramos es instancia de Electrodomestico
			if (electrodomesticos[i] instanceof Electrodomestico)
				// Incrementamos totalElectrodomesticos con su precio base
				totalElectrodomesticos += electrodomesticos[i].precioBase;
			// Si el objeto en el que nos encontramos es instancia de Lavadora
			if (electrodomesticos[i] instanceof Lavadora)
				// Incrementamos totalLavadoras con su precio base
				totalLavadoras += electrodomesticos[i].precioBase;
			// Si el objeto en el que nos encontramos es instancia de Television
			if (electrodomesticos[i] instanceof Television)
				// Incrementamos totalTelevisiones con su precio base
				totalTelevisiones += electrodomesticos[i].precioBase;
		}
		// Salto de línea
		System.out.println();

		// Mostramos los tres totales
		System.out.println("Precio total de los electrodomésticos: " + totalElectrodomesticos);
		System.out.println("Precio total de las lavadoras: " + totalLavadoras);
		System.out.println("Precio total de los televisores: " + totalTelevisiones);

	}

}
