package ex8_3;

public class Cuenta {
	
	private int numCuenta;
	private int saldo;
	
	public Cuenta(int numCuenta) {
		numCuenta = this.getNumCuenta();
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public int ingresar(int cantidad) {
		saldo += cantidad;
		return saldo;
	}

	public int retirar(int cantidad) {
		if (cantidad <= saldo) {
			saldo -= cantidad;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", Saldo=" + saldo + "]";
	}
	
	
}
