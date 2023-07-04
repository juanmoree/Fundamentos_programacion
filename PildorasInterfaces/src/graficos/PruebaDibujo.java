package graficos;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos miDibujo = new MarcoConDibujos();
		
		miDibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos () {
		
		setTitle("Prueba de dibujos");
		setSize(400, 400);
		setVisible(true);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		
		add(miLamina);
		
		miLamina.setBackground(SystemColor.window);
	}
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 300, 200);
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		// Orden, set paint para escoger color, y dibujar o rellenar.
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		
		//g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		//g2.draw(elipse);
		
		Color miColor = new Color(129, 239, 200);
		
		g2.setPaint(new Color(109,172,59).brighter());
		//g2.setPaint(miColor);
		g2.fill(elipse);
		
		//g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		// Video 60
		double centroX = rectangulo.getCenterX();
		double centroY = rectangulo.getCenterY();
		double radio = 120;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		//circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		
		//g2.draw(circulo);
		
		// Video 61
		
		
	}
}