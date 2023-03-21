package ex8_4;

public abstract class Edificio {
	
	protected String nombre;
	protected static int numeroPlantas;
	protected static int superficie;
	
	public Edificio(String nombre, int numeroPlantas, int superficie) {
		this.nombre = nombre;
		Edificio.numeroPlantas = numeroPlantas;
		Edificio.superficie = superficie;
	}
	
	public String getNombre() {
		return nombre;
	}
	public static int getNumPlantas() {
		return numeroPlantas;
	}
	public static int getSuperficie() {
		return superficie;
	}

	abstract void calcularCosteVigilancia(int superficie);
	
	protected float limpiar(int superficie, int numPlantas) {
		Edificio.superficie = superficie;
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
