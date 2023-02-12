package extra4_2;
import java.util.Scanner;

public class Extra4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre el 0 y el 99");
		byte num = sc.nextByte();
		if (num >= 0 && num <= 99) {
			while (num >= 20) {
				switch (num) {
				case 20:
					System.out.print("Veinte");
					break;
				case 21, 22, 23, 24, 25, 26, 27, 28, 29:
					System.out.print("Veinti");
					break;
				case 30:
					System.out.print("Treinta");
					break;
				case 31, 32, 33, 34, 35, 36, 37, 38, 39:
					System.out.print("Treinta y ");
					break;
				case 40:
					System.out.print("Cuarenta");
					break;
				case 41, 42, 43, 44, 45, 46, 47, 48, 49:
					System.out.print("Cuarenta y ");
					break;
				case 50:
					System.out.print("Cincuenta");
					break;
				case 51, 52, 53, 54, 55, 56, 57, 58, 59:
					System.out.print("Cincuenta y ");
					break;
				case 60:
					System.out.print("Sesenta");
					break;
				case 61, 62, 63, 64, 65, 66, 67, 68, 69:
					System.out.print("Sesenta y ");
					break;
				case 70:
					System.out.print("Setenta");
					break;
				case 71, 72, 73, 74, 75, 76, 77, 78, 79:
					System.out.print("Setenta y ");
					break;
				case 80:
					System.out.print("Ochenta");
					break;
				case 81, 82, 83, 84, 85, 86, 87, 88, 89:
					System.out.print("Ochenta y ");
					break;
				case 90:
					System.out.print("Noventa");
					break;
				default:
					System.out.print("Noventa y ");
				}
				num %= 10;
			}
			if (num < 20) {
				if (num == 0)
					System.out.println("Cero");
				if (num == 1)
					System.out.println("uno");
				if (num == 2)
					System.out.println("dos");
				if (num == 3)
					System.out.println("tres");
				if (num == 4)
					System.out.println("cuatro");
				if (num == 5)
					System.out.println("cinco");
				if (num == 6)
					System.out.println("seis");
				if (num == 7)
					System.out.println("siete");
				if (num == 8)
					System.out.println("ocho");
				if (num == 9)
					System.out.println("nueve");
				if (num == 10)
					System.out.println("Diez");
				if (num == 11)
					System.out.println("Once");
				if (num == 12)
					System.out.println("Doce");
				if (num == 13)
					System.out.println("Trece");
				if (num == 14)
					System.out.println("Catorce");
				if (num == 15)
					System.out.println("Quince");
				if (num == 16)
					System.out.print("Dieciseis");
				if (num == 17)
					System.out.print("Diecisiete");
				if (num == 18)
					System.out.print("Dieciocho");
				if (num == 19)
					System.out.print("Diecinueve");
			}
		}
		else
			System.out.println("Numero incorrecto");
	}
}