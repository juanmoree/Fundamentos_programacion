package ex7_1;

import java.util.*;

public class Ex7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 3 notas");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		final int GRADES = 3;
		float average = (float)(first + second + third) / GRADES;
		if (average > 7) {
			System.out.println("Al siguiente nivel");
		} else if (average <= 7) {
			System.out.println("Enhorabuena, has aprobado pero deberias seguir practicando");
		} else
			System.out.println("No has superado el curso, tienes que recuperar");
		System.out.println(average);
	}
}
