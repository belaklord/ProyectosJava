package pantalla;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Mapasingolem extends JPanel {
	
	
	public Mapasingolem(){
		
		 this.setSize(800,630);
		 
	}
	
	public void paint(Graphics g){
		
		
		
		
       Dimension tamanio = getSize();
       ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/mapasingolem.gif"));        
       g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
       setOpaque(false);
       super.paintComponent(g);
	
	}
}
