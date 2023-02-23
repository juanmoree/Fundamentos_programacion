package ex7_3_5;

import java.util.Scanner;

public class Ex7_3_5 {

	public static void main(String[] args) {

		System.out.println("Introduzca una frase");

		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String toUp = original.toUpperCase();
		String toLo = original.toLowerCase();

		if (original.equals(toLo)) {
			System.out.println("Minusculas");
		} else if (original.equals(toUp)) {
			System.out.println("Mayusculas");
		} else
			System.out.println("Mayusculas y minusculas");
		sc.close();
	}
}
