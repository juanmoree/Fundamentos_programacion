package ex7_1_3;

import java.util.Scanner;

public class Ex7_1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero");
		int numero = sc.nextInt();
		if ((numero % 2) == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		sc.close();
	}

}
