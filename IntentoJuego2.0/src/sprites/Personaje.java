package sprites;




import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import datos.DatosDelPersonaje;

import menus.menu;
import batalla.BatallaGolem;
import batalla.PantallaMuerto;
import pantalla.Marco;
import pantalla.Mercader;
import pantalla.Mercado;



public class Personaje extends JPanel {
	

	private int vida = 100;
	private int danyo = 20;
	private int magia;
	private String nombre;
	private int dnyoGolem = 15;


	private Dialogo dialogo;
	private Mercader mercader;
	private Mercado mercado;
	private Marco marco;
	private Movimiento movimientos;
	private BatallaGolem  batalla;
	private Golem golem;
	private DialogoGoleam dialogo2;
	private PantallaMuerto muerto;
	private DialogoObjeto objeto;
	private Objetos magias;
	private ObjetoRecibido cogerObjeto;
	private Board2 board2;
	private Board board;
	private DatosDelPersonaje inventario;
	private menu menuOpciones;
	
	
	



	private int dx;
	private int dy;
	private int x;
	private int y;



	private boolean inventarios;
	private boolean contador = false;
	private boolean contador2 = false;
	private boolean contador3 = false;
	private boolean contador4 = false;
	private boolean contadorObjeto = false;
	private boolean contadormenu = false;
	


	private String craft = "/imagenes/npctopstop.gif";
	private String craft2 = "/imagenes/npcderecha.gif";
	private String craft3 = "/imagenes/npcabajo.gif";
	private String craft4 = "/imagenes/npcizquierda.gif";
	private String craft5 = "/imagenes/npctop.gif";
	private String craft6 = "/imagenes/npctopstop.gif";
	private String craft7 = "/imagenes/guerrerobatalla.gif";
	private String craft8 = "/imagenes/ataquegolem2.gif";






	private Image image;
	private Image image2;
	private Image image6;
	private Image image3;
	private Image image4;
	private Image image5;
	private Image image7;
	private Image image8;




	public Personaje() {



		ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
		ImageIcon i2 = new ImageIcon(this.getClass().getResource(craft2));
		ImageIcon i4 = new ImageIcon(this.getClass().getResource(craft4));
		ImageIcon i3 = new ImageIcon(this.getClass().getResource(craft3));
		ImageIcon i5 = new ImageIcon(this.getClass().getResource(craft5));
		ImageIcon i6 = new ImageIcon(this.getClass().getResource(craft6));
		ImageIcon i7 = new ImageIcon(this.getClass().getResource(craft7));
		ImageIcon i8 = new ImageIcon(this.getClass().getResource(craft8));


		image = ii.getImage();
		image2 = i2.getImage();
		image3 = i3.getImage();
		image4 = i4.getImage();
		image5 = i5.getImage();
		image6 = i6.getImage();
		image7 = i7.getImage();
		image8 = i8.getImage();

		x = 300;
		y = 555;
	}

	
	
	// objeto que activa la magia "fuego" //
	
	
	public int magia(){
		
		
		return magias.activadorFuego();
		
		
	}
	
	
	
	
	// para el dialogo del mercader en el que habla del obeto que hay que encontrar //
	
	 
   public boolean GetContador(){
	   
	   
	   return contador2;
	   
   }
   
   
   public void SetContador(boolean contador){
	   
	   
	   this.contador2 = contador;
   }
   
   //------------------------------fin del dialogo del mercader con respecto al objeto a encontrar //........................
	public Image Image3(){
		
		return image8;
	}
	public Image Image2(){
		
		
		return image7;
	}
	

	public void setNombre(String nombre){

		if(nombre == null || nombre.equals("")|| nombre.equals(" ")){

			this.nombre = "player";
		}
		else{


			this.nombre = nombre;
		}

	}

	public int obtenerVida(){


		return vida;

	}

	public int getdanyo(){


		return danyo;

	}




	public void Vida(int vida){

		if(vida <=0){

			
			
			this.vida = 0;
		}
		
		else{

			this.vida = vida;

		}


	}



	public void setDanyo(int danyo){

		if(danyo > 9999){

			this.danyo = 9999;

		}
		else{

			this.danyo = danyo;
		}

	}


	public void move() {


		x += dx;
		y += dy;

	}

	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}

	public int Izquierda(){

		x = x +2;

		return x ;	

	}

	public int Derecha(){

		x = x -2;
		return x;
	}


	public int Abajo(){

		y = y+2;

		return y;


	}

	public int Arriba(){

		y = y-2;

		return y;


	}

	public Image getImage() {

		if(dx == 0 && dy == 0){


			image = image6;

		}

		if(dx == 2){

			image = image2;

		}

		if(dx == -2 ){

			image = image4;
		}


		if(dy == 2){

			image = image3;

		}


		if(dy == -2){

			image = image5;

		}



		return image;

	}

	
	public boolean contadormenu(){
		
		return contadormenu;
	}


	
	 public boolean GetContador4(){
		   
		   
		   return contador4;
		   
	   }
	   
	   
	   public void SetContador4(boolean contador4){
		   
		   
		   this.contador4 = contador4;
	   }

	public void keyPressed(KeyEvent e) {


		int key = e.getKeyCode();
		
		
		// DIALOGO DEL GOLEM //
		
		if (key == KeyEvent.VK_SPACE && x >=681 && y >=168 && contador == true) {
			
			
			dialogo2= new DialogoGoleam();
			contador2 = true;
			
			
		}
		
		
		// DIALOGO DEL MERCADER (objeto a encontrar ) //
		
		if (key == KeyEvent.VK_SPACE && x <155 && y <105 &&	GetContador() == true){
			
			objeto = new DialogoObjeto();
			contador3 = true;
			
		}
		
		// coger objeto (solucionar para que solo lo haga una vez) //
		
		if (key == KeyEvent.VK_SPACE && x >400 && x <800 && y <630 && y >500 &&	contador3 == true){
			
			cogerObjeto = new ObjetoRecibido();
			
			contador4 = true;
		}
		
		
		

		if (key == KeyEvent.VK_LEFT) {
			dx = -2;

		}


		if (key == KeyEvent.VK_RIGHT) {


			dx = 2;

		}

		if (key == KeyEvent.VK_UP) {
			dy = -2;


		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 2;



		}
		
		
		
		
		
		//primer dialogo del mercader // 
		
		if (key == KeyEvent.VK_SPACE &&  x <155 && y <105 &&  contador == false && GetContador() == false)
				
		{

			
			dialogo = new Dialogo();
			contador = true;
			
		}

		if(key == KeyEvent.VK_I){

			inventario = new DatosDelPersonaje();

			

		}
		
		
		
		if(key == KeyEvent.VK_ESCAPE){

			menuOpciones = new menu();
		}


	}





	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}



		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}

		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}

		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}




	public Rectangle getBounds(){
		return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	}


	public String toString(){

		return String.format ( "                            " +"Vida:" + obtenerVida());

	}
	public String toString2(){

		Vida( vida-dnyoGolem);
		return String.format ( "                           " +" Vida:" + obtenerVida());
	 
	 
	 
}

}
