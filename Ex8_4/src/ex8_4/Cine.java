package ex8_4;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Cine extends Edificio {

	private float precioEntrada;
	private int numAsistentes;
	private static int aforoTotal;
	@SuppressWarnings("unused")
	private ArrayList<Edificio> cines;

	public Cine(String nombre, int numeroPlantas, int superficie, int aforoTotal) {
		super(nombre, numeroPlantas, superficie);
		Cine.aforoTotal = aforoTotal;
		this.cines = new ArrayList<>();
	}

	public float getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(float precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public int getNumAsistentes() {
		return numAsistentes;
	}

	public void setNumAsistentes(int numAsistentes) {
		this.numAsistentes = numAsistentes;
	}

	public int getAforoTotal() {
		return aforoTotal;
	}

	public void setAforoTotal(int aforoTotal) {
		Cine.aforoTotal = aforoTotal;
	}

	public void agregarCine(ArrayList<Edificio> cines, int aforoTotal) {
		if (cines == null) {
			@SuppressWarnings("unused")
			Cine cine = new Cine(nombre, numeroPlantas, superficie, aforoTotal);
		} else {
			cines.add(new Hospital(nombre, numeroPlantas, superficie, aforoTotal));
		}
	}

	public static float proyectarSesion(float precioEntrada, int numAsistentes) {
		float recaudacion = 0;
		if (numAsistentes <= aforoTotal) {
			recaudacion = precioEntrada * numAsistentes;
			System.out.println("La recaudación total es de: " + recaudacion + " Euros");
		} else {
			System.out.println("Los asistentes no caben en la sala");
		}
		return recaudacion;
	}

	protected void calcularCosteVigilancia(int superficie) {
		superficie = getSuperficie();
		int vigilantes = 1;
		while (superficie > 3000) {
			vigilantes++;
			superficie -= 3000;
		}
		System.out.println("El coste de vigilancia es de: " + (vigilantes * 1300) + " Euros mensuales");
	}

	@Override
	public String toString() {
		return "\nCine [" + "Nombre: " + super.nombre + ", Plantas: " + super.numeroPlantas + ", Superficie: "
				+ super.superficie + ", Aforo: " + aforoTotal + "]";
	}

}
