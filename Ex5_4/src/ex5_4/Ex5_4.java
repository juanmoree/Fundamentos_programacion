package ex5_4;

import java.util.Scanner;

public class Ex5_4 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero del 1 al 10");
		Scanner sc = new Scanner(System.in);
		byte numuser = sc.nextByte();
		byte random = (byte) Math.ceil((Math.random() * 10));
		byte tries = 1;
		final byte MAXTRIES = 5;
		System.out.println(random);
		while (numuser != random && tries < MAXTRIES) {
			if (numuser > 0 && numuser <= 10) {
				if (numuser > random)
				System.out.println("Demasiado alto, vuelve a intentarlo\nIntroduce otro numero:");
				else if (numuser < random)
					System.out.println("Demasiado bajo, vuelve a intentarlo\nIntroduce otro numero:");
				numuser = sc.nextByte();
			} else {
				System.out.println("El numero tiene que estar comprendido entre 1 y 10\nIntroduce otro numero:");
				numuser = sc.nextByte();
			}
			tries++;
		}
		if (numuser == random) {
			System.out.println("Enhorabuena, el numero era " + random);
			System.out.println("Y el numero de intentos ha sido: " + tries);
		} else
			System.out.println("¡Has utilizado demasiados intentos! El número es " + random);
		sc.close();
	}
}
