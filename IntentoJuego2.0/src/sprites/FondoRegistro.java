package sprites;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoRegistro  extends JPanel {

	
	
	
	
	public FondoRegistro(){
		
		setSize(350, 350);
		
		
	}
	
	
	
	public void paint(Graphics g){
		
		
		 	Dimension tamanio = getSize();
	        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondoRegistro.gif"));        
	        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
	        setOpaque(false);
	        super.paintComponent(g);
		
		
		
	}
	
}
