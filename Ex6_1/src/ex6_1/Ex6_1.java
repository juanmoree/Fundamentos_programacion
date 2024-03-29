package ex6_1;

import java.util.Scanner;

public class Ex6_1 {

	public static int sum(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mult(int x, int y) {
		return x * y;
	}

	public static float div(float x, float y) {
		return x / y;
	}

	public static int mod(int x, int y) {
		return x % y;
	}

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduzca 2 numeros");
		int x = datos.nextInt();
		int y = datos.nextInt();
		datos.nextLine();
		System.out.println("Introduzca uno de los siguientes operadores: +, -, *, /");
		char op = datos.nextLine().charAt(0);
		float res = 0;

		switch (op) {
		case '+':
			res = sum(x, y);
			break;
		case '-':
			res = sub(x, y);
			break;
		case '*':
			res = mult(x, y);
			break;
		case '/':
			res = div(x, y);
			break;
		case '%':
			res = mod(x, y);
			break;
		default:
			System.out.println("El operador introducido no es correcto");
		}
		System.out.println("El resultado de la operacion es: " + res);
		datos.close();
	}
}