package ejercicio02;

public class Oficial extends Operario {

	


	public Oficial() {
		super();

	}

	public Oficial(String nombre) {
		super(nombre);

	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += super.toString();
		cadena += " -> Oficial";
		
		return cadena;
	}
}