package ex3_3;
import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduzca sus notas seguidas de la tecla enter:");
		int x, y, z;
		x = datos.nextInt();
		y = datos.nextInt();
		z = datos.nextInt();
		
		float resultado = ((float)x + y + z) / 3;
		System.out.println("Su nota media es: " +resultado);
	}
}
