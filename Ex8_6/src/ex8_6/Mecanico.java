package ex8_6;

public class Mecanico extends Trabajador {
	private boolean tieneEstudio;

	public Mecanico(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
	}

	public boolean isTieneEstudio() {
		return tieneEstudio;
	}

	public void setTieneEstudio(boolean tieneEstudio) {
		this.tieneEstudio = tieneEstudio;
	}

	@Override
	void calcularSueldo() {
		int total;
		int contador = 0;
		while (super.antiguedad > 0) {
			contador++;
			super.antiguedad--;
		}
		total = super.sueldoBase + (contador * 10000);
		System.out.println("Sueldo total: " + total);
	}

	@Override
	public String toString() {
		return "Mecanico " + super.nombre + " " + super.apellido + "[tieneEstudio=" + tieneEstudio + "]";
	}
}
