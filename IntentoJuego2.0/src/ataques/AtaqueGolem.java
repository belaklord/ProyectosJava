package ataques;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class AtaqueGolem implements Runnable {

	
public AtaqueGolem(){
		
		
		
	}

	public void run() {
		
		
		
		
		Thread.interrupted();
		
	}
	public void update(Graphics g){
		
		
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/ataquegolem.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,200, 200, null);        
		setOpacity(false);
		
	}


	private void setOpacity(boolean b) {
	
		
	}


	
	

}
