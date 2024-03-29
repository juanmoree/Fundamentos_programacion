package extralongs;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtraLongs {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero de mas de 7 cifras");
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> numbers = new ArrayList<Long>();
		long num = sc.nextLong();
		long sum = 0;
		if (num > 9999999) {
			while (num > 0) {
				// Añade los numeros de derecha a izquierda
				numbers.add(num % 10);
				num /= 10;
			}
			int size = numbers.size() - 1;
			System.out.print("Los numeros pares son: ");
			for (int i = 0; i <= size; size--) {
				if ((numbers.get(size) % 2) == 0) {
					// Obtiene los numeros de derecha a izquierda
					System.out.print(numbers.get(size) + " ");
					sum += numbers.get(size);
				}
			}
			System.out.println("\nY la suma de ellos es: " + sum);
		} else
			System.out.println("Numero incorrecto");
		sc.close();
	}
}
