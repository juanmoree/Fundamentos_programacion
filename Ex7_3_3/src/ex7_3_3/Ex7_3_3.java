package ex7_3_3;

import java.util.*;

public class Ex7_3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra/frase");
		String entry = sc.nextLine().toLowerCase();
		entry = entry.replaceAll(" ", ""); // Trim String
		
		int length = entry.length() - 1;
		int compare = length / 2;
		boolean equals = true;

		int i = 0;
		while (equals && i <= compare) {
			if (entry.charAt(i) == entry.charAt(length - i)) {
				i++;
			} else
				equals = false;
		}
		if (equals)
			System.out.println("La frase/palabra es un palindromo");
		else
			System.out.println("La frase/palabra no es un palindromo");
		
		sc.close();
	}

}
