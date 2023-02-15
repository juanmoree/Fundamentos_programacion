package ex7_2_1;

import java.util.Scanner;

public class Ex7_2_1 {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String asterisk = "";

		for (int i = 0; i < num; i++) {
			asterisk += '*';
			System.out.println(asterisk);
		}
		sc.close();
	}
}
