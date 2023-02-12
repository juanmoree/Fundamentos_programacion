package extra5_1;

import java.util.Scanner;

public class Extra5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adivina mi numero del 1 al 500");
		int numuser = sc.nextInt();
		int randomnum = (int) (Math.random() * 500 + 1);
		int mayor, menor;

		while (numuser != randomnum) {
			mayor = numuser - randomnum;
			menor = randomnum - numuser;
			if (numuser > randomnum) {
				if (mayor >= 50) {
					System.out.println("Frío, frío: tu número es mayor");
				} else if (mayor >= 15) {
					System.out.println("Tibio, tibio: tu número es mayor");
				} else if (mayor < 15)
					System.out.println("Caliente, caliente: tu número es mayor");
			} else {
				if (menor >= 50) {
					System.out.println("Frío, frío: tu número es menor");
				} else if (menor >= 15) {
					System.out.println("Tibio, tibio: tu número es menor");
				} else if (menor < 15)
					System.out.println("Caliente, caliente: tu número es menor");
			}
			System.out.println("Vuelve a intentarlo\nIntroduce otro número:");
			numuser = sc.nextInt();
		}
		System.out.println("Has adivinado, el número era " + randomnum);
	}
}