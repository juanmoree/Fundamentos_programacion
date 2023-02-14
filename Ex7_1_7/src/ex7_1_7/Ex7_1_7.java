package ex7_1_7;

import java.util.Scanner;

public class Ex7_1_7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un caracter");
		char c = sc.nextLine().charAt(0);
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		printChar(num, c);
		sc.close();
	}

	public static void printChar(int num, char c) {

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {
				System.out.print(c + " ");
			}
			System.out.print("\n");
		}
	}
	

}
