package ejercicio05;

/**
 * Clase abstracta que representa a los triangulos
 */
public class Triangulo extends Poligono {

	/**
	 * Longitud del primer lado del triangulo
	 */
	private double lado1;
	/**
	 * Longitud del segundo lado del triangulo
	 */
	private double lado2;
	/**
	 * Longitud del tercer lado del triangulo
	 */
	private double lado3;

	/**
	 * Constructor sin parametros
	 */
	public Triangulo() {
		// Llama al constructor del padre con 3 como parámetro
		super(3);
	}

	/**
	 * Constructor con todos los atributos (incluido el del padre) como parametro
	 * 
	 * @param numeroLados Numero de lados del triangulo
	 * @param lado1       Longitud del primer lado del triangulo
	 * @param lado2       Longitud del segundo lado del triangulo
	 * @param lado3       Longitud del tercer lado del triangulo
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		// Llama al constructor del padre con 3 como parámetro
		super(3);
		// Los tres lados sólo admitirán valores mayores que 0
		if (lado1 > 0)
			this.lado1 = lado1;
		if (lado2 > 0)
			this.lado2 = lado2;
		if (lado3 > 0)
			this.lado3 = lado3;
	}

	/**
	 * Funcion que devuelve la longitud del primer lado del triangulo
	 * 
	 * @return Longitud del primer lado del triangulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Funcion que modifica la longitud del primer lado del triangulo por el valor
	 * introducido en el parametro
	 * 
	 * @param lado1 Nueva longitud del primer lado del triangulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Funcion que devuelve la longitud del segundo lado del triangulo
	 * 
	 * @return Longitud del segundo lado del triangulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Funcion que modifica la longitud del segundo lado del triangulo por el valor
	 * introducido en el parametro
	 * 
	 * @param lado2 Nueva longitud del segundo lado del triangulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Funcion que devuelve la longitud del tercer lado del triangulo
	 * 
	 * @return Longitud del tercer lado del triangulo
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Funcion que modifica la longitud del tercer lado del triangulo por el valor
	 * introducido en el parametro
	 * 
	 * @param lado3 Nueva longitud del tercer lado del triangulo
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Metodo area() sobreescrito
	 */
	@Override
	public double area() {
		// Resultado que devolverá la función
		double resultado;

		// Aplicamos la fórumla de Herón, primero calculando el semiplano
		double semiplano = (this.lado1 + this.lado2 + this.lado3) / 2;
		// Y luego asignamos esta fórmula al resultado del área
		resultado = Math
				.sqrt(semiplano * (semiplano - this.lado1) * (semiplano - this.lado2) * (semiplano - this.lado3));

		// Devolverá el resultado de la fórmula
		return resultado;
	}

	/**
	 * Metodo toString sobreescrito
	 */
	@Override
	public String toString() {
		// Cadena que devolverá la función
		String cadena = "------------------\n";
		// Le concatenamos los datos que mostrará
		cadena += "Tipo: Triángulo\n";
		cadena += "Lado1: " + lado1 + "\n";
		cadena += "Lado1: " + lado2 + "\n";
		cadena += "Lado1: " + lado3 + "\n";

		// Devolverá la cadena de texto que hemos construido
		return cadena;
	}

}
