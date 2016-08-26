package pantalla;
import java.awt.Rectangle;

import java.awt.Image;

import javax.swing.ImageIcon;
public class Mercado  {
	
	private int x,y;
	Image image;

	 public Mercado(){
		 
	     ImageIcon ii = new ImageIcon(this.getClass().getResource("/imagenes/marcado.gif"));
	     image = ii.getImage();
	
	     
	     
	     x = 0;
	     y = 0;
	
	
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
