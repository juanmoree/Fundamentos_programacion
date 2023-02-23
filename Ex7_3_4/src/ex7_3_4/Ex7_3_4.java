package ex7_3_4;

import java.io.PrintStream;
import java.util.*;

public class Ex7_3_4 {

	public static void main(String[] args) {
		System.out.println("Introduce tu DNI");
		Scanner sc = new Scanner(System.in);

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		String dni = sc.nextLine();
		int length = dni.length();
		char letraDni = Character.toUpperCase(dni.charAt(length - 1));
		String num = dni.substring(0, 8);
		int number = Integer.parseInt(num);
		int mod = number % 23;

		if (length != 9 || !Character.isLetter(letraDni)) {
			System.out.println("Dni no valido");
		} else {
			if (letras[mod] == letraDni) {
				System.out.println(dni + " La letra es correcta");
			} else {
				System.out.println(dni + " La letra es incorrecta");
				System.out.println("Su letra deberia ser " + number + letras[mod]);
			}
		}
		sc.close();
	}
}
