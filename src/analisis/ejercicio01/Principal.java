package analisis.ejercicio01;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double velocidadPedida;
		int tiempoPedido;
		int gato;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		Random r = new Random();

		gato = r.nextInt(100) + 1;

		Turismo t1 = new Turismo("Renault", "Megane", "Rojo", "1234-ABC", false, 0, 0, 4, "Particular");

		t1.arrancar();

		System.out.println("¿A qué velocidad desea ir?");

		velocidadPedida = sc.nextDouble();

		t1.acelerar(velocidadPedida);

		System.out.println("¿Cuánto tiempo desea ir a esta velocidad");
		tiempoPedido = sc.nextInt();

		if (gato <= 10) {
			System.out.println("Se nos ha cruzado un gato");
			t1.parar();
			
		} else {
			t1.mantenerVelocidad(tiempoPedido);
			
			t1.frenar();

			t1.parar();
		}
		
		sc.close();
	}

}
