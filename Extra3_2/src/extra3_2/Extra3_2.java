package extra3_2;
import java.util.Scanner;

public class Extra3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Introduzca un numero del 1 al 9");
		int varInt = num.nextInt();
		if (varInt > 9)
			varInt = 1;
		int i = 1;
		while (i <= 10) {
			System.out.println(varInt + " multiplicado por " +i+ " es: " +(varInt * i));
			i++;
		}
	}

}
