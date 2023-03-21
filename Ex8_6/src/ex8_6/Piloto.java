package ex8_6;

public class Piloto extends Trabajador {
	private float altura;
	private float peso;
	private final int plusPeligrosidad = 50000;

	public Piloto(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
	}

	public Piloto(String nombre, String apellido, int edad, float altura) {
		super(nombre, apellido, edad);
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getPlusPeligrosidad() {
		return plusPeligrosidad;
	}

	public float getAltura() {
		return altura;
	}

	@Override
	void calcularSueldo() {
		int total;
		int contador = 0;
		while (super.antiguedad > 0) {
			contador++;
			super.antiguedad--;
		}
		total = super.sueldoBase + (contador * 10000) + plusPeligrosidad;
		System.out.println("Sueldo total: " + total);
	}

	@Override
	public String toString() {
		return "Piloto [Nombre=" + super.nombre + ", Apellido=" + super.apellido + ", Edad=" + super.edad + ", Altura="
				+ altura + "]";
	}

}
