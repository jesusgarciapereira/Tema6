package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		Hora h1 = new Hora(9, 59);

		System.out.println(h1);

		h1.inc();

		System.out.println(h1);


		System.out.println(h1.setMinutos(59) ? "Minuto modificado" : "No se pueden modificar los minutos");
		System.out.println(h1.setHora(3) ? "Hora modificada" : "No se pueden modificar las horas");

		System.out.println(h1);

		h1.inc();

		System.out.println(h1);

		HoraExacta h2 = new HoraExacta(9, 59, 45);

		System.out.println(h2);

		h2.inc();

		System.out.println(h2);

		System.out.println(h2.setHora(23) ? "Hora modificada" : "No se pueden modificar las horas");
		System.out.println(h2.setSegundo(59) ? "Segundo modificado" : "No se pueden modificar los minutos");

		System.out.println(h2);

		h2.inc();

		System.out.println(h2);
	}

}
