package colegio;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Alumnos> alumni = new ArrayList<Alumnos>();

		System.out.println("Introduzca el dni");
		String dni = sc.nextLine();

		Alumnos alumno1 = new Alumnos("87896543H");
		Alumnos alumno2 = new Alumnos("Pedro", "Perez", "26329384K", 20);

		alumno1.setName("Juan");
		alumno1.setLastName("Moreno");
		alumno1.setAge(28);

		alumni.add(alumno1);
		alumni.add(alumno2);

		if (createAlumn(alumni, dni) == true) {
			System.out.println("Dni no encontrado, puedes continuar");
			Alumnos alumno3 = new Alumnos(dni);
			System.out.println("Introduzca el nombre");
			String name = sc.nextLine();
			alumno3.setName(name);
			System.out.println("Introduzca el apellido");
			String lastName = sc.nextLine();
			alumno3.setLastName(lastName);
			System.out.println("Introduzca la edad");
			int age = sc.nextInt();
			alumno3.setAge(age);
			alumni.add(alumno3);
		}

		for (int i = 0; i < alumni.size(); i++) {
			System.out.println("Alumno " + i + ":" + alumni.get(i));
		}

	}

	private static boolean createAlumn(ArrayList<Alumnos> alumni, String dni) {
		boolean ok = true;
		int i = 0;

		while (i < alumni.size() && ok) {
			if (alumni.get(i).getDni().equals(dni)) {
				System.out.println("Dni ya introducido");
				ok = false;
			}
			i++;
		}
		return ok;
	}
}
