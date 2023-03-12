package ex8_3;

import java.util.*;

public class Ex8_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Juan", "Moreno");
		Cliente cliente2 = new Cliente("Kathe", "Moreno");
		Cliente cliente3 = new Cliente("Luis", "Moreno");
		Cliente cliente4 = new Cliente("Janeth", "Ceballos");
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);

		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				System.out.println("Ingrese nombre");
				String nombre = sc.nextLine();
				System.out.println("Ingrese apellido");
				String apellido = sc.nextLine();
				crearCliente(clientes, nombre, apellido);
				break;
			case 2:
				eliminarCliente(clientes);
				break;
			case 3:
				crearCuenta(clientes);
				break;
			case 4:
				System.out.println("Escriba la cantidad a ingresar");
				int ingresarCant = sc.nextInt();
				break;
			case 5:
				System.out.println("Escriba la cantidad a retirar");
				int retirarCant = sc.nextInt();
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
	}

	private static void crearCuenta(ArrayList<Cliente> clientes) {
		System.out.println("Ingrese nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido");
		String apellido = sc.nextLine();
		Cliente cliente = busqueda(clientes, nombre, apellido);

		// Si el cliente existe
		if (cliente != null) {
			System.out.println("Ingrese numero de cuenta");
			int numCuenta = sc.nextInt();
			Cuenta cuenta = busquedaCuenta(cliente, numCuenta);
			if (cuenta == null) {
				cuenta = new Cuenta(numCuenta);
				cliente.agregarCuenta(cliente.getCuentas(), numCuenta);
			}
		}
		System.out.println(cliente.getCuentas());
	}

	private static Cuenta busquedaCuenta(Cliente cliente, int numCuenta) {
		Cuenta cuenta = null;
		int i = 0;
		boolean encontrada = false;
		if (cliente.getCuentas() == null) {
			cliente.agregarCuenta(cliente.getCuentas(), numCuenta);
		}
		if (cliente.getCuentas().size() != 0) {
			while (!encontrada && i < cliente.getCuentas().size()) {
				if (cliente.getCuentas().get(i).getNumCuenta() == numCuenta) {
					System.out.println("La cuenta: " + numCuenta + " ya está asociada al cliente: " + cliente);
					cuenta = cliente.getCuentas().get(i);
					encontrada = true;
				} else {
					i++;
				}
			}
		}
		return cuenta;
	}

	private static void eliminarCliente(ArrayList<Cliente> clientes) {
		Cliente cliente = null;
		System.out.println("Ingrese nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido");
		String apellido = sc.nextLine();

		cliente = busqueda(clientes, nombre, apellido);

		if (cliente != null) {
			clientes.remove(cliente);
			System.out.println("Hemos eliminado a: " + nombre + " " + apellido + " de la lista de clientes");
		} else {
			System.out.println("No pudimos encontrar ese cliente");
		}
	}

	private static Cliente crearCliente(ArrayList<Cliente> clientes, String nombre, String apellido) {
		Cliente cliente = null;
		busqueda(clientes, nombre, apellido);

		if (cliente == null) {
			cliente = new Cliente(nombre, apellido);
			clientes.add(cliente);
		}
		return cliente;
	}

	public static Cliente busqueda(ArrayList<Cliente> clientes, String nombre, String apellido) {
		Cliente cliente = null;
		boolean encontrado = false;
		int i = 0;

		while (!encontrado && i < clientes.size()) {
			if (clientes.get(i).getNombre().equalsIgnoreCase(nombre)
					&& clientes.get(i).getApellido().equalsIgnoreCase(apellido)) {
				cliente = clientes.get(i);
				System.out.println("Cliente existente");
				encontrado = true;
			} else
				i++;
		}
		return cliente;
	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Crear cliente.");
			System.out.println("2. Eliminar cliente.");
			System.out.println("3. Crear cuenta de cliente.");
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
