package pildorasInterfaces;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class PruebaTemporizador {

	
	public static void main(String[] args) {
		
		dameLaHora listener = new dameLaHora();
		// (cada cuantos milisegundos, objeto tipo ActionListener(No es de ese tipo
		// pero la clase dameLaHora implementa esa interfaz))
		Timer myTimer = new Timer(5000, listener);
		myTimer.start();
		
		//Mantiene el programa en ejecucion
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		//Para terminar el programa
		System.exit(0);
	}

}

class dameLaHora implements ActionListener {
	
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		System.out.println("La hora es " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}
