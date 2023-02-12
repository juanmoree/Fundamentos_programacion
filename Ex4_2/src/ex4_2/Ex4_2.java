package ex4_2;
import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner (System.in);
		System.out.println("Introduzca su edad");
		int edad = datos.nextInt();
		if (edad <= 5) {
			System.out.println("Preescolar");
		}
		else if (edad <= 11) {
			System.out.println("Primaria");
		}
		else if (edad <= 15) {
			System.out.println("ESO");
		}
		else if (edad <= 17) {
			System.out.println("Bachillerato");
		}
		else
			System.out.println("FP o Universidad");
	}
}
