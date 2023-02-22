package ex7_3_1;

import java.util.*;

public class Ex7_3_1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				cuadrado();
				// salir = true;
				break;
			case 2:
				triangulo();
				// salir = true;
				break;
			case 3:
				rectangulo();
				// salir = true;
				break;
			case 4:
				circulo();
				// salir = true;
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicacion");
				salir = true;
				break;
			}
		} while (!salir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do {
			System.out.println("MENú PRINCIPAL");
			System.out.println("1. Cuadrado.");
			System.out.println("2. Triangulo.");
			System.out.println("3. Rectangulo.");
			System.out.println("4. Circulo.");
			System.out.println("0. Salir de la aplicacion.\n");
			opcion = sc.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoge una opcion valida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void cuadrado() {
		System.out.println("Introduce el lado");
		int num = sc.nextInt();
		System.out.println("El area total es " + (num * num) + "\n");
	}

	public static void triangulo() {
		System.out.println("Introduce la base");
		int base = sc.nextInt();
		System.out.println("Introduce la altura");
		int altura = sc.nextInt();
		System.out.println("El area es " + ((base * altura) / 2) + "\n");
	}

	public static void rectangulo() {
		System.out.println("Introduce la base");
		int base = sc.nextInt();
		System.out.println("Introduce la altura");
		int altura = sc.nextInt();
		System.out.println("El area es " + (base * altura) + "\n");
	}

	public static void circulo() {
		final double PI = 3.14159265359;
		System.out.println("Introduce el radio");
		int radio = sc.nextInt();
		System.out.println("El area es " + (PI * (radio * radio)) + "\n");
	}

}
