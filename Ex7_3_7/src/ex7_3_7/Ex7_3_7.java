package ex7_3_7;

import java.util.Scanner;

public class Ex7_3_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca precio/Kg Fideos");
		float fideos = sc.nextFloat();
		System.out.println("Introduzca precio/Kg Calamar");
		float calamar = sc.nextFloat();
		System.out.println("Introduzca precio/Kg Gambas");
		float gambas = sc.nextFloat();
		System.out.println("Introduzca la cantidad de personas que van a comer");
		byte cantPersonas = sc.nextByte();
		
		// Unidades x persona
		float unFideos = (float) (0.5 / 4);
		float unCalamar = (float) (0.4 / 4);
		float unGambas = (float) (0.2 / 4);
		
		// Precio x persona
		float xFideos = fideos * unFideos;
		float xCalamar = calamar * unCalamar;
		float xGambas = gambas * unGambas;
		
		// Total ingredientes
		float totalFideos = cantPersonas * unFideos;
		float totalCalamar = cantPersonas * unCalamar;
		float totalGambas = cantPersonas * unGambas;
		
		float total = (xFideos + xCalamar + xGambas) * cantPersonas;
		
		System.out.println("Se necesitan " + totalFideos + "kg de fideos"
				+ " " + totalCalamar + "kg de calamar" + 
				" y " + totalGambas + "kg de Gambas");
		System.out.println("El precio por persona es de " + (xFideos + xCalamar + xGambas));
		System.out.println("Y el precio total es de: " + total);
	}

}