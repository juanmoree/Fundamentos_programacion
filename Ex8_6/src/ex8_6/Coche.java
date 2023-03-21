package ex8_6;

public class Coche {
	private int potencia;
	private int velocidadMaxima;
	private String color;
	private int precioMercado;
	
	public Coche(int potencia, int velocidadMaxima, String color, int precioMercado) {
		super();
		this.potencia = potencia;
		this.velocidadMaxima = velocidadMaxima;
		this.color = color;
		this.precioMercado = precioMercado;
	}
	
	public Coche(int potencia, int velocidadMaxima, String color) {
		this.potencia = potencia;
		this.velocidadMaxima = velocidadMaxima;
		this.color = color;
	}
	
	
	public Coche(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecioMercado() {
		return precioMercado;
	}
	public void setPrecioMercado(int precioMercado) {
		this.precioMercado = precioMercado;
	}
	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", velocidadMaxima=" + velocidadMaxima + ", color=" + color
				+ ", precioMercado=" + precioMercado + "]";
	}
}
