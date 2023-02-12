package extrabisiesto;

import java.util.Scanner;

public class ExtraBisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca año de nacimiento");
		int anyo = sc.nextInt();
		int bis = (anyo % 4);
		int cent = (anyo / 100);
		if (anyo >= 1900 && anyo < 2024) {
			if (cent % 4 == 0) {
				if (bis == 0)
					System.out.println("Su año de nacimiento es un año bisiesto");
			}
			else
				System.out.println("Su año de nacimiento NO es un año bisiesto");
		}
	}
}