package sprites;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoDerrota extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public FondoDerrota(){
		
		
		 setSize(500, 400);
		
		
		
	}

	
	
	public void paint(Graphics g){
		
		
		 	Dimension tamanio = getSize();
	        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondomuerto.gif"));        
	        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
	        setOpaque(false);
	        super.paintComponent(g);
		
		
		
	}
	
	
	
}
