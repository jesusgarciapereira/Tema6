package interfaces.ejercicio01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Socio socios[] = new Socio[10];
		
		socios[0] = new Socio(33, "Jesús", 33);
		socios[1] = new Socio(67, "Edu", 23);
		socios[2] = new Socio(23, "Carmen", 13);
		socios[3] = new Socio(14, "Joaquín", 40);
		socios[4] = new Socio(1, "Bienve", 67);
		socios[5] = new Socio(6784, "Paco", 54);
		socios[6] = new Socio(234, "Isla", 25);
		socios[7] = new Socio(22, "Lourdes", 36);
		socios[8] = new Socio(898, "Serafín", 66);
		socios[9] = new Socio(99, "Bonifacio", 97);
		
		System.out.println("LISTA DESORDENADA");
		for (Socio socio : socios) {
			System.out.println(socio.toString());
		}
		
		System.out.println("LISTA ORDENADA");
		Arrays.sort(socios);
		for (Socio socio : socios) {
			System.out.println(socio.toString());
		}
		

	}

}
