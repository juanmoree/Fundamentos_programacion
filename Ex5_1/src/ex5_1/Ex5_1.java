package ex5_1;

import java.util.*;

public class Ex5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero de palabras");
		int num = sc.nextByte();
		sc.nextLine(); // Reiniciamos el Scanner para que no haya problema.

		ArrayList<String> words = new ArrayList<String>();

		for (int i = 1; i <= num; i++) { // Empezamos en '1' para que no mencione palabra '0'
			System.out.println("Introduce la palabra " + i);
			words.add(sc.nextLine()); // Leemos cada una de las palabras y añadimos con el ¨.add¨
		}
		// System.out.println(words);
		System.out.println("Sus palabras son:");
		for (int i = 0; i < num; i++) {
			System.out.print(words.get(i) + " "); // Obtenemos la palabra con el indice e imprimimos
		}
	}
}
