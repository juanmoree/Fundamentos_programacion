package ex5_2;

import java.util.*;

public class Ex5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca dos numeros:");
		int num1, num2, min, max, diff;
		int res = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		min = (int) Math.min(num1, num2);
		max = (int) Math.max(num1, num2);
		diff = max - min;
		for (int i = 0; i <= diff; i++) {
			res = min + res;
			min++;
		}
		System.out.println(res);
		sc.close();
	}
}
