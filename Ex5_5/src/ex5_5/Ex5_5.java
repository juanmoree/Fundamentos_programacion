package ex5_5;

import java.util.*;

public class Ex5_5 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		ArrayList<String> nombres = new ArrayList();
		final int MAXBECAS = 5;
		int becasconcedidas = 0;
		while (becasconcedidas < MAXBECAS) {
			System.out.println("Introduzca su edad");
			int edad = datos.nextInt();
			datos.nextLine();
			System.out.println("Introduzca su nombre");
			String nombre = datos.nextLine();
			System.out.println("¿Tiene titulo universitario?");
			char titulo = datos.nextLine().charAt(0);
			System.out.println("¿Está en el paro?");
			char paro = datos.nextLine().charAt(0);

			if ((edad >= 18 && titulo == 's') || paro == 's') {
				System.out.println("BECA CONCEDIDA");
				becasconcedidas++;
				nombres.add(nombre);
			} else
				System.out.println("BECA NO CONCEDIDA");
		}
		System.out.println(nombres);
	}
}
