package ex8_1;

import java.util.Scanner;

public class Ordenador {
	
	static Scanner sc = new Scanner(System.in);
	private String marca;
	private String modelo;
	private String procesador;
	private int capacidadRam;
	private int capacidadHdd;

	public Ordenador(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Ordenador(String marca, String modelo, String procesador, int capacidadRam, int capacidadHdd) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.capacidadRam = capacidadRam;
		this.capacidadHdd = capacidadHdd;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getCapacidadRam() {
		return capacidadRam;
	}

	public void setCapacidadRam(int capacidadRam) {
		this.capacidadRam = capacidadRam;
	}

	public int getCapacidadHdd() {
		return capacidadHdd;
	}

	public void setCapacidadHdd(int capacidadHdd) {
		this.capacidadHdd = capacidadHdd;
	}

	public void ejecutando(String programa) {
		System.out.println("En este momento se esta ejecutando " + programa);
	}
	
	public void modificarRam(Ordenador ordenador) {
		ordenador.getCapacidadRam();
		System.out.println("Introduzca cuanta RAM quiere");
		ordenador.setCapacidadRam(sc.nextInt());
		System.out.println(ordenador);
	}
	
	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", capacidadRam="
				+ capacidadRam + ", capacidadHdd=" + capacidadHdd + "]";
	}

}
