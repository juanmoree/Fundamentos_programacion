package pruebas;

import java.util.*;

public class Pruebas {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int mult = 1;
			int total = 0;
			ArrayList<Integer> prin = new ArrayList<Integer>();
			total = a + (1 * b);
			for (int j = 1; j <= n; j++) {
				prin.add(total);
				mult = mult * 2;
				total = total + (mult * b);
			}
			for (int k = 0; k < n; k++) {
				System.out.print(prin.get(k) + " ");
			}
			System.out.println();
			prin.clear();

			
		}
		in.close();
	}
}