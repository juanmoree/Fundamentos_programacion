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

		ArrayList<Integer> datos;

		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				System.out.println("Ingrese nombre");
				String nombre = sc.nextLine();
				System.out.println("¿Qué edificio quiere dar de alta?\n1. Hotel\n2. Hospital\n3. Cine");
				int opcion = sc.nextInt();
				sc.nextLine();
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
				break;
			case 2:
				System.out.println("¿Qué tipo de edificio quiere ver?\n1. Hotel\n2. Hospital\n3. Cine");
				int opcion1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el nombre");
				String nombre1 = sc.nextLine();
				Edificio edificio1 = busqueda(edificios, opcion1, nombre1);
				if (edificio1 != null) {
					switch (opcion1) {
					case 1:
						edificio1.toString();
						Hotel.costeMantenimiento(edificio1.getSuperficie());
						edificio1.calcularCosteVigilancia(edificio1.getSuperficie());
						edificio1.limpiar(edificio1.getSuperficie(), edificio1.getNumPlantas());
						break;
					case 2:
						edificio1.toString();
						Hospital.repartirAlmuerzo();
						edificio1.calcularCosteVigilancia(edificio1.getSuperficie());
						edificio1.limpiar(edificio1.getSuperficie(), edificio1.getNumPlantas());
						break;
					case 3:
						edificio1.toString();
						System.out.println("Introduzca el precio de entrada");
						float precioEntrada = sc.nextFloat();
						System.out.println("Introduzca el número de asistentes");
						int asistentes = sc.nextInt();
						sc.nextLine();
						edificio1.limpiar(edificio1.getSuperficie(), edificio1.getNumPlantas());
						edificio1.calcularCosteVigilancia(edificio1.getSuperficie());
						Cine.proyectarSesion(precioEntrada, asistentes);
						break;
					}
				}
				break;
			case 3:
				// eliminarEdificio();
				break;
			case 4:
				// ingresarDinero(clientes);
				break;
			case 5:
				// retirarDinero(clientes);
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
		System.out.println(edificios);

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
					System.out.println("El Hotel: " + nombre + " está dado de alta");
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
		final byte MAXIMO = 5;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Dar de alta edificio.");
			System.out.println("2. Mostrar edificios.");
			System.out.println("3. Eliminar edificios.");
			System.out.println("4. Ingresar euros en cuenta de cliente.");
			System.out.println("5. Retirar euros de cuenta de cliente.");
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
