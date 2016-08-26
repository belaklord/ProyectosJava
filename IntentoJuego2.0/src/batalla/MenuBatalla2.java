package batalla;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class MenuBatalla2 {
	
	
	private String craft2 = "/imagenes/box-highres2.gif";

	private Image image;
	private int x;
	private int y;
	
	
	
	public MenuBatalla2(){
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(craft2));
		image = ii.getImage();
		
		x = 150;
		y = 480;
		
		
	}
	
	

	public Image getImage() {
		return image;
	}



	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
