package ejercicio02;

public class Tecnico extends Operario {

	
	public Tecnico() {
		super();

	}

	public Tecnico(String nombre) {
		super(nombre);

	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += super.toString();
		cadena += " -> Operario";
		
		return cadena;
	}
}
