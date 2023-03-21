package juanMoreno;

import java.util.*;

public class JuanMoreno {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
		 Factura factura = new Factura(0, "juan", "josepa 7", 21983);
		 facturas.add(factura);
		 LineaFactura linea = new LineaFactura(0, "CocaCola", "Bebida", 2, 4.5f);
		 factura.getLineasFactura().add(linea);
		 Factura factura2 = new Factura(0, "pedro", "josepa 8", 21983);
		 facturas.add(factura2);
		 LineaFactura linea2 = new LineaFactura(0, "Sprite", "Bebida", 7, 2.3f);
		 factura2.getLineasFactura().add(linea2);
		 Factura factura3 = new Factura(0, "carlos", "josepa 7", 21983);
		 facturas.add(factura3);
		 LineaFactura linea3 = new LineaFactura(0, "Turron", "Dulce", 8, 2.1f);
		 factura3.getLineasFactura().add(linea3);
		 System.out.println(linea3);
		 Factura factura4 = new Factura(1, "juan", "josepa 8", 21983);
		 facturas.add(factura4);
		 LineaFactura linea4 = new LineaFactura(0, "caCo", "Bebida", 2, 4.5f);
		 factura4.getLineasFactura().add(linea4);
		 Factura factura5 = new Factura(2, "juan", "josepa 9", 21983);
		 facturas.add(factura5);
		 LineaFactura linea5 = new LineaFactura(0, "Cola", "Bebida", 2, 4.5f);
		 factura5.getLineasFactura().add(linea5);
		 Factura factura6 = new Factura(3, "juan", "josepa 10", 21983);
		 facturas.add(factura6);
		 LineaFactura linea6 = new LineaFactura(0, "Coke", "Bebida", 2, 5.5f);
		 factura6.getLineasFactura().add(linea6);
		 //41.9
		 
		
		
		//Menu
		boolean salir = false;
		do {
			switch (menu()) {
			case 1:
				crearFactura(facturas);
				break;
			case 2:
				CrearLineaFactura(facturas);
				break;
			case 3:
				CalcularTotalFactura(facturas);
				break;
			case 4:
				TotalFacturas(facturas);
				break;
			case 5:
				MostrarFacturasCliente(facturas);
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
	}
	
	private static void MostrarFacturasCliente(ArrayList<Factura> facturas) {
		System.out.println("Introduzca nombre de cliente");
		String nombre = sc.nextLine();
		for (int i = 0; i < facturas.size(); i++) {
			if (facturas.get(i).getNombreCliente().equalsIgnoreCase(nombre)) {
				System.out.println(facturas.get(i).toString());
			}
		}
	}

	private static void TotalFacturas(ArrayList<Factura> facturas) {
		float total = 0;
		for (int i = 0; i < facturas.size(); i++) {
			total += facturas.get(i).getTotal();
		}
		System.out.println("El total de todas las facturas es " + total);
		
	}

	private static void CalcularTotalFactura(ArrayList<Factura> facturas) {
		System.out.println("Introduzca el numero de factura a calcular");
		int numeroFactura = sc.nextInt();
		Factura factura = busquedaFactura(facturas, numeroFactura);
		if (factura == null) {
			System.out.println("Ese número de factura no existe");
		} else {
			int i = 0;
			float total = factura.getTotal();
			System.out.println("El total de la factura numero " + numeroFactura + " es de " + total);
		}
	}

	private static void CrearLineaFactura(ArrayList<Factura> facturas) {
		Factura factura = null;
		System.out.println("Introduzca número de factura");
		int numeroFactura = sc.nextInt();
		factura = busquedaFactura(facturas, numeroFactura);
		
		if (factura != null) {
			System.out.println("Introduzca el numero de linea");
			int numeroLinea = sc.nextInt();
			sc.nextLine();
			LineaFactura linea = busquedaLinea(factura, numeroLinea);
			if (linea == null) {
				System.out.println("Introduzca el nombre del articulo");
				String nombreArticulo = sc.nextLine();
				System.out.println("Introduzca descripcion del articulo");
				String descripcion = sc.nextLine();
				System.out.println("Introduzca cantidad");
				int cantidad = sc.nextInt();
				System.out.println("Introduzca precio");
				float precio = sc.nextFloat();
				sc.nextLine();
				LineaFactura lineaAgregar = new LineaFactura(numeroLinea, nombreArticulo, descripcion, cantidad, precio);
				factura.getLineasFactura().add(lineaAgregar);
			} else {
				System.out.println("Ese número de linea ya existe");
			}
		}
	}

	private static LineaFactura busquedaLinea(Factura factura, int numeroLinea) {
		LineaFactura linea = null;
		boolean encontrado = false;
		int i = 0;
		while (i < factura.getLineasFactura().size() && !encontrado) {
			if (factura.getLineasFactura().get(i).getNumeroLinea() == numeroLinea) {
				encontrado = true;
				linea = factura.getLineasFactura().get(i);
			} else {
				i++;
			}
		}
		return linea;
	}

	private static void crearFactura(ArrayList<Factura> facturas) {
		Factura factura = null;
		System.out.println("Introduzca el nombre del cliente");
		String nombreCliente = sc.nextLine();
		System.out.println("Introduzca la dirección");
		String direccion = sc.nextLine();
		System.out.println("Introduzca el telefono");
		int telefono = sc.nextInt();
		System.out.println("Introduzca numero de factura");
		int numeroFactura = sc.nextInt();
		factura = busquedaFactura(facturas, numeroFactura);
		
		if (factura == null) {
			factura = new Factura(numeroFactura, nombreCliente, direccion, telefono);
			facturas.add(factura);
			System.out.println("Factura numero " + numeroFactura + " creada correctamente");
		} else {
			System.out.println("Ese numero de factura ya existe");
		}
		System.out.println();
	}

	private static Factura busquedaFactura(ArrayList<Factura> facturas, int numeroFactura) {
		Factura factura = null;
		int i = 0;
		boolean encontrado = false;
		while (i < facturas.size() && !encontrado) {
			if (facturas.get(i).getNumeroFactura() == numeroFactura) {
				encontrado = true;
				factura = facturas.get(i);
			} else {
				i++;
			}
		}
		return factura;
	}

	public static byte menu() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Crear factura.");
			System.out.println("2. Crear linea de factura.");
			System.out.println("3. Calcular total de la factura.");
			System.out.println("4. Calcular total todas las facturas.");
			System.out.println("5. Mostrar facturas por cliente.");
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
