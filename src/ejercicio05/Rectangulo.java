package ejercicio05;

public class Rectangulo extends Poligono {

	/**
	 * Longitud del lado largo del rectangulo
	 */
	private double lado1;
	/**
	 * Longitud del lado ancho del rectangulo
	 */
	private double lado2;

	/**
	 * Constructor sin parametros
	 */
	public Rectangulo() {
		// Llama al constructor del padre con 4 como parámetro
		super(4);
	}

	/**
	 * Constructor con todos los atributos (incluido el del padre) como parametro
	 * 
	 * @param numeroLados Numero de lados del rectangulo
	 * @param lado1       Longitud del lado largo del rectangulo
	 * @param lado2       Longitud del lado ancho del rectangulo
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		// Llama al constructor del padre con 4 como parámetro
		super(4);
		// El lado largo sólo admitirá valores mayores que 0
		if (lado1 > 0)
			this.lado1 = lado1;
		// El lado ancho sólo admitirá valores mayores que 0 y distintos al del lado
		// largo
		if (lado2 > 0 && lado2 != lado1)
			this.lado2 = lado2;
	}

	/**
	 * Funcion que devuelve la longitud del lado largo del rectangulo
	 * 
	 * @return Longitud del lado largo del rectangulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Funcion que modifica la longitud del lado largo del rectangulo por el valor
	 * introducido en el parametro
	 * 
	 * @param lado1 Nueva longitud del lado largo del rectangulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Funcion que devuelve la longitud del lado ancho del rectangulo
	 * 
	 * @return Longitud del lado ancho del rectangulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Funcion que modifica la longitud del lado ancho del rectangulo por el valor
	 * introducido en el parametro
	 * 
	 * @param lado2 Nueva longitud del lado ancho del rectangulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Metodo area() sobreescrito
	 */
	@Override
	public double area() {
		// Resultado que devolverá la función
		double resultado;

		// Le asignamos la fórmula
		resultado = this.lado1 * this.lado2;

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
		cadena += "Tipo: Rectángulo\n";
		cadena += "Lado largo: " + this.lado1 + "\n";
		cadena += "Lado ancho: " + this.lado2;

		// Devolverá la cadena de texto que hemos construido
		return cadena;
	}

}
