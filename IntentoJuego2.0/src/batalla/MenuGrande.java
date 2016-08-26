package batalla;

import java.awt.Image;

import javax.swing.ImageIcon;

public class MenuGrande {

	private String craft2 = "/imagenes/menuprueba.gif";

	private Image image;
	private int x;
	private int y;
	
	
	
	public MenuGrande(){
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(craft2));
		image = ii.getImage();
		
		x = 380;
		y = 520;
		
		
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
