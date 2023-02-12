package extra4_1;
import java.util.Scanner;

public class Extra4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int dividendo = datos.nextInt();
		System.out.println("Introduzca un segundo numero comprendido entre el 2 y el 7");
		int divisor = datos.nextInt();
		if (!(divisor > 1 && divisor < 8)) {
			System.out.println("ERROR, segundo numero incorrecto");
		} else {
			if ((dividendo % divisor) == 0) {
				System.out.println(dividendo + " Es múltiplo del " +divisor);
				System.out.println(divisor+ " Multiplicado por "+(dividendo/divisor)+ " es igual a "+dividendo);
			} else {
				System.out.println(dividendo + " No es múltiplo del " +divisor);
			}
		}
	}

}
