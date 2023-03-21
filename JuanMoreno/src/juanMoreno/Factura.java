package juanMoreno;

import java.util.ArrayList;

public class Factura {
	private int numeroFactura;
	private String nombreCliente;
	private String direccion;
	private long telefono;
	private float total;
	private ArrayList<LineaFactura> lineasFactura;
	
	public Factura(int numeroFactura, String nombreCliente, String direccion, long telefono) {
		this.numeroFactura = numeroFactura;
		this.nombreCliente = nombreCliente;
		this.direccion = direccion;
		this.telefono = telefono;
		this.lineasFactura = new ArrayList<>();
	}
	
	public int getNumeroFactura() {
		return numeroFactura;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public float getTotal() {
		int i = 0;
		while (i < lineasFactura.size()) {
			int cantidad = lineasFactura.get(i).getCantidad();
			float precio = lineasFactura.get(i).getPrecio();
			this.total += (cantidad * precio);
			i++;
		}
		return total;
	}
	
	public ArrayList<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}

	@Override
	public String toString() {
		return "Factura [numeroFactura=" + numeroFactura + ", nombreCliente=" + nombreCliente + ", direccion="
				+ direccion + ", telefono=" + telefono + ", total=" + getTotal() + "]";
	}
	
	
}
