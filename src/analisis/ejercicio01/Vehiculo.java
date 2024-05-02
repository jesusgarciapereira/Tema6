package analisis.ejercicio01;

/**
 * clase que representa a cada Vehiculo
 */
public class Vehiculo {

	/**
	 * Marca del Vehiculo
	 */
	private String marca = "";

	/**
	 * Modelo del Vehiculo
	 */
	private String modelo = "";

	/**
	 * Color del Vehiculo
	 */
	private String color = "";

	/**
	 * Matricula del Vehiculo
	 */
	private String matricula = "";

	/**
	 * Indicador de si el motor esta encendido
	 */
	private boolean motorEncendido;

	/**
	 * Marcha actual del Vehiculo. Inicializado en 0 quiere decir punto muerto
	 */
	private int marchaActual;

	/**
	 * Velocidad actual del Vehiculo
	 */
	private double velocidadActual;

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param marca           Marca del Vehiculo
	 * @param modelo          Modelo del Vehiculo
	 * @param color           Color del Vehiculo
	 * @param matricula       Matricula del Vehiculo
	 * @param motorEncendido  Indicador de si el motor esta encendido
	 * @param marchaActual    Marcha actual del Vehiculo
	 * @param velocidadActual Velocidad actual del Vehiculo
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula, boolean motorEncendido,
			int marchaActual, double velocidadActual) {

		// La marca, el modelo, el color y la matrícula sólo admitiran valores
		// distintos de null y de cadena vacía
		if (marca != null && !marca.equals(""))
			this.marca = marca;
		if (modelo != null && !modelo.equals(""))
			this.modelo = modelo;
		if (color != null && !color.equals(""))
			this.color = color;
		if (matricula != null && !matricula.equals(""))
			this.matricula = matricula;

		this.motorEncendido = motorEncendido;

		// La marcha actual sólo admitirá valores mayores o igual que 0
		if (marchaActual >= 0)
			this.marchaActual = marchaActual;
		// La velocidad actual sólo admitirá valores mayores o igual que 0
		if (velocidadActual >= 0)
			this.velocidadActual = velocidadActual;
	}

	/**
	 * Funcion que modifica el valor de motorEncendido
	 * 
	 * @param motorEncendido Nuevo indicador de si el motor esta encendido
	 */
	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}

	/**
	 * Funcion que modifica el valor de marchaActual
	 * 
	 * @param marchaActual Nueva marcha actual del Vehiculo
	 */
	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	/**
	 * Funcion que para el Vehiculo, parando el motor
	 */
	public void parar() {
		// Asigna 0 a la marcha actual del Vehiculo
		this.marchaActual = 0;
		// Asigna 0 a la velocidad actual del Vehiculo
		this.velocidadActual = 0;
		// Asigna false al motor encendido del Vehiculo
		this.motorEncendido = false;

	}

	/**
	 * Funcion que arranca el Vehiculo, encendiendo el motor
	 */
	public void arrancar() {
		// Asigna false al motor encendido del Vehiculo
		this.motorEncendido = true;
	}

	/**
	 * Funcion que acelera el Vehiculo
	 * 
	 * @param velocidad Velocidad indicada a la que se desea ir
	 */
	public void acelerar(double velocidad) {

		// Mientras la velocidad actual del coche sea menor que la velocidad indicada en
		// el parámetro
		while (this.velocidadActual < velocidad) {
			// Se incrementa la velocidad actual
			this.velocidadActual++;
			// Se llama a la función cambiarMarcha() en cada iteración del bucle
			cambiarMarcha();
		}

	}

	/**
	 * Funcion que frena el Vehiculo
	 * 
	 * @param velocidad Velocidad indicada a la que se desea ir
	 */
	public void frenar(double velocidad) {

		// Mientras la velocidad actual del coche sea mayor que la velocidad indicada en
		// el parámetro
		while (this.velocidadActual > velocidad) {
			// Se decrementa la velocidad actual
			this.velocidadActual--;
			// Se llama a la función cambiarMarcha() en cada iteración del bucle
			cambiarMarcha();
		}

	}

	/**
	 * Funcion que mantiene la velocidad del Vehiculo el tiempo indicado en el parametro
	 * 
	 * @param tiempo Tiempo indicado que mantendra el Vehiculo su velocidad
	 */
	public void mantenerVelocidad(int tiempo) {
		System.out
				.println("El Vehículo irá a la velocidad " + this.velocidadActual + " durante " + tiempo + " segundos");
	}

	/**
	 * Funcion que modifica la marcha actial del Vehiculo
	 */
	private void cambiarMarcha() {
		// El valor asignado a marchaActual dependerá de la velocidad del coche en cada
		// momento
		if (this.velocidadActual >= 0 && this.velocidadActual <= 30)
			this.marchaActual = 1;
		else if (this.velocidadActual >= 31 && this.velocidadActual <= 50)
			this.marchaActual = 2;
		else if (this.velocidadActual >= 51 && this.velocidadActual <= 70)
			this.marchaActual = 3;
		else if (this.velocidadActual >= 71 && this.velocidadActual <= 100)
			this.marchaActual = 4;
		else
			this.marchaActual = 5;

	}

}
