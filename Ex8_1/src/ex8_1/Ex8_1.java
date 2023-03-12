package ex8_1;

import java.util.*;

public class Ex8_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Ordenador ordenador1 = new Ordenador("Dell", "Inspiron");
		Ordenador ordenador2 = new Ordenador("Hp", "Pavilion", "Intel Core i7", 8, 256);

		ordenador1.setProcesador("Intel core i5");
		ordenador1.setCapacidadRam(16);
		ordenador1.setCapacidadHdd(512);

		System.out.println(ordenador1);
		ordenador2.ejecutando("Teams");

		// ordenador1.modificarRam(ordenador1);

		ArrayList<Ordenador> ordenadores = new ArrayList<Ordenador>();
		ordenadores.add(ordenador1);
		ordenadores.add(ordenador2);

		Ordenador ordenador = buscarOrdenador(ordenadores);
		if (ordenador == null) {
			System.out.println("Ordenador no encontrado");
		} else
			System.out.println("Ordenador encontrado");

		for (int i = 0; i < 3; i++) {
			crearOrdenador(ordenadores);
		}

		for (int i = 0; i < ordenadores.size(); i++) {
			System.out.println(ordenadores.get(i).toString());
		}

	}

	private static Ordenador buscarOrdenador(ArrayList<Ordenador> ordenadores) {
		boolean encontrado = false;
		Ordenador ordenador = null;
		int i = 0;
		System.out.println("Introduce la marca");
		String marca = sc.nextLine();
		System.out.println("Introduce el modelo");
		String modelo = sc.nextLine();
		while (!encontrado && i < ordenadores.size()) {
			if (ordenadores.get(i).getMarca().equalsIgnoreCase(marca)
					&& ordenadores.get(i).getModelo().equalsIgnoreCase(modelo)) {
				encontrado = true;
				ordenador = ordenadores.get(i);
			} else
				encontrado = false;
			i++;
		}
		return ordenador;
	}

	private static void crearOrdenador(ArrayList<Ordenador> ordenadores) {
		System.out.println("Introduzca la marca");
		String marca = sc.nextLine();
		System.out.println("Introduzca el modelo");
		String modelo = sc.nextLine();
		System.out.println("Introduzca el procesador");
		String procesador = sc.nextLine();
		System.out.println("Introduzca la memoria ram");
		int ram = sc.nextInt();
		System.out.println("Introduzca la cantidad de disco duro");
		int hdd = sc.nextInt();
		sc.nextLine();

		Ordenador ordenador = new Ordenador(marca, modelo, procesador, ram, hdd);
		ordenadores.add(ordenador);
	}

}
