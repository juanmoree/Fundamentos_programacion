package ex8_2;

import java.util.*;

public class Ex8_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Hotel> hoteles = new ArrayList<Hotel>();

		// Menu
		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				hoteles.add(crearHotel(hoteles));
				break;
			case 2:
				System.out.println("Introduzca el nombre del hotel a eliminar");
				String nombreEliminar = sc.nextLine();
				darDeBajaHotel(nombreEliminar, hoteles);
				break;
			case 3:
				System.out.println("Introduzca el nombre del hotel a ver");
				String nombreVer = sc.nextLine();
				verHotel(nombreVer, hoteles);
				break;
			case 4:
				System.out.println("Introduzca el nombre del hotel a modificar");
				String nombreModificar = sc.nextLine();
				modificarHotel(nombreModificar, hoteles);
				break;
			case 5:
				mostrarTodos(hoteles);
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);

		System.out.println(hoteles);

	}

	private static Hotel crearHotel(ArrayList<Hotel> hoteles) {
		System.out.println("Introduzca el nombre del hotel");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el numero de habitaciones");
		int numHabs = sc.nextInt();
		System.out.println("Introduzca el numero de plantas");
		int numPlants = sc.nextInt();
		System.out.println("Introduzca la superficie total");
		int superficie = sc.nextInt();
		sc.nextLine();

		boolean encontrado = encontrar(nombre, hoteles);

		Hotel hotel = null;

		if (!encontrado) {
			hotel = new Hotel(nombre, numHabs, numPlants, superficie);
		}
		return hotel;
	}

	private static void darDeBajaHotel(String nombreEliminar, ArrayList<Hotel> hoteles) {

		boolean encontrado = encontrar(nombreEliminar, hoteles);
		if (encontrado) {
			Hotel hotel = obtener(nombreEliminar, hoteles);
			System.out.println("Hemos eliminado el hotel " + nombreEliminar);
			hoteles.remove(hotel);
		} else
			System.out.println("El hotel " + nombreEliminar + " no se encuentra dentro " + "de nuestra aplicación");
	}

	private static void verHotel(String nombreVer, ArrayList<Hotel> hoteles) {
		boolean encontrado = encontrar(nombreVer, hoteles);
		if (encontrado) {
			Hotel hotel = obtener(nombreVer, hoteles);
			System.out.println(hotel);
			hotel.calcularMantenimiento();
		} else
			System.out.println("El hotel " + nombreVer + " no está en nuestra aplicación");
	}

	private static void modificarHotel(String nombreModificar, ArrayList<Hotel> hoteles) {
		boolean encontrado = encontrar(nombreModificar, hoteles);
		if (encontrado) {
			Hotel hotel = obtener(nombreModificar, hoteles);
			System.out.println(
					"Quiere modificar:\na. Número de habitaciones\nb. Número de plantas\nc. Superficie del hotel");
			char opcion = sc.nextLine().charAt(0);

			String mensaje = "La modificacion se ha realizado";

			if (opcion == 'a') {
				System.out.println("Introduzca el numero de habitaciones");
				int numHabs = sc.nextInt();
				hotel.setNumHabs(numHabs);
				System.out.println(mensaje);
			} else if (opcion == 'b') {
				System.out.println("Introduzca el numero de plantas");
				int numPlants = sc.nextInt();
				hotel.setNumPlants(numPlants);
				System.out.println(mensaje);
			} else if (opcion == 'c') {
				System.out.println("Introduzca la superficie");
				int superficie = sc.nextInt();
				hotel.setSuperficie(superficie);
				System.out.println(mensaje);
			} else
				System.out.println("Opcion incorrecta");
		} else
			System.out.println("El hotel " + nombreModificar + " no se encuentra en nuestra aplicación");

	}

	private static boolean encontrar(String nombreHotel, ArrayList<Hotel> hoteles) {
		boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < hoteles.size()) {
			if (hoteles.get(i).getNombre().equalsIgnoreCase(nombreHotel)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}
	
	private static void mostrarTodos(ArrayList<Hotel> hoteles) {
		for (Hotel hotel : hoteles) {
			System.out.print(hotel);
		}	
	}
	
	private static Hotel obtener(String nombre, ArrayList<Hotel> hoteles) {

		int i = 0;
		Hotel hotel = null;
		while (i < hoteles.size()) {
			if (hoteles.get(i).getNombre().equalsIgnoreCase(nombre)) {
				hotel = hoteles.get(i);
			}
			i++;
		}
		return hotel;

	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Crear hotel.");
			System.out.println("2. Dar de baja hotel.");
			System.out.println("3. Ver hotel.");
			System.out.println("4. Modificar hotel.");
			System.out.println("5. Mostrar todos los hoteles.");
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
