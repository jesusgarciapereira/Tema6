package interfaces.ejercicio02;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Futbolista futbolistas[] = new Futbolista[5];

		futbolistas[0] = new Futbolista(14, "Zacarías", 33, 6);
		futbolistas[1] = new Futbolista(67, "Edu", 23, 1);
		futbolistas[2] = new Futbolista(23, "Carmen", 13, 10);
		futbolistas[3] = new Futbolista(14, "Joaquín", 40, 3);
		futbolistas[4] = new Futbolista(1, "Bienve", 67, 0);

		System.out.println("LISTA DESORDENADA");
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista.toString());
		}

		System.out.println("LISTA ORDENADA");
		Arrays.sort(futbolistas);
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista.toString());
		}

	}

}
