package juanmoreno1;

import java.util.Scanner;

public class JuanMoreno1 {
	
	/* “Espada” guanya a “Hacha”.
	“Hacha” guanya a “Lanza”.
	“Lanza” guanya a “Espada”.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escoja: \n1.Espada\n2.Hacha\n3.Lanza");
		String opcion = sc.nextLine();
		String low = opcion.toLowerCase();
		char user = low.charAt(0);
		int random = (int) (Math.random() * 3 + 1);
		
		System.out.println("Maquina: " + random);
		System.out.println("Tu: " + opcion);
		
		if (user == 'e') {
			if (random == 1) {
				System.out.println("Empate");
			} else if (random == 2) {
				System.out.println("Victoria");
			} else
				System.out.println("Perdida");
		}
		else if (user == 'h') {
			if (random == 1) {
				System.out.println("Perdida");
			} else if (random == 2) {
				System.out.println("Empate");
			} else
				System.out.println("Victoria");
		}
		else if (user == 'l') {
			if (random == 1) {
				System.out.println("Victoria");
			} else if (random == 2) {
				System.out.println("Perdida");
			} else
				System.out.println("Empate");
		}
		else
			System.out.println("Incorrecto");
		sc.close();
	}

}
