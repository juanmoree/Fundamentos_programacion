package extraparimpar;

import java.util.Scanner;

public class ExtrsParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Su numero es par");
		} else
			System.out.println("Su numero es impar");
	}
}
