package ex7_2_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_2_8 {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero para la sucesión de Fibonacci");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printFibo(num);
		sc.close();
	}

	public static void printFibo(int x) {
		int total = 0;
		int back = 0;
		int actual = 1;
		ArrayList<Integer> Fibonacci = new ArrayList<Integer>();
		Fibonacci.add(0);

		for (int i = 1; i < x; i++) {
			Fibonacci.add(actual);
			total = actual + back;
			back = actual;
			actual = total;
		}
		System.out.println(Fibonacci);
	}
}
