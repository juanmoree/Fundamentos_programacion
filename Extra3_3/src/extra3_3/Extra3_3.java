package extra3_3;
import java.util.Scanner;

public class Extra3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int coberturaLitro = 12;
		Scanner datos = new Scanner (System.in);
		System.out.println("Introduzca el ancho de la pared");
		int ancho = datos.nextInt();
		System.out.println("Introduzca el alto de la pared");
		int alto = datos.nextInt();
		System.out.println("Introduzca el numero de manos a aplicar");
		int manos = datos.nextInt();
		float litros = (float)ancho * alto * manos / coberturaLitro;
		System.out.println("El numero de litros a utilizar es: " +litros);
	}
}