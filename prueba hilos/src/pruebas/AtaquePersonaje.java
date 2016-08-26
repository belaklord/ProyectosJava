package pruebas;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class AtaquePersonaje implements Runnable {

	
	public void run() {
		
		
		
		
		
	}

	
	public void update(Graphics g){
		

		
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/ataque2.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,200, 200, null);        
		setOpacity(false);
		
		
	}


	private void setOpacity(boolean b) {
		
		
	}
	
	
}
