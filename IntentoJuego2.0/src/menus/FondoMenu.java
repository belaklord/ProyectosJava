package menus;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FondoMenu extends JPanel {
	
	Image image;
	
	
	public FondoMenu(){
		
		this.setSize(300, 200);
		
		
		 
	}
public void paint(Graphics g){
		
		
		
		
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondomenu.jpg"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        super.paintComponent(g);
}
	
}
