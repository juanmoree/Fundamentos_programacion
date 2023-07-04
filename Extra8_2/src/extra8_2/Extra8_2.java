package extra8_2;

import java.util.ArrayList;

public class Extra8_2 {

	public static void main(String[] args) {
		
		ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
		Espectador uno = new Espectador("Espectador " + 1, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador dos = new Espectador("Espectador " + 2, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador tres = new Espectador("Espectador " + 3, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador cuatro = new Espectador("Espectador " + 4, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador cinco = new Espectador("Espectador " + 5, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador seis = new Espectador("Espectador " + 6, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador siete = new Espectador("Espectador " + 7, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador ocho = new Espectador("Espectador " + 8, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador nueve = new Espectador("Espectador " + 9, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);
		Espectador diez = new Espectador("Espectador " + 10, (int) (Math.random() * 100 + 1),
				(float) Math.random() * 100);

		espectadores.add(uno);
		espectadores.add(dos);
		espectadores.add(tres);
		espectadores.add(cuatro);
		espectadores.add(cinco);
		espectadores.add(seis);
		espectadores.add(siete);
		espectadores.add(ocho);
		espectadores.add(nueve);
		espectadores.add(diez);

		String alphabet = "ABCDE";
		ArrayList<String> asientos = new ArrayList<>();
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < 5; j++) {
				asientos.add("" + i + alphabet.charAt(j));
			}
		}

		Cine diagonal = new Cine(10.5f);
		Pelicula fastX = new Pelicula("Fast & Furious X", 135, 16, "Louis Leterrier");

		System.out.println("Abriendo la sala para la película " + Pelicula.titulo + ", Precio = "
				+ diagonal.getPrecioEntrada() + "€, para mayores de " + fastX.getEdadMinima());

		ArrayList<String> asientosUsados = new ArrayList<>();

		for (Espectador espectador : espectadores) {
			int asientoRandom = (int) (Math.random() * 14);
			System.out.println("Sentando al " + espectador);
			if (espectador.getEdad() < fastX.getEdadMinima()) {
				System.out.println("El " + espectador.getNombre() + " no tiene edad suficiente");
			} else if (espectador.getDinero() < diagonal.getPrecioEntrada()) {
				System.out.println("El " + espectador.getNombre() + " no tiene suficiente dinero");
			} else {
				if (asientosUsados.size() == 0) {
					asientosUsados.add(asientos.get(asientoRandom));
				} else {
					while (buscarAsiento(asientosUsados, asientos, asientoRandom).equals(asientos.get(asientoRandom))) {
						System.out.println("El asiento " + asientos.get(asientoRandom)
								+ " está ocupado, tratando de buscar otro asiento");
						asientoRandom = (int) (Math.random() * 14);
					}
				}
				System.out.println("Sentado en el asiento " + asientos.get(asientoRandom));
				asientosUsados.add(asientos.get(asientoRandom));
			}
		}
		System.out.println("Se han gestionado a todos los espectadores");
	}

	private static String buscarAsiento(ArrayList<String> asientosUsados, ArrayList<String> asientos,
			int asientoRandom) {
		String asiento = "";
		int i = 0;
		boolean encontrado = false;
		while (i < asientosUsados.size() && !encontrado) {
			if (asientos.get(asientoRandom).equals(asientosUsados.get(i))) {
				encontrado = true;
				asiento = asientos.get(asientoRandom);
			}
			i++;
		}
		return asiento;
	}
}
