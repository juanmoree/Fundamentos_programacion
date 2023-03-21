package juanMoreno;

public class LineaFactura {
	protected int numeroLinea;
	protected String nombreArticulo;
	protected String descripcion;
	protected int cantidad;
	protected float precio;
	
	public LineaFactura(int numeroLinea, String nombreArticulo, String descripcion, int cantidad, float precio) {
		this.numeroLinea = numeroLinea;
		this.nombreArticulo = nombreArticulo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public int getNumeroLinea() {
		return numeroLinea;
	}
	public void setNumeroLinea(int numeroLinea) {
		this.numeroLinea = numeroLinea;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "LineaFactura [numeroLinea=" + numeroLinea + ", nombreArticulo=" + nombreArticulo + ", descripcion="
				+ descripcion + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
