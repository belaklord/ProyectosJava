package pantalla;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import sprites.Personaje;

public class Mercader extends JPanel{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Personaje craft;
	private int x,y;
	Image image;
	private Personaje personaje; 
	
	
	
	public Mercader(){
		
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource("/imagenes/mercader.gif"));
	     image = ii.getImage();
	
	     
	     
	     x = 45;
	     y = 40;
		
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
