package em;

public class Em {

	static int generatenum(int x) {
		int randomnum = (int) (Math.random() * 50 + 1);
		while (randomnum == x) {
			randomnum = (int) (Math.random() * 50 + 1);
		}
		return randomnum;
	}

	static int generatestar(int x) {
		int randomnum = (int) (Math.random() * 12 + 1);
		while (randomnum == x) {
			randomnum = (int) (Math.random() * 12 + 1);
		}
		return randomnum;
	}

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, s1, s2;
		n1 = n2 = n3 = n4 = n5 = s1 = s2 = 0;

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
		s1 = generatestar(s1);
		s2 = generatestar(s1);

		System.out.println("Los números son: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
		System.out.println("Y las estrellas son: " + s1 + " " + s2);
	}
}