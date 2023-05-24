package extra8_1;

import java.util.Scanner;

public class Extra8_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("¿Cuántos jugadores van a jugar?");
		int numJugadores = sc.nextInt();
		if (numJugadores > 6 || numJugadores < 1) {
			numJugadores = 6;
		}
		sc.nextLine();

		Revolver revolver = new Revolver();
		Juego juego = new Juego(revolver);
		
		for (int i = 0; i < numJugadores; i++) {
			System.out.println("Introduzca el nombre del jugador Nº " + (i + 1));
			String nombre = sc.nextLine();
			Jugador j = new Jugador(nombre);
			juego.jugadores.add(j);
		}
		
		juego.ronda();

	}

}
