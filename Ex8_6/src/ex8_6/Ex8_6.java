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

		Coche coche = new Coche(200, 300, "Rojo");
		ferrari.getCoches().add(coche);
		Coche coche2 = new Coche(100, 150, "Verde");
		ferrari.getCoches().add(coche2);

		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				darAltaTrabajador(escuderias);
				break;
			case 2:
				darBajaTrabajador(escuderias);
				break;
			case 3:
				verTrabajador(escuderias);
				break;
			case 4:
				verEscuderias(escuderias);
				break;
			case 5:
				verBolidos(escuderias);
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
	}

	private static void verTrabajador(ArrayList<Escuderia> escuderias) {
		System.out.println("¿Mecánico o Piloto?");
		String eleccion = sc.nextLine();
		char primer = eleccion.charAt(0);

		if (primer == 'p') {
			verPilotos(escuderias);
		} else if (primer == 'm') {
			verMecanicos(escuderias);
		} else {
			System.out.println("No tenemos ese tipo de trabajador");
		}
	}

	private static void darBajaTrabajador(ArrayList<Escuderia> escuderias) {
		System.out.println("¿Mecánico o Piloto?");
		String eleccion = sc.nextLine();
		char primer = eleccion.charAt(0);

		if (primer == 'p') {
			darBajaPilotos(escuderias);
		} else if (primer == 'm') {
			darBajaMecanicos(escuderias);
		} else {
			System.out.println("No tenemos ese tipo de trabajador");
		}
	}

	private static void darAltaTrabajador(ArrayList<Escuderia> escuderias) {
		System.out.println("¿Mecánico o Piloto?");
		String eleccion = sc.nextLine();
		char primer = eleccion.charAt(0);

		if (primer == 'p') {
			darAltaPilotos(escuderias);
		} else if (primer == 'm') {
			darAltaMecanicos(escuderias);
		} else {
			System.out.println("No tenemos ese tipo de trabajador");
		}

	}

	private static void verBolidos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			for (Coche coche : escuderia.getCoches()) {
				System.out.println(coche);
			}
		} else {
			System.out.println("Esa escuderia no existe");
		}

	}

	private static void verEscuderias(ArrayList<Escuderia> escuderias) {

		for (Escuderia escuderia : escuderias) {
			System.out.println(escuderia);
		}
	}

	private static void verMecanicos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			for (Trabajador mecanico : escuderia.getTrabajadores()) {
				if (mecanico instanceof Mecanico) {
					System.out.println(mecanico);
				}
			}
		} else {
			System.out.println("Esa escuderia no existe");
		}

	}

	private static void darBajaMecanicos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			Mecanico mecanico = null;
			System.out.println("Introduzca nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduzca apellido");
			String apellido = sc.nextLine();
			mecanico = busquedaMecanico(escuderia, nombre, apellido);

			if (mecanico != null) {
				System.out.println("El " + mecanico + " ha sido dado de baja");
				escuderia.getTrabajadores().remove(mecanico);
			} else {
				System.out.println("El mecanico " + nombre + " " + apellido + " no está dado de alta");
			}
		} else {
			System.out.println("Esa escuderia no existe");
		}
	}

	private static void darAltaMecanicos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			Mecanico mecanico = null;
			System.out.println("Introduzca nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduzca apellido");
			String apellido = sc.nextLine();
			mecanico = busquedaMecanico(escuderia, nombre, apellido);
			if (mecanico == null) {
				System.out.println("Introduzca la edad");
				int edad = sc.nextInt();
				sc.nextLine();
				escuderia.getTrabajadores().add(new Mecanico(nombre, apellido, edad));
				System.out.println("El mecanico " + nombre + " " + apellido + " ha sido dado de alta correctamente");
				// verMecanicos(escuderias);
			}
		}

	}

	private static Mecanico busquedaMecanico(Escuderia escuderia, String nombre, String apellido) {
		int i = 0;
		boolean encontrado = false;
		Mecanico mecanico = null;
		while (!encontrado && i < escuderia.getTrabajadores().size()) {
			if (escuderia.getTrabajadores().get(i).nombre.equalsIgnoreCase(nombre)
					&& escuderia.getTrabajadores().get(i).apellido.equalsIgnoreCase(apellido)) {
				encontrado = true;
				mecanico = (Mecanico) escuderia.getTrabajadores().get(i);
				System.out.println("El mecanico " + nombre + " " + apellido + " ya está dado de alta");
			} else {
				i++;
			}
		}
		return mecanico;
	}

	private static void verPilotos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			for (Trabajador piloto : escuderia.getTrabajadores()) {
				if (piloto instanceof Piloto) {
					System.out.println(piloto);
				}
			}
		} else {
			System.out.println("Esa escuderia no existe");
		}
	}

	private static void darBajaPilotos(ArrayList<Escuderia> escuderias) {
		Escuderia escuderia = null;
		escuderia = busquedaEscuderia(escuderias);

		if (escuderia != null) {
			Piloto piloto = null;
			System.out.println("Introduzca nombre");
			String nombre = sc.nextLine();
			System.out.println("Introduzca apellido");
			String apellido = sc.nextLine();
			piloto = busquedaPiloto(escuderia, nombre, apellido);
			if (piloto != null) {
				System.out.println("El " + piloto + " ha sido dado de baja");
				escuderia.getTrabajadores().remove(piloto);
				// System.out.println("El piloto " + piloto + " ha sido dado de baja");
			} else {
				System.out.println("El piloto " + nombre + " " + apellido + " no está dado de alta");
			}
		} else {
			System.out.println("Esa escuderia no existe");
		}
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
				// verPilotos(escuderias);
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
				System.out.println("El piloto " + nombre + " " + apellido + " ya está dado de alta");
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
		final byte MAXIMO = 5;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Dar de alta Trabajador.");
			System.out.println("2. Dar de baja Trabajador.");
			System.out.println("3. Ver Trabajador(es).");
			System.out.println("4. Ver Escuderias");
			System.out.println("5. Ver Bólidos");
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