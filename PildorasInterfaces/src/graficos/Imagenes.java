package graficos;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class Imagenes {

	public static void main(String[] args) {

		MarcoConImagenes miMarco = new MarcoConImagenes();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		;

	}
}

class MarcoConImagenes extends JFrame {

	public MarcoConImagenes() {
		setTitle("Probando con imagenes");
		setBounds(500, 250, 400, 200);
		// setSize(400, 400);
		setVisible(true);
		LaminaConImagenes miLamina = new LaminaConImagenes();
		add(miLamina);
		// Establece todo lo que se va a "Dibujar" a este color por defecto.
		miLamina.setForeground(Color.GREEN);
	}
}

class LaminaConImagenes extends JPanel {
	private Image imagen;
	
	public LaminaConImagenes() {
		try {
			imagen = ImageIO.read(new File("src/graficos/bola.png"));
		} catch (IOException e) {
			System.out.println("Hola");
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// this = referencia al objeto donde estoy trabajando (Lamina)
		int anchura = imagen.getWidth(this);
		int altura = imagen.getHeight(this);

		g.drawImage(imagen, 0, 0, null);

		for (int i = 0; i < 500; i++) {
			for (int j = 0; j < 500; j++) {
				if (i + j > 0) {
					g.copyArea(0, 0, anchura, altura, anchura * i, altura * j);
				}
			}
		}

	}
}
