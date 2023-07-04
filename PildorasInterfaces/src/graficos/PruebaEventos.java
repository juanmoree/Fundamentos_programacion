package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame {

	public MarcoBotones() {
		setVisible(true);
		setTitle("Botones y eventos");
		setBounds(400, 200, 500, 300);

		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
}

class LaminaBotones extends JPanel implements ActionListener {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);

		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// getSource obtiene el objeto fuente (Origen evento)
		Object botonPulsado = e.getSource();

		if (botonPulsado == botonAzul) {
			setBackground(Color.blue);
		} else if (botonPulsado == botonAmarillo) {
			setBackground(Color.yellow);
		} else {
			setBackground(Color.red);
		}
	}
}
