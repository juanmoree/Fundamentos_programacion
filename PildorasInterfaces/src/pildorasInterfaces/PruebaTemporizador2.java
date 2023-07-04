package pildorasInterfaces;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj miReloj = new Reloj(3000, true);
		
		miReloj.empieza();
		
		JOptionPane.showMessageDialog(null, "Pulsa ok para finalizar");
		
		System.exit(0);
	}

}

class Reloj {
	private int intervalo;
	private boolean sonido;
	
	public Reloj (int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void empieza() {
		ActionListener listener = new dameLaHora2();
		
		Timer myTimer = new Timer(intervalo, listener);
		
		myTimer.start();
	}
	
	private class dameLaHora2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			Date ahora = new Date();
			System.out.println("La hora es: " + ahora);
			
			// Variable sonido no está definida
			// Al ser una clase interna puede acceder a las variables de la clase global (Reloj), no hay que usar Getters, Setters.
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}
