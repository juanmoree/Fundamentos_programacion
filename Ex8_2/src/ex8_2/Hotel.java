package ex8_2;

public class Hotel {
	private String nombre;
	private int numHabs;
	private int numPlants;
	private int superficie;

	public Hotel(String nombre, int numHabs, int numPlants, int superficie) {
		super();
		this.nombre = nombre;
		this.numHabs = numHabs;
		this.numPlants = numPlants;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumHabs() {
		return numHabs;
	}

	public void setNumHabs(int numHabs) {
		this.numHabs = numHabs;
	}

	public int getNumPlants() {
		return numPlants;
	}

	public void setNumPlants(int numPlants) {
		this.numPlants = numPlants;
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public void calcularMantenimiento() {
		int empleados = 0;
		int costeMantenimiento = 1500;
		for (int i = 0; i < numHabs; i += 20) {
			empleados++;
		}
		costeMantenimiento *= empleados;
		System.out.println("El numero necesario de empleados es: " + empleados + " y el coste es de: "
				+ costeMantenimiento + " Eur");
	}

	@Override
	public String toString() {
		return "\nHotel [nombre=" + nombre + ", numHabs=" + numHabs + ", numPlants=" + numPlants + ", superficie="
				+ superficie + "]";
	}

}
