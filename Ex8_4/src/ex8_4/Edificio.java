package ex8_4;

public abstract class Edificio {
	
	protected String nombre;
	protected int numeroPlantas;
	protected int superficie;
	
	public Edificio(String nombre, int numeroPlantas, int superficie) {
		this.nombre = nombre;
		this.numeroPlantas = numeroPlantas;
		this.superficie = superficie;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getNumPlantas() {
		return numeroPlantas;
	}
	public int getSuperficie() {
		return superficie;
	}

	abstract void calcularCosteVigilancia(int superficie);
	
	protected float limpiar(int superficie, int numPlantas) {
		this.superficie = superficie;
		float minutos = 0;
		minutos += superficie / 5;
		if (numPlantas > 1) {
			minutos += (numPlantas - 1) / 2;
		}
		System.out.println("El coste mensual de mantenimiento es: " + (minutos * 30) + "Euros");
		return minutos;
	}

	@Override
	public String toString() {
		return "Edificio\n[nombre=" + nombre + ", numeroPlantas=" + numeroPlantas + ", superficie=" + superficie + "]";
	}
	
	
	
}
