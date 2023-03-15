package ex8_3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> cuentas;

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = new ArrayList<>();
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

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	@SuppressWarnings("null")
	public void agregarCuenta(ArrayList<Cuenta> cuentas, int numCuenta) {
		if (cuentas == null) {
			Cuenta cuenta1 = new Cuenta(numCuenta);
			cuentas.add(cuenta1);
		} else {
			cuentas.add(new Cuenta(numCuenta));
		}
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
