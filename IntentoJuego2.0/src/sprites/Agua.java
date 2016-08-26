package sprites;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Agua {
	
	
	
	private int x,y;
	Image image;
	
	
	public Agua(){
		
		 ImageIcon i2 = new ImageIcon(this.getClass().getResource("/imagenes/agua.gif"));
	     image = i2.getImage();
	
		 
	     x = 270;
	     y = -150;
		
		
	}
	 public int getX(){
	     return x;
	 }

	 public int getY(){
	     return y;
	 }

	 
	 
	 public int setX(){
		 
		 
		  
		  return x;
		  
	  }
	    
	    public int setY(){
	    	
	    	return y;
	    	
	    	
	    }
	 public Image getImage(){
	     return image;
	 }

}
