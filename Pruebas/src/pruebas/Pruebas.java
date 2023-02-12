package pruebas;

import java.util.*;

public class Pruebas {

	public static void main(String[] args) {
		socElMetode(); // para tasca 1

		ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>(); // para tasca 2
		arrayOfNumbers.add(-4);
		arrayOfNumbers.add(5);
		arrayOfNumbers.add(155);
		arrayOfNumbers.add(78);
		arrayOfNumbers.add(7);
		arrayOfNumbers.add(6);
		arrayOfNumbers.add(1);
		arrayOfNumbers.add(777);
		System.out.println("Número més petit " + arrayOfNumbers.get(bigAndSmall(arrayOfNumbers)));

		ArrayList<String> arrayOfNames = new ArrayList<String>();// para tasca 3
		arrayOfNames.add("Noa");
		arrayOfNames.add("Peter");
		arrayOfNames.add("Victòria");
		arrayOfNames.add("Dani");
		arrayOfNames.add("Saralkdkljsa");
		System.out.println("Nom més llarg: " + arrayOfNames.get(nameMoreLong(arrayOfNames)));

		System.out.println(betweenTwoNumbers(2, 12));

	}

	static void socElMetode() { // tasca 1
		System.out.println("soc un mètode");
	}

	static int bigAndSmall(ArrayList<Integer> array) { // tasca 2
		int bigNumber = array.get(0);
		int smallNumber = array.get(0);
		int indexOfSmall = 0;
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i) > bigNumber) {
				bigNumber = array.get(i);
			}
			if (array.get(i) < smallNumber) {
				smallNumber = array.get(i);
				indexOfSmall = i;
			}
		}
		System.out.println("Número més gran " + bigNumber);
		return indexOfSmall;
	}

	static int nameMoreLong(ArrayList<String> array) { // tasca 3
		int index = 0;
		int length = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).length() > length) {
				length = array.get(i).length();
				index = i;
			}
		}
		return index;
	}

	static ArrayList<Integer> betweenTwoNumbers(int a, int b) { //tasca 4
		ArrayList<Integer> array = new ArrayList<Integer>();
		int tempVar;
		if (b < a) {
			tempVar = b;
			b = a;
			a = tempVar;
		}
		for (int i = 1; i < b - a; i++) {
			array.add(a + i);
		}

		return array;
	}

}