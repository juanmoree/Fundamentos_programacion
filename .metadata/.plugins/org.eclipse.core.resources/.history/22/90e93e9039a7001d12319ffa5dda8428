package bl;

public class Bl {

	static int generatenum(int x) {
		int randomnum = (int) (Math.random() * 49 + 1);
		while (randomnum == x) {
			randomnum = (int) (Math.random() * 49 + 1);
		}
		return randomnum;
	}

	public static void main(String[] args) {

		int n1, n2, n3, n4, n5, n6;
		n1 = n2 = n3 = n4 = n5 = n6 = 0;

		n1 = generatenum(n1);
		n2 = generatenum(n1);
		n3 = generatenum(n2);

		while (n3 == n2 || n3 == n1) {
			n3 = generatenum(n3);
		}

		n4 = generatenum(n3);
		while (n4 == n3 || n4 == n2 || n4 == n1) {
			n4 = generatenum(n4);
		}

		n5 = generatenum(n4);
		while (n5 == n4 || n5 == n3 || n5 == n2 || n5 == n1) {
			n5 = generatenum(n5);
		}

		n6 = generatenum(n5);
		while (n6 == n5 || n6 == n4 || n6 == n3 || n6 == n2 || n6 == n1) {
			n5 = generatenum(n5);
		}

		System.out.println("Los números son: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}
}
