package personaje1;





import java.awt.Image;

import java.awt.Rectangle;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;





public class Personaje extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vida = 100;
	private int danyo = 20;
	private int magia;
	private String nombre;
	private int dnyoGolem = 15;


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
	


	private String craft = "/imagenesPersonaje1/npctopstop.gif";
	private String craft2 = "/imagenesPersonaje1/npcderecha.gif";
	private String craft3 = "/imagenesPersonaje1/npcabajo.gif";
	private String craft4 = "/imagenesPersonaje1/npcizquierda.gif";
	private String craft5 = "/imagenesPersonaje1/npctop.gif";
	private String craft6 = "/imagenesPersonaje1/npctopstop.gif";
	private String craft7 = "/imagenesPersonaje1/guerrerobatalla.gif";
	private String craft8 = "/imagenesPersonaje1/ataquegolem2.gif";






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

		x = 370;
		y = 520;
	}

	
	
	// objeto que activa la magia "fuego" //
	
	
	
	
	
	
	
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
		
		
		
			
			y= y-1;
			
			
		

		return y;


	}

	public Image getImage() {
		
		/*

		if(dx == 0 && dy == 0){


			image = image6;

		}

		
		if(dx == -2 ){

			image = image4;
		}


		if(dy == 2){

			image = image3;

		}

*/
		
		
		if(x < x+13 ){

			image = image2;

		}

		
		
		if(y > y-12){

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
		
		
		
		

		if (key == KeyEvent.VK_LEFT) {
			x = x-3;

		}


		if (key == KeyEvent.VK_RIGHT) {


			x = x+3;

		}

		if (key == KeyEvent.VK_UP) {
			
			y=y-3;

			
		


		}

		if (key == KeyEvent.VK_DOWN) {
			y = y+3;



		}
		
		
		
		
		
		//primer dialogo del mercader // 
		
	

	}





	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		
	

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
