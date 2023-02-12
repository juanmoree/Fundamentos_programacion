package ex4_5;

import java.util.Scanner;

public class Ex4_5 {

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
			res = x + y;
			break;
		case '-':
			res = x - y;
			break;
		case '*':
			res = x * y;
			break;
		case '/':
			res = (float) x / y;
			break;
		default:
			System.out.println("El operador introducido no es correcto");
		}
		System.out.println("El resultado de la operacion es: " + res);
		datos.close();
	}
}