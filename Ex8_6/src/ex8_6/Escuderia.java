package ex8_6;

import java.util.ArrayList;

public class Escuderia {
	private String nombre;
	private int presupuesto;
	private String pais;
	private ArrayList<Coche> coches;
	private ArrayList<Trabajador> trabajadores;
	
	
	
	public Escuderia(String nombre, int presupuesto, String pais) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.pais = pais;
		this.coches = new ArrayList<>();
		this.trabajadores = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public ArrayList<Coche> getCoches() {
		return coches;
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}
	
	@Override
	public String toString() {
		return "Escuderia [nombre=" + nombre + ", presupuesto=" + presupuesto + ", pais=" + pais + "]";
	}
}
