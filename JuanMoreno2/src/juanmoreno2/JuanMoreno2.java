package juanmoreno2;

import java.util.Scanner;

public class JuanMoreno2 {
	/*
	 *   Realitzeu un programa que determini els diners que rebrà un treballador per
	 * les hores    extra que fa en una empresa. Les hores extra són les que
	 * sobrepassen les 40 hores setmanals    (és a dir, a partir de la 41). Les
	 * primeres 10 es paguen al doble i la resta al triple.   Hauràs de demanar al
	 * treballador les hores totals treballades i quants diners cobra per    cada
	 * hora. El resultat haurà de ser la xifra total de diners que ha guanyat
	 * aquella    setmana.   PD: és possible que treballi menys de 40 hores.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de horas trabajadas");
		byte horas = sc.nextByte();
		System.out.println("Introduzca el precio x hora");
		int precioPorHora = sc.nextInt();

		int total;
		int horasExtra = horas - 40;

		total = horas * precioPorHora;
		if (horasExtra > 0) {
			int doble = precioPorHora * 2;
			total = (doble * horasExtra) + (40 * precioPorHora);
			if (horasExtra > 10) {
				int triple = precioPorHora * 3;
				total = (triple * (horasExtra - 10)) + (10 * doble) + (40 * precioPorHora);
			}
		}
		System.out.println("La cantidad ganada esta semana es de: " + total + "€");
		sc.close();
	}

}
