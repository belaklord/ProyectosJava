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


public class defensaMagGuerrero extends JFrame {
	
	
	public static String  defensaMagGuerrero(){
		
		
			int	contador = Datos.datosGerrero[0].ataque *2;
		
		
		
		Datos.datosMago[0].vida = Datos.datosMago[0].vida - contador;
		Datos.datosGerrero[0].mana = Datos.datosGerrero[0].mana -10;
		
		return Datos.datosMago[0].toString();
		
		
		
	}
	
	

}
