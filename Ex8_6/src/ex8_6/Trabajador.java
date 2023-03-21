package ex8_6;

import java.util.ArrayList;

public abstract class Trabajador {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected int antiguedad;
	protected final int sueldoBase = 50000;
	protected int sueldo;
	protected static ArrayList<Piloto> pilotos;
	protected static ArrayList<Mecanico> mecanicos;
	
	public Trabajador(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		Trabajador.pilotos = new ArrayList<>();
		Trabajador.mecanicos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getEdad() {
		return edad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	abstract void calcularSueldo();

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", antiguedad="
				+ antiguedad + ", sueldoBase=" + sueldoBase + ", sueldo=" + sueldo + "]";
	}
	
}
