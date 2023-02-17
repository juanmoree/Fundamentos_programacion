package ex7_2_5;

import java.util.Scanner;

public class Ex7_2_5 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduzca un numero");
		int num = sc.nextInt();
		prime(num);
	}
	
	public static void prime (int x) {
		boolean prime = true;
		
		if (x > 1) {
			int i = 2;
			while (prime && i < (x - 1)) {
				if (x % i == 0) {
					prime = false;
				}
				else
					i++;
			}
			if (!prime) {
				System.out.println("El numero no es primo");
			} else
				System.out.println("El numero es primo");
		} else
			System.out.println("El numero debe ser mayor a 1");
	}
}