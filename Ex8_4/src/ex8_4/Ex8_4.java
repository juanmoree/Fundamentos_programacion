package ex8_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<>();
		Edificio hotel1 = new Hotel("pepita", 10, 3055, 19);
		Edificio hospital1 = new Hospital("pepita", 10, 3055, 19);
		Edificio cine1 = new Cine("pepito", 10, 3055, 19);

		edificios.add(hotel1);
		edificios.add(hospital1);
		edificios.add(cine1);

		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				System.out.println("Ingrese nombre");
				String nombre = sc.nextLine();
				System.out.println("¿Qué edificio quiere dar de alta?\n1. Hotel\n2. Hospital\n3. Cine");
				int opcion = sc.nextInt();
				sc.nextLine();
				darAltaEdificio(edificios, opcion, nombre);
				break;
			case 2:
				System.out.println("¿Qué tipo de edificio quiere ver?\n1. Hotel\n2. Hospital\n3. Cine");
				int opcion1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el nombre");
				String nombre1 = sc.nextLine();
				Edificio edificio1 = busqueda(edificios, opcion1, nombre1);
				if (edificio1 == null) {
					System.out.println("No existe el edificio con el nombre " + nombre1);
				} else {
					mostrarEdificio(edificios, edificio1);
				}
				break;
			case 3:
				System.out.println("Elija el tipo de edificio a eliminar:\n1. Hotel\n2. Hospital\n3. Cine");
				int opcion2 = sc.nextInt();
				sc.nextLine();
				eliminarEdificio(edificios, opcion2);
				break;
			case 4:
				mostrarEdificios(edificios);
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
		System.out.println(edificios);

	}

	public static void darAltaEdificio(ArrayList<Edificio> edificios, int opcion, String nombre) {
		ArrayList<Integer> datos;
		Edificio edificio = busqueda(edificios, opcion, nombre);
		if (edificio == null)
			switch (opcion) {
			case 1:
				datos = datosEdificio();
				System.out.println("Ingrese número de habitaciones");
				int habitaciones = sc.nextInt();
				Hotel hotel = new Hotel(nombre, datos.get(0), datos.get(1), habitaciones);
				edificios.add(hotel);
				break;
			case 2:
				datos = datosEdificio();
				System.out.println("Ingrese número de pacientes");
				int pacientes = sc.nextInt();
				Hospital hospital = new Hospital(nombre, datos.get(0), datos.get(1), pacientes);
				edificios.add(hospital);
				break;
			case 3:
				datos = datosEdificio();
				System.out.println("Ingrese aforo total");
				int aforo = sc.nextInt();
				Cine cine = new Cine(nombre, datos.get(0), datos.get(1), aforo);
				edificios.add(cine);
				break;
			}
		System.out.println("Hemos dado de alta el edificio " + nombre);
	}

	private static void mostrarEdificio(ArrayList<Edificio> edificios, Edificio edificio1) {
		edificio1.toString();
		edificio1.calcularCosteVigilancia(edificio1.getSuperficie());
		edificio1.limpiar(edificio1.getSuperficie(), edificio1.getNumPlantas());
		if (edificio1 instanceof Hotel) {
			Hotel.costeMantenimiento(edificio1.getSuperficie());
		} else if (edificio1 instanceof Hospital) {
			Hospital.repartirAlmuerzo();
		} else {
			System.out.println("Introduzca el precio de entrada");
			float precioEntrada = sc.nextFloat();
			System.out.println("Introduzca el número de asistentes");
			int asistentes = sc.nextInt();
			sc.nextLine();
			Cine.proyectarSesion(precioEntrada, asistentes);
		}
	}
	
	private static void eliminarEdificio(ArrayList<Edificio> edificios, int opcion) {
		System.out.println("Introduzca el nombre del edificio a dar de baja");
		String nombre = sc.nextLine();
		System.out.print("Confirmación: ");
		Edificio edificio = busqueda(edificios, opcion, nombre);

		if (edificio != null) {
			if (edificio instanceof Hotel) {
				edificios.remove(edificio);
				System.out.println("Hemos eliminado correctamente el Hotel " + nombre);
			} else if (edificio instanceof Hospital) {
				edificios.remove(edificio);
				System.out.println("Hemos eliminado correctamente el Hospital " + nombre);
			} else {
				edificios.remove(edificio);
				System.out.println("Hemos eliminado correctamente el Cine " + nombre);
			}

		} else {
			if (opcion == 1) {
				System.out.println("No existe un Hotel con el nombre " + nombre);
			} else if (opcion == 2) {
				System.out.println("No existe un Hospital con el nombre " + nombre);
			} else {
				System.out.println("No existe un Cine con el nombre " + nombre);
			}
		}
	}
	
	private static void mostrarEdificios(ArrayList<Edificio> edificios) {

		for (Edificio edificio : edificios) {
			System.out.print(edificio.toString());
			edificio.calcularCosteVigilancia(Edificio.getSuperficie());
			edificio.limpiar(Edificio.getSuperficie(), Edificio.getNumPlantas());
			if (edificio instanceof Hotel) {
				Hotel.costeMantenimiento(((Hotel) edificio).getNumHabitaciones());
			} else if (edificio instanceof Hospital) {
				Hospital.repartirAlmuerzo();
			} else {
				Cine.proyectarSesion(5, 100);
			}
		}
	}

	private static ArrayList<Integer> datosEdificio() {
		ArrayList<Integer> datos = new ArrayList<Integer>();
		System.out.println("Introduzca número de plantas");
		datos.add(sc.nextInt());
		System.out.println("Introduzca superficie");
		datos.add(sc.nextInt());
		sc.nextLine();
		return datos;
	}

	private static Edificio busqueda(ArrayList<Edificio> edificios, int opcion, String nombre) {
		Edificio edificio = null;
		switch (opcion) {
		case 1:
			edificio = busquedaHotel(edificios, nombre);
			break;
		case 2:
			edificio = busquedaHospital(edificios, nombre);
			break;
		case 3:
			edificio = busquedaCine(edificios, nombre);
			break;
		default:
			System.out.println("Introduzca un numero correcto");
		}

		return edificio;

	}

	private static Edificio busquedaCine(ArrayList<Edificio> edificios, String nombre) {
		Edificio edificio = null;
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < edificios.size()) {
			if (edificios.get(i) instanceof Cine && edificios.get(i).nombre.equalsIgnoreCase(nombre)) {
				System.out.println("El Cine: " + nombre + " está dado de alta");
				edificio = edificios.get(i);
				encontrado = true;
			} else {
				i++;
			}
		}
		return edificio;

	}

	private static Edificio busquedaHospital(ArrayList<Edificio> edificios, String nombre) {
		Edificio edificio = null;
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < edificios.size()) {
			if (edificios.get(i) instanceof Hospital && edificios.get(i).nombre.equalsIgnoreCase(nombre)) {
				System.out.println("El Hospital: " + nombre + " está dado de alta");
				edificio = edificios.get(i);
				encontrado = true;
			} else {
				i++;
			}
		}
		return edificio;

	}

	private static Edificio busquedaHotel(ArrayList<Edificio> edificios, String nombre) {
		Edificio edificio = null;
		boolean encontrado = false;
		int i = 0;
		if (edificios.size() != 0) {
			while (!encontrado && i < edificios.size()) {
				if (edificios.get(i) instanceof Hotel && edificios.get(i).nombre.equalsIgnoreCase(nombre)) {
					System.out.println("El Hotel " + nombre + " está dado de alta");
					edificio = edificios.get(i);
					encontrado = true;
				} else {
					i++;
				}
			}
		}
		return edificio;
	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Dar de alta edificio.");
			System.out.println("2. Mostrar edificio.");
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
