package ex7_2_6;

import java.util.Scanner;

public class Ex7_2_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un numero");
		int num = sc.nextInt();

		while (!prime(num)) {
			System.out.println("Introduzca otro numero");
			num = sc.nextInt();
		}
		System.out.println("Exacto, el numero " + num + " es primo");

	}

	public static boolean prime(int x) {
		boolean prime = true;

		if (x > 1) {
			int i = 2;
			while (prime && i < (x - 1)) {
				if (x % i == 0) {
					prime = false;
				} else
					i++;
			}
		}
		return prime;
	}
}
