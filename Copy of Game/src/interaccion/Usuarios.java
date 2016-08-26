package interaccion;
import imagenes.imagenGuerrero;

import java.awt.*;
import java.awt.event.*;
import imagenes.imagenMago;
import datos.Datos;

import javax.swing.*; // gui de java interfaz grafica//


public class Usuarios extends JFrame {
	
	
public Usuarios(){
		
		//llamamos al constructor de la super clase jframe//
    	setLocationRelativeTo(null);

		JFrame frame2 = new JFrame ("seleccionado");
		imagenGuerrero guerrero = new imagenGuerrero();
		imagenMago mago = new imagenMago();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		setSize(600, 450);
		setLayout(null);
		
		
		JLabel titulo = new JLabel("seleccion de personaje");
		
		JButton Guerrero = new JButton ("Guerrero");
		JButton Mago = new JButton ("Mago");
		Guerrero.setBounds(100,50,100,30);
		Mago.setBounds(400,50,100,30);
		titulo.setBounds(235,5,200,50);
		
		
		
		add(mago);
		add(guerrero);
		add(Guerrero);
		add(Mago);
		add(guerrero);
		add(titulo);
		
		
		setVisible (true);
		
		
		
		
		
	
			
			Guerrero.addActionListener(new ActionListener(){
			
				
				public void actionPerformed(ActionEvent e) {
					
					
					botonGuerrero btng = new botonGuerrero();
					
					setVisible (false);
					
			}		
					
				
			});
			
				
			
			Mago.addActionListener(new ActionListener(){
				
				
				public void actionPerformed(ActionEvent e) {
					
					
					botonMago btnm = new botonMago();
					setVisible (false);
			
				}
				
			});
			
			
		
	
	
	
	
}
	
	

}
