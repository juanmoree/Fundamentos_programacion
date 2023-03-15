package ex8_4;

import java.util.ArrayList;

public class Hospital extends Edificio {

	private static int numEnfermos;
	private final static int numRaciones = 3;
	ArrayList<Edificio> hospitales;

	public Hospital(String nombre, int numeroPlantas, int superficie, int numEnfermos) {
		super(nombre, numeroPlantas, superficie);
		Hospital.numEnfermos = numEnfermos;
		this.hospitales = new ArrayList<>();
	}

	public int getNumEnfermos() {
		return numEnfermos;
	}

	public void setNumEnfermos(int numEnfermos) {
		Hospital.numEnfermos = numEnfermos;
	}

	public static void repartirAlmuerzo() {
		System.out.println("Se están repartiendo " + numEnfermos * numRaciones + " raciones");
	}

	public void agregarHospital(ArrayList<Edificio> hospitales, int numEnfermos) {
		if (hospitales == null) {
			@SuppressWarnings("unused")
			Hospital hospital = new Hospital(nombre, numeroPlantas, superficie, numEnfermos);
		} else {
			hospitales.add(new Hospital(nombre, numeroPlantas, superficie, numEnfermos));
		}
	}

	protected void calcularCosteVigilancia(int superficie) {
		superficie = getSuperficie();
		int vigilantes = 1;
		while (superficie > 1000) {
			vigilantes++;
			superficie -= 1000;
		}
		System.out.println("El coste de vigilancia es de: " + (vigilantes * 1300) + " Euros mensuales");
	}

	@Override
	public String toString() {
		return "\nHospital [" + "Nombre: " + super.nombre + ", Plantas: " + super.numeroPlantas + ", Superficie: "
				+ super.superficie + ", Pacientes: " + numEnfermos + "]";
	}

}
