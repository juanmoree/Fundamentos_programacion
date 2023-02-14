package extraclasefeb14;

import java.util.Scanner;

public class ExtraClaseFeb14 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un numero");
		int num = sc.nextInt();
		while (num == 0) {
			System.out.println("Introduzca otro numero diferente de 0");
			num = sc.nextInt();
		}
		numeropar(num);

	}

	public static void numeropar(int num) {
		
		while ((num % 2) != 0) {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();
		}
		if ((num % 2) == 0)
			System.out.println("El numero " + num + " es par");
	}
}
