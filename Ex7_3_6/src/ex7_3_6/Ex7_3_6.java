package ex7_3_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_3_6 {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero de 10 cifras");
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();
		int even = 0;
		int odd = 0;
		int length = String.valueOf(num).length();
		ArrayList<Integer> arrayOdd = new ArrayList<Integer>();
		ArrayList<Integer> arrayEven = new ArrayList<Integer>();
		System.out.println(length);

		for (int i = 0; i < length; i++) {
			int mod = (int) (num % 2);
			if (mod == 0) {
				arrayOdd.add((int) (num % 10));
			} else
				arrayEven.add((int) (num % 10));
			num /= 10;
		}
		
		int sizeOdd = arrayOdd.size();
		
		for (int i = 0; i < sizeOdd; i++) {
			odd += arrayOdd.get(i);
		}
		
		int sizeEven = arrayEven.size();
		
		for (int i = 0; i < sizeEven; i++) {
			even += arrayEven.get(i);
		}
		System.out.println("La suma de los pares es " + odd + " y la de los impares es " + even);
	}

}
