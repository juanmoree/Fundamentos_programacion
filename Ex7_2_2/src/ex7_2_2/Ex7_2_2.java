package ex7_2_2;

import java.util.Scanner;

public class Ex7_2_2 {

	public static void main(String[] args) {

		System.out.println("Introduzca un numero");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char c = '*';

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(c);
			}
			System.out.println();
		}

		sc.close();
	}

}
