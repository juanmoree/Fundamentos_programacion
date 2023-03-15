package ex8_4;

import java.util.ArrayList;

public class Hotel extends Edificio {

	private int numHabitaciones;
	ArrayList<Edificio> hoteles;

	public Hotel(String nombre, int numeroPlantas, int superficie, int numHabitaciones) {
		super(nombre, numeroPlantas, superficie);
		this.numHabitaciones = numHabitaciones;
		this.hoteles = new ArrayList<>();
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void agregarHotel(ArrayList<Edificio> hoteles, int numHabitaciones) {
		if (hoteles == null) {
			@SuppressWarnings("unused")
			Hotel hotel = new Hotel(nombre, numeroPlantas, superficie, numHabitaciones);
		} else {
			hoteles.add(new Hotel(nombre, numeroPlantas, superficie, numHabitaciones));
		}
	}

	public static void costeMantenimiento(int numHabitaciones) {
		int empleados = 1;
		int sueldo = 1000;
		while (numHabitaciones > 20) {
			empleados++;
			numHabitaciones -= 20;
		}
		System.out.println("Se necesitan: " + empleados + " personas para atender el hotel");
		System.out.println("El coste total es de: " + empleados * sueldo);
	}

	protected void calcularCosteVigilancia(int superficie) {
		superficie = getSuperficie();
		int vigilantes = 1;
		while (superficie > 1000) {
			vigilantes++;
			superficie -= 1000;
		}
		final int extraPeligrosidad = 500;
		System.out.println("El coste de vigilancia es de: " + (vigilantes * 1300) + (vigilantes * extraPeligrosidad)
				+ " Euros mensuales");
	}

	@Override
	public String toString() {
		return "\nHotel [" + "Nombre: " + super.nombre + ", Plantas: " + super.numeroPlantas + ", Superficie: "
				+ super.superficie + ", Habitaciones: " + numHabitaciones + "]";
	}

}
