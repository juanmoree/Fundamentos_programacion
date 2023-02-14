package extraalreves;

import java.util.*;

public class ExtraAlreves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero mayor a 9999");
		int num = sc.nextInt();
		if (num <= 9999)
			System.out.println("Numero incorrecto");
		else {
			while (num > 0) {
				System.out.print(num % 10);
				num /= 10;
			}
		}
		sc.close();
	}
}