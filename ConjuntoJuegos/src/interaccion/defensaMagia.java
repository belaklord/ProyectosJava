package interaccion;
import java.awt.FlowLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import datos.Datos;



public class defensaMagia extends JFrame {
	
	public static String defensaMagia(){
		
		
		int	contador = Datos.datosMago[0].ataque *3;
		
		
		
		Datos.datosGerrero[0].vida = Datos.datosGerrero[0].vida - contador;
		Datos.datosMago[0].mana = Datos.datosMago[0].mana -20;	
		
		return Datos.datosGerrero[0].toString();
	}
	
	

	

}
