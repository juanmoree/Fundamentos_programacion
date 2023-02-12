package ex3_2;
import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduzca 2 numeros seguidos de la tecla enter:");
		int x, y;
		x = datos.nextInt();
		y = datos.nextInt();
		
		int suma = x + y;
		int resta = x - y;
		int multi = x * y;
		float division = (float)x / y;

		System.out.println("El resultado de la suma es: " +suma+ "\nEl resultado de la resta es: " +resta+ "\nEl resultado de la multiplicacion es: " +multi+ "\nEl resultado de la division es: " +division);
	}

}
