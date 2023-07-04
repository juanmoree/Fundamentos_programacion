package extra8_2;

public class Espectador {
	private String nombre;
	private int edad;
	private float dinero;
	
	public Espectador(String nombre, int edad, float dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public float getDinero() {
		return dinero;
	}

	@Override
	public String toString() {
		return "Espectador [Nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	
}
