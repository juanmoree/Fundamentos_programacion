package ex8_4;

public class Edificio {
	
	protected String nombre;
	protected int numPlantas;
	protected int superficie;
	
	public String getNombre() {
		return nombre;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public int getSuperficie() {
		return superficie;
	}
	
	protected float limpiar(int superficie, int numPlantas) {
		this.superficie = superficie;
		float minutos = 0;
		minutos += superficie / 5;
		if (numPlantas > 1) {
			minutos += (numPlantas / 2) - 1;
		}
		System.out.println("El coste mensual de mantenimiento es: " + (minutos * 30) + "Euros");
		return minutos;
	}
	
}
