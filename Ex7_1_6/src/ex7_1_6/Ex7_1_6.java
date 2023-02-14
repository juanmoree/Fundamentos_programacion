package ex7_1_6;

import java.util.Scanner;

public class Ex7_1_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero del 1 al 10");
		int num = sc.nextInt();

		tablaMultiplicar(num);
	}

	public static void tablaMultiplicar(int x) {

		if (x > 0 && x < 11) {

			for (int y = 1; y <= 10; y++) {
				System.out.println(x + " x " + y + " = " + (x * y));
			}
		} else
			System.out.println("El numero no esta entre 1 y 10");
	}

}
