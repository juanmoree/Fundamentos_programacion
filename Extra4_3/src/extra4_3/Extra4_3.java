package extra4_3;

import java.util.Scanner;

public class Extra4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRandom = (int)(Math.random() * 3) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Juguemos a piedra, papel o tijera:\n1. Piedra\n2. Papel\n3. Tijera\nElige(1-3):");
		final int piedra = 1;
		final int papel = 2;
		final int tijera = 3;
		final String uno = "Piedra";
		final String dos = "Papel";
		final String tres = "Tijera";
		int eleccion = sc.nextInt();
		if (eleccion > 0 && eleccion < 4) {
			switch (eleccion) {
			case piedra:
				if (numRandom == piedra) {
					System.out.println("Yo "+uno+ " y tú "+uno+ ". ¡Empate!");
				} else if (numRandom == papel) {
					System.out.println("Yo "+uno+ " y tú "+dos+ ". ¡Has ganado!");
				} else
					System.out.println("Yo "+uno+ " y tú "+tres+ ". ¡He ganado!");
				break;
			case papel:
				if (numRandom == papel) {
					System.out.println("Yo "+dos+ " y tú "+uno+ ". ¡He ganado!");
				} else if (numRandom == papel) {
					System.out.println("Yo "+dos+ " y tú "+dos+ ". ¡Empate!");
				} else
					System.out.println("Yo "+dos+ " y tú "+tres+ ". ¡Has ganado!");
				break;
			default:
				if (numRandom == tijera) {
					System.out.println("Yo "+tres+ " y tú "+uno+ ". ¡Has ganado!");
				} else if (numRandom == papel) {
					System.out.println("Yo "+tres+ " y tú "+dos+ ". ¡He ganado!");
				} else
					System.out.println("Yo "+tres+ " y tú "+tres+ ". ¡Empate!");
			}
		} else
			System.out.println("Entiendo que no quieres jugar. Adiós");
	}
}
