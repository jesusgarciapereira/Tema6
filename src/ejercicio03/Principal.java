package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		Producto p1 = new Producto("Plátano" , 2.45);
		Producto p2 = new Producto("Manzana" , 1.56);
		System.out.println(p1);
		System.out.println(p1.calcular(10));
		
		System.out.println(p2);
		
		Perecedero p3 = new Perecedero ("Yogur", 2.34, 1);
		System.out.println(p3);
		System.out.println(p3.calcular(1));
		
		NoPerecedero p4 = new NoPerecedero ("Action Man", 29.99, "Juguete" );
		System.out.println(p4);
	}

}
