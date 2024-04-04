package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		
		// public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso)
		//public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga)
		// public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT)
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
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
			System.out.println(electrodomesticos[i].precioBase);
		}
		
	}

}
