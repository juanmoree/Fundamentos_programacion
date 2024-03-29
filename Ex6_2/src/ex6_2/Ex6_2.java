package ex6_2;

import java.util.*;

public class Ex6_2 {

	public static float average(int num) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ages = new ArrayList();
		int i = 1;
		float res = 0;

		while (i <= num) {
			System.out.println("Introduzca la edad Nº " + i);
			int age = sc.nextInt();
			if (age >= 0 && age <= 120) {
				ages.add(age);
				i++;
			} else
				System.out.println("Edad incorrecta");
		}

		System.out.println("Las edades introducidas son: " + ages);

		for (int x = 0; x < num; x++) {
			res = (ages.get(x) + res);
		}
		
		return (float)(res / num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas edades quieres introducir?");
		int num = sc.nextInt();
		float res = average(num);
		System.out.println("Y la media es: " + res);
	}

}