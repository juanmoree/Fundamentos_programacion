package ex7_1_8;

import java.util.Scanner;

public class Ex7_1_8 {

	public static void main(String[] args) {
		System.out.println("Introduzca una temperatura en °C");
		
		Scanner sc = new Scanner(System.in);
		byte temp = sc.nextByte();
		final byte K = 32;
		
		float res = (float) temp * 9 / 5 + K;

		System.out.println(temp + "°C son " + res + "°F");
		sc.close();
	}

}
