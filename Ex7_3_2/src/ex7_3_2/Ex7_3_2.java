package ex7_3_2;

import java.util.Scanner;

public class Ex7_3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra");
		
		String word = sc.nextLine();
		String reverse = "";
		int length = word.length();

		for (int i = length; i > 0; i--) {
			reverse += word.charAt(i - 1);
		}
		System.out.println(reverse);

		sc.close();
	}

}
