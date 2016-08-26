package batalla;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.Timer;

import sprites.Golem;
import sprites.Personaje;



public class Puntero{
	
	private String craft2 = "/imagenes/flecha.gif";
	private String craft = "/imagenes/ataque2.gif";
	private String craft3 = "/imagenes/ataquegolem.gif";
	private String craft4 = "/imagenes/ataquegolem2.gif";
	private String craft5 = "/imagenes/fuego.gif";
	
	private Image image4;
	private Image image3;
	private Image image;
	private Image image2;
	private Image image5;
	
	
	private MenuBatalla2 batalla2;
	private Golem golem;
	private Personaje personaje;
	
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	
	private boolean panel2 = (false);
	private boolean atacado;
	private boolean ataque ;
	private boolean personajeAtacado =(false);
	private boolean Fuego = (false);
	
	
	public Puntero(){
		
		golem = new Golem();
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
		ImageIcon i2 = new ImageIcon(this.getClass().getResource(craft2));
		ImageIcon i3 = new ImageIcon(this.getClass().getResource(craft3));
		ImageIcon i4 = new ImageIcon(this.getClass().getResource(craft4));
		ImageIcon i5 = new ImageIcon(this.getClass().getResource(craft5));
		
		
		
		image2 = ii.getImage();
		image = i2.getImage();
		image3 = i3.getImage();
		image4 = i4.getImage();
		image5 = i5.getImage();
		
		x = 25;
		y = 505;
		
		
		
	}
	
	
	
	public boolean fuego(boolean fuego){
		
		return fuego;
		
	}
	
	
	public boolean fuego(){
		
		
		return Fuego;
	}
	public boolean personajeAtacado(boolean atacado){
		
		
		return atacado;
		
	}
	
	
	public boolean personajeAtacado(){
		
		return personajeAtacado;
		
	}
	public boolean ataque(boolean ataque){
		
		
		return ataque;
		
	}
	
	public boolean ataque2(boolean atacar){
		
		return atacar;
		
	}
	public boolean ataque(){
		
		return ataque;
		
	}
	
	public boolean atacado(){
		
		
		return atacado;
		
	}
	public boolean panel2 (){
		
		return panel2;
		
	}
	
	public void move(){
		
		
		x+= dx;
		y += dy;
		
	}



	public int getX() {
		return x;
	}


	


	public int getY() {
		return y;
	}
	
	public Image getImage5(){
		
		return image5;
		
	}

	public Image getImage4(){
	
	return image4;
	
}
	public Image getImage3(){
		
		
		return image3;
	}

	public Image getImage2() {

		return image2;


	}

	public Image getImage(){

		return image;

	}
	

	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		
		
		// magia//
		if (key == KeyEvent.VK_UP && y >505) {
			
			y = y-40;


		}
		// objeto //
		if (key == KeyEvent.VK_DOWN && y <585) {
			y = y +40;


		}
		// magia menu //
		
		
		if(key == KeyEvent.VK_RIGHT && y == 545 ){
			panel2 = true;
			x = 150;
			y = 505;
			}
			if (key == KeyEvent.VK_LEFT){
				
				
				x = 25;
				y = 505;
				
			}
			
		if(key == KeyEvent.VK_SPACE && x == 150 && y == 505){
			
			Fuego = true;
			
		}
		
		
		
		
		if(key == KeyEvent.VK_SPACE && y == 505 && x == 25){
			Fuego = false;
			ataque = true;
			atacado = true;
			
			personajeAtacado = false;
			
		}
	
		
	}
	
	

	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();


		if (key == KeyEvent.VK_UP) {
			y = y;
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
			
		}

		if(key == KeyEvent.VK_SPACE){
			
			
			ataque = false;
			
			atacado = false;
			
			personajeAtacado = true;
			
			
			try {
				Thread.sleep (1000);
			} catch (Exception e1) {
				System.out.println("error");
			}
			
			Fuego = false;
			
			
			
			
		}
	}



	

	
	
	
	
	
	
	
}
