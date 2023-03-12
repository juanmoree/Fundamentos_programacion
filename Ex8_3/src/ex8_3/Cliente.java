package ex8_3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	// Preguntar si se puede inicializar
	private ArrayList<Cuenta> cuentas;

	public Cliente(ArrayList<Cuenta> cuentas) {
		this.cuentas = new ArrayList<>();
	}

	public Cliente(String nombre, String apellido, ArrayList<Cuenta> cuentas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = cuentas;
	}

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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

	public void agregarCuenta(ArrayList<Cuenta> cuentas, int numCuenta) {
		// cuentas = new ArrayList<Cuenta>();
		// Cuenta cuenta1 = new Cuenta(numCuenta);
		if (this.cuentas == null) {
			Cuenta cuenta1 = new Cuenta(numCuenta);
			cuentas = new ArrayList<>();
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
