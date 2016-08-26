package batalla;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MenuBatalla  {
	
	
	// diferentes imágenes de los menus de la batalla //
	
	
	
	private String craft2 = "/imagenes/box-highres1.gif";

	private Image image;
	private int x;
	private int y;
	
	
	public MenuBatalla(){
		
	        
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(craft2));
		image = ii.getImage();
		
		x = 0;
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
