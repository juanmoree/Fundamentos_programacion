package ex4_6;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte mes;
		byte dia;
		System.out.println("Introduzca el día de nacimiento");
		dia = sc.nextByte();
		System.out.println("Introduzca el mes (1-12) de nacimiento");
		mes = sc.nextByte();

		if (dia > 0 && dia < 32) {
			switch (mes) {
			case 1:
				if (dia <= 19)
					System.out.println("Capricornio");
				else
					System.out.println("Acuario");
				break;
			case 2:
				if (dia <= 18)
					System.out.println("Acuario");
				else if (dia > 29)
					System.out.println("Este día no existe");
				else
					System.out.println("Piscis");
				break;
			case 3:
				if (dia <= 20)
					System.out.println("Piscis");
				else
					System.out.println("Aries");
				break;
			case 4:
				if (dia <= 19)
					System.out.println("Aries");
				else
					System.out.println("Tauro");
				break;
			case 5:
				if (dia <= 20)
					System.out.println("Tauro");
				else
					System.out.println("Géminis");
				break;
			case 6:
				if (dia <= 20)
					System.out.println("Géminis");
				else
					System.out.println("Cáncer");
				break;
			case 7:
				if (dia <= 22)
					System.out.println("Cáncer");
				else
					System.out.println("Leo");
				break;
			case 8:
				if (dia <= 22)
					System.out.println("Leo");
				else
					System.out.println("Virgo");
				break;
			case 9:
				if (dia <= 22)
					System.out.println("Virgo");
				else
					System.out.println("Libra");
				break;
			case 10:
				if (dia <= 22)
					System.out.println("Libra");
				else
					System.out.println("Escorpión");
				break;
			case 11:
				if (dia <= 21)
					System.out.println("Escorpión");
				else
					System.out.println("Sagitario");
				break;
			case 12:
				if (dia <= 21)
					System.out.println("Sagitario");
				else
					System.out.println("Capricornio");
				break;
			default:
				System.out.println("Mes incorrecto, vuelva a intentarlo");
			}
		}
		else
			System.out.println("Fecha incorrecta, vuelva a intentarlo");
	}
}
