package ex7_2_7;

import java.util.Scanner;

public class Ex7_2_7 {

	public static void main(String[] args) {
		System.out.println("Introduce un año");
		Scanner sc = new Scanner (System.in);
		int year = sc.nextInt();
		message(year);
		sc.close();
	}
	
	public static void message (int year) {
		if (year % 400 == 0) {
			System.out.println("Año bisiesto");
		} else if (year % 4 == 0 && year % 100 != 0) {
				System.out.println("Año bisiesto");
			}
		else 
			System.out.println("Año no bisiesto");
		
	}
}
