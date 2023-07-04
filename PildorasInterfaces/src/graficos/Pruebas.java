package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class Pruebas {

	public static void main(String[] args) {

		String fuente = JOptionPane.showInputDialog("Introduce fuente");

		boolean estaLaFuente = false;

		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String nombreFuente : nombresDeFuentes) {
			if (nombreFuente.equals(fuente)) {
				estaLaFuente = true;
			}
		}

		if (estaLaFuente) {
			System.out.println("Fuente instalada");
		} else {
			System.out.println("No esta instalada la fuente");
		}
	}

}
