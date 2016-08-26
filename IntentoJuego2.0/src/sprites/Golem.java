package sprites;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import batalla.PantallaMuerto;
import batalla.Puntero;
import sprites.Personaje;



public class Golem extends JPanel {
	
	PantallaMuerto muerto;
	Objetos magia;
	private int vida = 500;
	private int danyo = 15;
	private int personajeDanyo = 20;
	private String nombre;
	private int x,y;
	Image image;
	private boolean contadorSalida = false;

	
	
	 public Golem(){
		
		  
		 
		 
		 ImageIcon i2 = new ImageIcon(this.getClass().getResource("/imagenes/golem.gif"));
	     image = i2.getImage();
	
		 
	     x = 700;
	     y = 80;
	
		
	     
	 }
	 
	
	
	public int getdanyo(){
		 return danyo;
		 
		 
	 }
	 
	 public int getvida(){
		 
		 
		 return vida;
	 }

	 public String getnombre(){
		 
		 return nombre;
	 }
	 
	 
	 public void setDanyo(int danyo){
		 
		 if(danyo >20){
			 
			 this.danyo = 20;
			 
		 }
		 else{
			 
			this.danyo = danyo;
			 
		 }
	 }
	 
	 public void setVida(int vida){
		 
		 if(vida <= 0){
			 
			 this.vida = 0;
			 
			 contadorSalida = true;
			 
		 }
		
		 else{
			 
			 this.vida = vida;
			 
		 }
		 
	 }
	 
	
	 
	 
	 public void setNombre(String nombre){
		 
		 if(nombre == null || nombre.equals("")|| nombre.equals(" ")){
			 
			 this.nombre = "player1";
			 
			 
		 }
		 else{
			 
			 this.nombre = nombre;
		 }
		 
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
	
	
	 
	 public String toString(){
		 
		
			 
			 return String.format ( "                            " +"Vida:" +getvida( ));
		 }
		 
		
	
	 
	 public String toString2(){
		 
		 setVida( vida-personajeDanyo);
		 return String.format ( "                            "+"Vida:" + getvida());
		 
		 
		 
	 }

	 public String toStringFuego(){
		 
		 setVida( vida-100);
		 return String.format ( "                            "+"Vida:" + getvida());
		 
	 }
	 
	 
}
