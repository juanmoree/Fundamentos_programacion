package juanmoreno3;

import java.util.Scanner;

public class JuanMoreno3 {
/* Proxima parada a 200km
 * Pedir: Capacidad del deposito en litros
 * Porcentaje de carb que nos queda
 * Consumo: Cuantos km con 1 litro
 * 3 posibles salidas: 1. Llegamos 2. Llenar 3. Justos
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la capacidad del deposito en litros");
		int deposito = sc.nextInt();
		System.out.println("Introduzca porcentaje de combustible restante");
		int porcentaje = sc.nextInt();
		System.out.println("Introduzca consumo combustible (Km x litro)");
		int consumo = sc.nextInt();
		
		float combustRestante = (float) (deposito * (porcentaje / 100));
		float kmRestantes = (float) (combustRestante * consumo);
		
		if (kmRestantes >= 200) {
			if (kmRestantes == 200) {
				System.out.println("Llegamos justos");
			}
			else
				System.out.println("Llegamos sin repostar");
		}
		else
			System.out.println("Para y llena el deposito");

	}

}
