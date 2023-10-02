import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String letters[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		int i = 0;
		int count = 0;

		// Orden
		fifo(letters);

	}

	private static void fifo(String[] letters) {
		boolean apilar = true;

		System.out.println(letters.length);
		while (apilar) {
			int i = 1;

			if (letters.length == 0) {
				System.out.println("Ingrese caracter");
				letters[0] = sc.nextLine();
			} else {
				System.out.println("Desea apilar otra letra?");
				String pregunta = sc.nextLine();
				char decision = pregunta.charAt(0);
				if (decision == 's' || decision == 'S') {
					letters[(letters.length + 1)];
					System.out.println("Ingrese caracter");
					letters[letters.length] += sc.nextLine();
				} else {
					apilar = false;
				}
			}
		}
		System.out.println(letters.length);
	}
}