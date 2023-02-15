package extratoppings;

import java.util.Scanner;

public class ExtraToppings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float result = 0;
		float solo, oreo, kit, brow, mym;
		int sel;
		solo = (float) 1.9; // preguntar por que tengo que hacer cast
		oreo = 1.0f;
		kit = 1.5f;
		brow = (float) 0.75;
		mym = (float) 0.95;
		System.out.println("Buenos, días, indica el topping para tu helado:");
		System.out.println("0. Sin topping");
		System.out.println("1. Topping de Oreo");
		System.out.println("2. Topping de KitKat");
		System.out.println("3. Topping de Brownie");
		System.out.println("4. Topping de M&M");
		System.out.println("¿Que topping deseas?");
		sel = sc.nextInt();
		if (sel < 5 && sel >= 0) {
			switch (sel) {
			case 0:
				result = solo;
				break;
			case 1:
				result = solo + oreo;
				break;
			case 2:
				result = solo + kit;
				break;
			case 3:
				result = solo + brow;
				break;
			default:
				result = solo + mym;
			}
			System.out.println("El precio de su helado es " + result + "€");
		} else
			System.out.println("No tenemos ese topping, lo sentimos");
		sc.close();
	}
}