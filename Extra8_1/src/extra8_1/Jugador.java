package extra8_1;

public class Jugador {
	private static int id = 0;
	protected String nombre;
	protected String nickname;
	private String vivo;

	public Jugador(String nombre) {
		this.nombre = nombre;
		Jugador.id = siguienteId();
		this.nickname = "Jugador " + id + " " + nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private int siguienteId() {
		Jugador.id++;
		return id;
	}

	public int getId() {
		return id;
	}

	public String getNickname() {
		return nickname;
	}

	public String getVivo() {
		return vivo;
	}

	public boolean jugar(Revolver r) {
		boolean jugadorMuerto = false;
		if (r.disparar()) {
			jugadorMuerto = true;
		} else {
			r.siguienteBala();
		}
		return jugadorMuerto;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", nickname=" + nickname + ", vivo=" + vivo + "]";
	}

}
