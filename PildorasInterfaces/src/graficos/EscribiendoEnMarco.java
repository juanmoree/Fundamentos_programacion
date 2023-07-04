package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTexto miMarco = new MarcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		setVisible(true);
		setSize(300, 300);
		setLocation(400, 200);
		setTitle("Primer texto");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		// Metodo para que haga lo que se programó
		super.paintComponent(g);
		// Sobrescribiendo...
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}
