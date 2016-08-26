package juego;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Sprite {
	private int x,y,width,height,dx,dy;
		    private ImageIcon sprite;
		    private String imagen;
		    
		    public Sprite(String imagen,int x, int y){
		        this.imagen = imagen;
		        this.sprite = new ImageIcon(imagen);
		        this.x = x;
		        this.y = y;
		        this.dx=0;
		        this.dy=0;
		        this.width = sprite.getImage().getWidth(null);
		        this.height = sprite.getImage().getHeight(null);
		    }
		    
		    public Sprite(String imagen,int x, int y, int dx, int dy){
		        this.imagen = imagen;
		        this.sprite = new ImageIcon(imagen);
		        this.x = x;
		        this.y = y;
		        this.dx = dx;
		        this.dy = dy;
		        this.width = sprite.getImage().getWidth(null);
		        this.height = sprite.getImage().getHeight(null);
		    }
		    
		    public void setSprite(ImageIcon sprite){
		        this.sprite=sprite;
		    }
		    public void setImagen(String imagen){
		        this.imagen=imagen;
		    }
		    public void setX(int x){
		        this.x=x;
		    }
		    public void setY(int y){
		        this.y=y;
		    }
		    public void setDx(int dx){
		        this.dx = dx;
		    }
		    public void setDy(int dy){
		        this.dy = dy;
		    }
		    public void setWidth(){
		        this.width=this.sprite.getImage().getWidth(null);
		    }
		    public void setHeight(){
		        this.height=this.sprite.getImage().getHeight(null);
		    }
		    
		    public ImageIcon getSprite(){
		        return this.sprite;
		    }
		    
		    public Image getImage(){
		        return this.sprite.getImage();
		    }
		    public String getImagen(){
		        return this.imagen;
		    }
		    public int getX(){
		        return this.x;
		    }
		    public int getY(){
		        return this.y;
	    }
		    public int getDx(){
		        return this.dx;
		    }
		    public int getDy(){
		        return this.dy;
		    }
		    public int getWidth(){
		        return this.width;
		    }
		    public int getHeight(){
		        return this.height;
		    }
		    public Rectangle getDimension(){
		        return new Rectangle(this.x,this.y,this.width,this.height);
		    }
}
