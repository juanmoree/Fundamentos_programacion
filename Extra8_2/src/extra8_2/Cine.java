package extra8_2;

public class Cine {
	private String enReproduccion;
	private float precioEntrada;
	
	
	public Cine(float precioEntrada) {
		this.enReproduccion = Pelicula.titulo;
		this.precioEntrada = precioEntrada;
	}
	public String getEnReproduccion() {
		return enReproduccion;
	}
	public float getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(float precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	@Override
	public String toString() {
		return "Cine [enReproduccion=" + enReproduccion + ", precioEntrada=" + precioEntrada + "]";
	}
}
