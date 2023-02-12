package extra3_1;
import java.util.Scanner;

public class Extra3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);
		System.out.println("Introduzca un numero:");
		int x = num.nextInt();
		int doble = x * 2;
		int triple = x * 3;
		
		System.out.println("El doble de su numero es: " +doble+ "\nY el triple es: " +triple);
	}
}
