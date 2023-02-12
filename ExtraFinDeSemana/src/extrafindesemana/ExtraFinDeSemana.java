package extrafindesemana;

import java.util.Scanner;

public class ExtraFinDeSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero del 1 al 7, 1 para lunes, 7 para domingo");
		int dia = sc.nextInt();
		if (dia > 0 && dia < 8)
			switch (dia) {
			case 1:
				System.out.println("Faltan 5 dias para el fin de semana: Lun, mar, mie, jue y vie.");
				break;
			case 2:
				System.out.println("Faltan 4 dias para el fin de semana: Mar, mie, jue y vie.");
				break;
			case 3:
				System.out.println("Faltan 3 dias para el fin de semana: Mie, jue y vie.");
				break;
			case 4:
				System.out.println("Faltan 2 dias para el fin de semana: Jue y vie.");
				break;
			case 5:
				System.out.println("Falta 1 dia para el fin de semana: Vie.");
				break;
			case 6, 7:
				System.out.println("Ya estas en el fin de semana");
			break;
			}
		else
			System.out.println("Ese no es un dia de la semana");
	}
}
