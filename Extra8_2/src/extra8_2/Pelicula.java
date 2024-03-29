package extra8_2;

public class Pelicula {
	protected static String titulo;
	private int duracion;
	private int edadMinima;
	private String director;
	
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		Pelicula.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director="
				+ director + "]";
	}
}
