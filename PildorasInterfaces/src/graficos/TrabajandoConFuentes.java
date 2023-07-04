package graficos;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		
		MarcoConFuentes miMarco = new MarcoConFuentes();
		
	}
}
	
class MarcoConFuentes extends JFrame{
		
		public MarcoConFuentes() {
			setTitle("Probando con fuentes");
			setSize(400,400);
			setVisible(true);
			LaminaConFuentes miLamina = new LaminaConFuentes();
			add (miLamina);
			//Establece todo lo que se va a "Dibujar" a este color por defecto.
			miLamina.setForeground(Color.GREEN);
		}
	}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Color miColor = new Color(25, 36, 255);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font miFuente = new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(miFuente);
		//g2.setPaint(miColor);
		g2.drawString("Juan", 100, 100);
		
		g2.setFont(new Font("Courier", Font.ITALIC, 15));
		//g2.setColor(Color.red.darker());
		g2.drawString("Moreno", 170, 100);
		
		
	}
}
