package ex7_2_4;

import java.util.Scanner;

public class Ex7_2_4 {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = 1;
		
		for (int i = num; i > 0; i--) {
			total *= i;
		}
		System.out.println("El factorial de " + num + " es " + total);
		sc.close();
	}
}
