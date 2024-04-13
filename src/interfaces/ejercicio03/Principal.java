package interfaces.ejercicio03;

public class Principal {

	public static void main(String[] args) {
		Perro p1 = new Perro("Toby", "Pastor alemán", 24.5, "Negro");
		Gato g1 = new Gato("Coco", "Siamés", 4.6, "Blanco");
		
		p1.comer();
		g1.comer();
		
		p1.dormir();
		g1.dormir();
		
		p1.hacerRuido();
		g1.hacerRuido();
		
		p1.vacunar();
		g1.vacunar();
		
		System.out.println(p1.nombre + " " + (p1.hacerCaso() ? "" : "no ") + "te ha hecho caso");
		System.out.println(g1.nombre + " " + (g1.hacerCaso() ? "" : "no ") + "te ha hecho caso");
		
		p1.sacarPaseo();
		g1.toserBolaPelo();

	}

}
