package pantalla1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import personaje1.Personaje;

import pantalla1.Vidas;



						//ERROR AL A�ADIR LA IMAGEN DEL BOTON PARA LA VIDA //



public class Pantalla1 extends JFrame implements ItemListener, ActionListener {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image buffer;
	Graphics pantallaPrincipal;
	ImagenBloque bloques;
	private Timer timer;
	private Personaje personaje;
	Vidas vida;
	public Image image;
	boolean contador = true;
	public  JButton boton1;
	Pantalla1 pantalla;
	ImagenFondo imagenfondo;



	public Pantalla1(){


		setSize(800, 600);
		setLocationRelativeTo(null);
		this.setUndecorated(true);
		addKeyListener(new TAdapter());
		setResizable(false);
		setVisible(true);
		
		
		
		
		ImagenBloque p = new ImagenBloque();
		this.add( p , BorderLayout.CENTER);
		
		ImagenFondo q = new ImagenFondo();
		
		this.add( q , BorderLayout.CENTER);

		personaje = new Personaje();
		timer = new Timer(6, this);
		timer.start();
		
		
		

		try {
			
			Thread.sleep(5000);
			p.setVisible(false);
		
		} catch (Exception e1) {
			System.out.println("error");
			
			}
		
		
		for(int i = 0; i<5; i++){
			
			try {
				
			Thread.sleep(500);
			p.setVisible(false);
			
		} catch (Exception e1) {
			System.out.println("error");
			
			}
		try{
			
			
			
		
			Thread.sleep(500);
			p.setVisible(true);
			
		} 
		catch (Exception e1) {
			System.out.println("error");
			
			
			
		}
		}
		
			p.setVisible(false);
			
			contador = false;
			

			
		
	}
	
	
	


	public void update(Graphics g){
		
		

		Dimension tamanio2 = getSize();
		ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"));        
		g.drawImage(imagenFondo2.getImage(),0,0,tamanio2.width, tamanio2.height, null);        
		setOpacity(false);
		super.paintComponents(g);
		
		

		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/bloques1.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
		setOpacity(false);
		super.paintComponents(g);
		
	// PUNTOS DE VIDA //
		ImageIcon punto1 = new ImageIcon(getClass().getResource("/imagenes/boton1.gif"));
		  g.drawImage(punto1.getImage(),130,20,25,25, null);  
		  setOpacity(false);
		  setVisible(true);
		  
		  ImageIcon punto2 = new ImageIcon(getClass().getResource("/imagenes/boton1.gif"));
		  g.drawImage(punto2.getImage(),160,20,25,25, null);  
		  setOpacity(false);
		  setVisible(true);
		  
		  ImageIcon punto3 = new ImageIcon(getClass().getResource("/imagenes/boton1.gif"));
		  g.drawImage(punto3.getImage(),190,20,25,25, null);  
		  setOpacity(false);
		  setVisible(true);
		  
		  ImageIcon punto4 = new ImageIcon(getClass().getResource("/imagenes/boton1.gif"));
		  g.drawImage(punto4.getImage(),220,20,25,25, null);  
		  setOpacity(false);
		  setVisible(true);

		
		
		
		if(contador == false){
			
			
		
		Graphics2D g21d = (Graphics2D)g;
		g21d.drawImage(personaje.getImage(), personaje.getX(), personaje.getY(), this);
		
		
		
		
		
		}
		

		
		
		
		 g.drawRect (410, 435, 1 ,290);
		 g.drawLine (410, 435, 465, 435); // horizontal -->>> 1) eje x 2) eje y 3) largo con respecto al eje x 4) coincidencia eje y
		 g.drawLine (465, 435, 465, 390); // vertical //
		 g.drawLine (465, 390, 525, 390);
		 g.drawLine (525, 390, 525, 230);
		 
		  
		 g.drawLine (525, 200, 470, 200);
		 
		
		 g.drawLine (470, 230, 470, 0); // vertical //
		 
		 g.drawRect (350, 380, 1 ,290); 
		 
		
		 g.drawLine (350, 350, 409, 350);
		
		 
		 g.drawLine (465, 300, 400, 300);
		 
		 
		 g.drawLine (400, 300, 400, 0);
		 
		
		 
		
		 
		 
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
		
		
	}


	public void paint(Graphics g){

		buffer = createImage(getWidth(), getHeight());
		pantallaPrincipal = buffer.getGraphics();
		update(pantallaPrincipal);
		g.drawImage(buffer, 0, 0, this);
		
		

	}


	private void setOpacity(boolean b) {
		// TODO Auto-generated method stub

	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		
		personaje.move();
		Rectangle rectanglePlayer = personaje.getBounds();

		repaint();
		
		// cierre de la parte de arriba del mapa//
		if(rectanglePlayer.intersects(0, -20, 800 ,1)){


			personaje.Abajo();
			
			


		}


		// cierre de la parte izquierda del mapa//
		if(rectanglePlayer.intersects(0, 0, 1 ,630)){


			personaje.Izquierda();
		}


		// cierre parte abajo del mapa//
		if(rectanglePlayer.intersects(0, 630, 800 ,1)){


			personaje.Arriba();



		}

		// cierre parte derecha del mapa //

		if(rectanglePlayer.intersects(800, 0, 1 ,630)){

			personaje.Derecha();
		}

		/**
		 * COLISIONES CON LOS BLOQUES // FALTAN COLISIONES Y HAY QUE MODIFICAR LAS LINEAS DE LAS COLISIONES
		 * PORQUE EL PERSONAJE SE CHOCA //
		 */
		
		if (		rectanglePlayer.intersects(410, 435, 1 ,290)   

				|| 	rectanglePlayer.intersects(410,435,100,1)

				|| 	rectanglePlayer.intersects(465,385,1,50)	

				|| 	rectanglePlayer.intersects(465,385,100,1)


				|| 	rectanglePlayer.intersects(540,200,1,150)


				|| 	rectanglePlayer.intersects(465,200,100,1)


				|| 	rectanglePlayer.intersects(465,0,1,150)


				// HASTA AQUI LA PARTE DE LA DERECHA //


				|| 	rectanglePlayer.intersects(350, 380, 1 ,290)



				|| 	rectanglePlayer.intersects(350,340,60,1)


				|| 	rectanglePlayer.intersects(410,300,60,1)


				|| 	rectanglePlayer.intersects(410,0,1,250)

				// HASTA AQUI LA PARTE DE LA IZQUIERDA //
				
				){

			personaje= new Personaje();
			
			JOptionPane.showMessageDialog(null, "Has fallado");
			
			 
			
		}
		
		
	}
	
	private class TAdapter extends KeyAdapter {



		public void keyReleased(KeyEvent e) {
			personaje.keyReleased(e);
			
			




		}

		public void keyPressed(KeyEvent e) {
			personaje.keyPressed(e);
			




		}

	}  
	


	




	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
