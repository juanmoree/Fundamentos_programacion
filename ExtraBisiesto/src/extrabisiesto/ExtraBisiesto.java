package extrabisiesto;

import java.util.Scanner;

public class ExtraBisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca año de nacimiento");
		int year = sc.nextInt();
		int cent = year / 100;
		boolean ok = false;
		if (year >= 1000 && year < 2024) {
			if (year % 100 != 0) {	
				if (year % 4 == 0)
					ok = true;
			} else if (cent % 4 == 0)
					ok = true;

		} else {
			System.out.println("Introduzca otro año");
			sc.nextInt();
		}
		
		if (ok)
			System.out.println("Su año de nacimiento es un año bisiesto");
		else
			System.out.println("Su año de nacimiento NO es un año bisiesto");
		sc.close();
	}
}