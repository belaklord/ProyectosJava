package pantalla1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pantalla1.Pantalla1;

public class Vidas extends JPanel {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	public Vidas(){
		
		this.setSize(800,600);
	}
		
	 public void paint(Graphics g){

			Dimension tamanio = getSize();
			ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/boton1.jpg"));        
			g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
			setOpaque(false);
			super.paintComponent(g);
		}
	 
	 
	 
	 
	 
	 
}
