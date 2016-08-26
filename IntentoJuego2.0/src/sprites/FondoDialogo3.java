package sprites;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoDialogo3  extends JPanel{
	
	public FondoDialogo3(){
		
		 setSize(500, 400);
		
		
	}
	
	
	
	public void paint(Graphics g){
		
		
		 Dimension tamanio = getSize();
	        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/DialogoMercader1.gif"));        
	        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
	        setOpaque(false);
	        super.paintComponent(g);
		
		
		
	}
	

}
