package ex7_1_4;

import java.util.Scanner;

public class Ex7_1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero 1:");
		int num1 = sc.nextInt();
		System.out.println("Introduzca numero 2:");
		int num2 = sc.nextInt();
		manera1(num1, num2);
		manera2(num1, num2);
		manera3(num1, num2);
		manera4(num1, num2);
		sc.close();
	}

	public static void manera1(int num1, int num2) {

		if ((num1 < 0 && num2 >= 0) || (num1 >= 0 && num2 < 0))
			System.out.println("Uno de los dos numeros es negativo");
	}
	
	public static void manera2(int num1, int num2) {

			if (num1 < 0 || num2 < 0) {
				if (num1 >= 0 && num2 < 0)
					System.out.println("Uno de los dos numeros es negativo");
				else if (num1 < 0 && num2 >= 0)
					System.out.println("Uno de los dos numeros es negativo");
				}
	}
	
	public static void manera3(int num1, int num2) {
		
		if ((num1 * num2) < 0) {
			System.out.println("Uno de los dos numeros es negativo");
		}
	}

	public static void manera4(int num1, int num2) {
		
		if (num1 < 0 ^ num2 < 0) {
			System.out.println("Uno de los dos numeros es negativo");
		}
	}
}
