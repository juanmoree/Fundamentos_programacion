package ex4_3;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduzca su edad");
		int edad = datos.nextInt();
		System.out.println("¿Tiene titulo universitario?\n1 = SI\n2 = NO");
		int titulo = datos.nextInt();
		System.out.println("¿Está en el paro?\n1 = SI\n2 = NO");
		int paro = datos.nextInt();

		if ((edad >= 18 && titulo == 1) || paro == 1)
			System.out.println("BECA CONCEDIDA");
		else
			System.out.println("BECA NO CONCEDIDA");
	}
}
