package ex8_6;

import java.util.*;

public class Ex8_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Escuderia> escuderias = new ArrayList<Escuderia>();
		Escuderia ferrari = new Escuderia("Ferrari", 1000000, "Italia");
		Escuderia redBull = new Escuderia("Red Bull", 2000000, "Inglaterra");
		Escuderia mcLaren = new Escuderia("McLaren", 2500000, "Austria");
		escuderias.add(ferrari);
		escuderias.add(redBull);
		escuderias.add(mcLaren);

		Piloto piloto1 = new Piloto("Michael", "Schumacher", 45, 1.82f);
		ferrari.getTrabajadores().add(piloto1);
		Mecanico mecanico1 = new Mecanico("Carlos", "Carvalho", 33);
		ferrari.getTrabajadores().add(mecanico1);
		Piloto piloto2 = new Piloto("Max", "Verstappen", 30, 1.67f);
		redBull.getTrabajadores().add(piloto2);
		Mecanico mecanico2 = new Mecanico("Juan", "Rosich", 19);
		redBull.getTrabajadores().add(mecanico2);
		Piloto piloto3 = new Piloto("Daniel", "Ricciardo", 27, 1.70f);
		mcLaren.getTrabajadores().add(piloto3);
		Mecanico mecanico3 = new Mecanico("Miles", "Bachmann", 33);
		mcLaren.getTrabajadores().add(mecanico3);

		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				darAltaPilotos(escuderias);
				break;
			case 2:
				// xxx
				break;
			case 3:
				// xxx
				break;
			case 4:
				// mostrarEdificios(edificios);
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
	}

	private static void darAltaPilotos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			Piloto piloto = null;
			System.out.println("Introduzca nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduzca apellido");
			String apellido = sc.nextLine();
			piloto = busquedaPiloto(escuderia, nombre, apellido);
			if (piloto == null) {
				System.out.println("Introduzca la edad");
				int edad = sc.nextInt();
				System.out.println("Introduzca la altura");
				float altura = sc.nextFloat();
				sc.nextLine();
				escuderia.getTrabajadores().add(new Piloto(nombre, apellido, edad, altura));
				System.out.println("El piloto " + nombre + " " + apellido + " ha sido dado de alta correctamente");
				System.out.println(escuderia.getTrabajadores());
			}
		} else {
			System.out.println("Esa escuderia no existe");
		}
	}

	private static Piloto busquedaPiloto(Escuderia escuderia, String nombre, String apellido) {
		int i = 0;
		boolean encontrado = false;
		Piloto piloto = null;
		while (!encontrado && i < escuderia.getTrabajadores().size()) {
			if (escuderia.getTrabajadores().get(i).nombre.equalsIgnoreCase(nombre)
					&& escuderia.getTrabajadores().get(i).apellido.equalsIgnoreCase(apellido)) {
				encontrado = true;
				piloto = (Piloto) escuderia.getTrabajadores().get(i);
				System.out.println("El piloto " + nombre + apellido + " ya está dado de alta");
			} else {
				i++;
			}
		}
		return piloto;
	}

	private static Escuderia busquedaEscuderia(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		boolean encontrado = false;
		int i = 0;
		System.out.println("Introduzca la escuderia");
		String nombreEscuderia = sc.nextLine();
		while (!encontrado && i < escuderias.size()) {
			if (nombreEscuderia.equalsIgnoreCase(escuderias.get(i).getNombre())) {
				encontrado = true;
				escuderia = escuderias.get(i);
			} else {
				i++;
			}
		}
		return escuderia;
	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Dar de alta Piloto.");
			System.out.println("2. Dar de alta Mecánico.");
			System.out.println("3. Eliminar edificios.");
			System.out.println("4. Mostrar edificios.");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoge una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

}
