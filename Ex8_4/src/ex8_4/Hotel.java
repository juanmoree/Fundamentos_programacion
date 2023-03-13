package ex8_4;

public class Hotel extends Edificio {

	protected void calcularCosteVigilancia(int superficie) {
		superficie = getSuperficie();
		int vigilantes = 1;
		while (superficie > 1000) {
			vigilantes++;
			superficie -= 1000;
		}
		final int extraPeligrosidad = 500;
		System.out.println("El coste de vigilancia es de: " + (vigilantes * 1300) + (vigilantes * extraPeligrosidad) + " Euros mensuales");
	}

}
