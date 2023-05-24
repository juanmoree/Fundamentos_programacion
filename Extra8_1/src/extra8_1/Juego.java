package extra8_1;

import java.util.ArrayList;

public class Juego {
	protected ArrayList<Jugador> jugadores;
	private Revolver revolver;

	public Juego(Revolver revolver) {
		super();
		this.revolver = revolver;
		this.jugadores = new ArrayList<>();
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public Revolver getRevolver() {
		return revolver;
	}

	public boolean finJuego() {
		boolean fin = false;
		for (int i = 0; i < jugadores.size(); i++) {
			if (jugadores.get(i).jugar(revolver)) {
				fin = true;
			}
		}
		return fin;
	}

	public void ronda() {
		boolean terminado = false;
		int i = 0;

		while (!terminado && i < jugadores.size()) {
			if (!jugadores.get(i).jugar(revolver)) {
				System.out.println(jugadores.get(i).nickname + " se dispara, no ha muerto en esta ronda");
			} else {
				System.out.println(jugadores.get(i).nickname + " se dispara y ha muerto, fin del juego");
				terminado = true;
			}
			i++;
		}
	}

	@Override
	public String toString() {
		return "Juego [revolver=" + revolver + "]";
	}
}
