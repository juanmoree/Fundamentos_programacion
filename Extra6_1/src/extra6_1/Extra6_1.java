package extra6_1;

import java.util.*;

public class Extra6_1 {

	public static void method1() {
		System.out.println("Soy un metodo");
	}

	public static int method2(ArrayList<Integer> numbers) {
		int i, max, min;
		int size = numbers.size();
		i = max = 0;
		min = numbers.get(i);
		while (i < size) {

			// Find max
			int actual = numbers.get(i);
			if (i != (size - 1)) {
				int forw = numbers.get(i + 1);
				if (actual > forw && actual > max)
					max = actual;
				else if (forw > actual && forw > max)
					max = forw;
			}

			// Find min
			if (i != 0) {
				int backw = numbers.get(i - 1);
				if (actual < backw && actual < min)
					min = actual;
				else if (backw < actual && backw < min)
					min = backw;
			}
			i++;
		}
		System.out.println("Numero mas grande: " + max);
		return min;
	}

	public static int method3(ArrayList<String> names) {

		int i, max, maxindex;
		i = max = maxindex = 0;

		int size = names.size();

		while (i < size - 1) {
			int actual = names.get(i).length();
			int forw = names.get(i + 1).length();
			if (actual > forw && actual > max) {
				max = actual;
				maxindex = i;
			} else if (forw > actual && forw > max) {
				max = forw;
				maxindex = (i + 1);
			}
			i++;
		}
		return maxindex;
	}

	public static ArrayList<Integer> method4(int x, int y) {
		ArrayList<Integer> among = new ArrayList<Integer>();
		int swap = 0;

		if (x > y) {
			swap = x;
			x = y;
			y = swap;
		}

		while (x < (y - 1)) {
			among.add(x + 1);
			x++;
		}
		return among;
	}

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(8);
		nums.add(12);
		nums.add(5);
		nums.add(22);
		nums.add(6);

		ArrayList<String> names = new ArrayList<String>();
		names.add("Noa");
		names.add("Peter");
		names.add("Victoria");
		names.add("Dani");
		names.add("Sara");

		int x = 2;
		int y = 10;

		method1();
		System.out.println("Numero mas pequeño: " + method2(nums));
		System.out.println("Nombre mas largo: " + names.get(method3(names)));
		System.out.println("Los numeros comprendidos entre " + x + " y " + y + " son: " + method4(x, y));
	}
}