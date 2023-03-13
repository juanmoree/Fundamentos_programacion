package ex8_4;

public class Cine extends Edificio {
	protected void calcularCosteVigilancia(int superficie) {
		superficie = getSuperficie();
		int vigilantes = 1;
		while (superficie > 3000) {
			vigilantes++;
			superficie -= 3000;
		}
		System.out.println("El coste de vigilancia es de: " + (vigilantes * 1300) + " Euros mensuales");
	}
}
