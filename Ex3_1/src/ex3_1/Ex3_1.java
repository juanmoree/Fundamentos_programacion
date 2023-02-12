package ex3_1;
import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		String nombre;
		String apellido;
		int edad;
		System.out.println("Introduzca su nombre: ");
		nombre = datos.nextLine();
		
		System.out.println("Introduzca su apellido: ");
		apellido = datos.nextLine();
		
		System.out.println("Introduzca su edad: ");
		edad = datos.nextInt();
		
		if (edad < 18) {
			System.out.println(nombre+ " "+apellido+ ", eres MENOR de edad");
		}
		else
			System.out.println(nombre+ " "+apellido+ ", eres MAYOR de edad");
	}
}
