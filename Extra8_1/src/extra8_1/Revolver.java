package extra8_1;

public class Revolver {
	private int posActual = (int) (Math.random() * 6 + 1);
	private int posBala = (int) (Math.random() * 6 + 1);
	
	/*
	 * public Revolver() { posActual = (int) (Math.random() * 6 + 1); posBala =
	 * (int) (Math.random() * 6 + 1); }
	 */
	
	public int getPosActual() {
		return posActual;
	}
	public int getPosBala() {
		return posBala;
	}
	
	public boolean disparar() {
		boolean disparado = false;
		
		if (posActual == posBala) { //corregir : No estan cambiando las posiciones
			disparado = true;
		}
		
		return disparado;
	}
	
	public int siguienteBala() {
		if(posActual == 6) {
			posActual = 1;
		} else {
			posActual++;
		}
		return posActual;
	}
	
	public String informa() {
		return "Revolver [posActual=" + posActual + ", posBala=" + posBala + "]";
	}
}
