package sprites;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Matas {
	
	
	

	private int x,y;
	Image image;

	 public Matas(){
		 
		  ImageIcon i2 = new ImageIcon(this.getClass().getResource("/imagenes/matas.gif"));
     image = i2.getImage();

	 
     x = 600;
     y = 300;
		 
		 
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


 public Rectangle getBounds(){
	 return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	}

}
