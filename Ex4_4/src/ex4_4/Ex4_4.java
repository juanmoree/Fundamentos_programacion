package ex4_4;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el numero del mes del año");
		Scanner sc = new Scanner(System.in);
		byte num = sc.nextByte();
		String mes;
		switch (num) {
		case 1:
			mes = "enero";
			break;
		case 2:
			mes = "febrero";
			break;
		case 3:
			mes = "marzo";
			break;
		case 4:
			mes = "abril";
			break;
		case 5:
			mes = "mayo";
			break;
		case 6:
			mes = "junio";
			break;
		case 7:
			mes = "julio";
			break;
		case 8:
			mes = "agosto";
			break;
		case 9:
			mes = "septiembre";
			break;
		case 10:
			mes = "octubre";
			break;
		case 11:
			mes = "noviembre";
			break;
		case 12:
			mes = "diciembre";
			break;
		default:
			mes = "Error";
		}
		switch (num) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("El mes de " + mes + " tiene 31 días");
			break;
		case 4, 6, 9, 11:
			System.out.println("El mes de " + mes + " tiene 30 días");
			break;
		case 2:
			System.out.println("El mes de " + mes + " tiene 28 días, 29 en año bisiesto");
			break;
		default:
			System.out.println("Introduzca bien el numero");
		}
	}
}