package extrabisiesto;

import java.util.Scanner;

public class ExtraBisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca año de nacimiento");
		int year = sc.nextInt();
		boolean bis = false;
		if (year % 400 == 0) {
			bis = true;
		}
		if (year >= 1000 && year < 2024) {
			if (!bis) {
				if (year % 4 == 0)
					System.out.println("Su año de nacimiento es un año bisiesto");

				} else
				System.out.println("Su año de nacimiento NO es un año bisiesto");
		}
	}
}