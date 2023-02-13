package ex7_1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de notas a introducir:");
		int notas = sc.nextInt();
		float media = calcularmedia(notas);
		if (media < 5) {
			System.out.println("La nota media de la clase está suspendida. Los alumnos/as deberían preguntar sus dudas y trabajar más");
		} else if (media < 7) {
			System.out.println("La nota media de la clase es buena, pero los alumnos/as deberían mejorar el trabajo personal");
		} else {
			System.out.println("¡Enhorabuena! La nota media de la clase se corresponde con el esfuerzo realizado");
		}

	}

	public static float calcularmedia(int notas) {
		int i = 0;
		int total = 0;
		float media;
		int min = 10;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nota = new ArrayList<Integer>();
		while (i < notas) {
			System.out.println("Introduzca la nota " + (i + 1) + ":");
			int num = sc.nextInt();
			if (num >= 0 && num <= 10) {
				nota.add(num);
				total += num;
				i++;
			} else {
				System.out.println("La nota debe estar comprendida entre 0 y 10");
			}
		}
		media = (float)total / notas;
		
		for (int j = 0; j < notas; j++) {
			if (nota.get(j) > max)
				max = nota.get(j);
			if (nota.get(j) < min)
				min = nota.get(j);
		}
		System.out.println("La nota mas alta es " + max + ". La nota mas baja es " + min + ". Y la media es " + media + ".");
		return media;
	}

}
