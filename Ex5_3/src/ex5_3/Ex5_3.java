package ex5_3;

import java.util.Scanner;

public class Ex5_3 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero del 1 al 10");
		Scanner sc = new Scanner(System.in);
		byte numuser = sc.nextByte();
		byte random = (byte) Math.ceil((Math.random() * 10));
		while (numuser != random) {
			System.out.println("Numero incorrecto, vuelve a intentarlo\nIntroduce otro numero:");
			numuser = sc.nextByte();
		}
		System.out.println("Enhorabuena, el numero era " + random);
		sc.close();
	}
}
