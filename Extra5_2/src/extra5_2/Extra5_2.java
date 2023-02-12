package extra5_2;

import java.util.Scanner;

public class Extra5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pintemos una \"L\", introduzca un número");
		int num = sc.nextInt();
		int longi = (num/2) + 1;
		for(int i = 0; i < (num - 1); i++) {
			System.out.println("*");
		}
		for (int i = 0; i < longi; i++) {
			System.out.print("*");
		}
	}
}
