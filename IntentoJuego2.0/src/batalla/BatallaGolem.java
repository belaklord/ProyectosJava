package batalla;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;

import pantalla.Marco;
import ataques.AtaquePersonaje;
import sprites.Board;
import sprites.Board2;
import sprites.Golem;
import sprites.Personaje;


public class BatallaGolem extends JFrame implements ActionListener,ItemListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MenuBatalla batalla;
	private MenuBatalla2 batalla2;
	private Timer timer;
	private MenuGrande menu;
	private Personaje personaje;
	private Golem golem;
	private AtaquePersonaje ataque2;
	private PantallaMuerto muerto;
	private PantallaVictoria victoria;
	private Board2 board2;
	private Marco marco;
	private Board board;
	private boolean contador= false;
	


	


	Puntero puntero;

	Image buffer;
	Graphics pantallaPrincipal;


	public BatallaGolem(){



		addKeyListener(new TAdapter());



		this.setAlwaysOnTop(true);

		setSize(800, 630);

		setLocationRelativeTo(null);
		this.setUndecorated(true);
		setResizable(false);
		setFocusable(true);
		setVisible(true);



		puntero = new Puntero();
		batalla = new MenuBatalla();
		batalla2 = new MenuBatalla2();
		menu = new MenuGrande();
		personaje = new Personaje();
		golem = new Golem();


		timer = new Timer(7, this);
		timer.start();
		
		
		
		
		
	}

public boolean contador(){
	return contador;
	
}
	

public void contador(boolean contador){
	
	this.contador = contador;
	
}

	public void update(Graphics g){
		

		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondoBatalla.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
		setOpacity(false);

		Graphics2D g21d = (Graphics2D)g;
		g21d.drawImage(batalla.getImage(), batalla.getX(), batalla.getY(), this);


		Graphics2D g2z = (Graphics2D)g;
		g2z.drawImage(menu.getImage(), menu.getX(), menu.getY(), this);

		Graphics2D g2zz = (Graphics2D)g;
		g2zz.drawImage(personaje.Image2(),50,300, this);


		if(puntero.panel2() == true){

			Graphics2D g2 = (Graphics2D)g;
			g2.drawImage(batalla2.getImage(), batalla2.getX(), batalla2.getY(), this);

		}


		Graphics2D g21 = (Graphics2D)g;
		g21.drawImage(puntero.getImage(), puntero.getX(), puntero.getY(), this);


		// inicio vida personaje //

		if(personaje.obtenerVida() == 100 ){

			ImageIcon imagenFondo6 = new ImageIcon(getClass().getResource("/imagenes/vida.gif"));        
			g.drawImage(imagenFondo6.getImage(),420,530,174, 38, null);        
			setOpacity(false);
		}
		if(personaje.obtenerVida()<100 && personaje.obtenerVida() >60 ){


			ImageIcon imagenFondo4 = new ImageIcon(getClass().getResource("/imagenes/vida2.gif"));        
			g.drawImage(imagenFondo4.getImage(),420,530,174, 38, null);        
			setOpacity(false);
		}



		if(personaje.obtenerVida()<60 && personaje.obtenerVida() >30){



			ImageIcon imagenFondo3 = new ImageIcon(getClass().getResource("/imagenes/vida3.gif"));        
			g.drawImage(imagenFondo3.getImage(),420,530,174, 38, null);        
			setOpacity(false);


		}


		if(personaje.obtenerVida()<30 && personaje.obtenerVida() >1){

			ImageIcon imagenFondo7 = new ImageIcon(getClass().getResource("/imagenes/vida5.gif"));        
			g.drawImage(imagenFondo7.getImage(),420,530,174, 38, null);        
			setOpacity(false);


		}

		if(personaje.obtenerVida() == 0){

			ImageIcon imagenFondo3 = new ImageIcon(getClass().getResource("/imagenes/vida4.gif"));        
			g.drawImage(imagenFondo3.getImage(),420,530,174, 38, null);        
			setOpacity(false);



			this.setVisible(false);

			muerto = new PantallaMuerto();
			
			contador = true;
		}


							// final vida personaje //

					//.................................................//
						
							// inicio vida golem //
		
		
		
		

		if(golem.getvida() == 500){

			ImageIcon imagenFondo22 = new ImageIcon(getClass().getResource("/imagenes/vida.gif"));        
			g.drawImage(imagenFondo22.getImage(),420,570,174, 38, null);        
			setOpacity(false);

		}


		if (golem.getvida()<500 && golem.getvida() >300 ){

			ImageIcon imagenFondo22 = new ImageIcon(getClass().getResource("/imagenes/vida2.gif"));        
			g.drawImage(imagenFondo22.getImage(),420,570,174, 38, null);        
			setOpacity(false);

		}

		if (golem.getvida()<300 && golem.getvida() >100 ){

			ImageIcon imagenFondo22 = new ImageIcon(getClass().getResource("/imagenes/vida3.gif"));        
			g.drawImage(imagenFondo22.getImage(),420,570,174, 38, null);        
			setOpacity(false);

		}



		if(golem.getvida() >1 && golem.getvida() <100){

			ImageIcon imagenFondo22 = new ImageIcon(getClass().getResource("/imagenes/vida5.gif"));        
			g.drawImage(imagenFondo22.getImage(),420,570,174, 38, null);        
			setOpacity(false);

		}

		if(golem.getvida() == 0){

			ImageIcon imagenFondo22 = new ImageIcon(getClass().getResource("/imagenes/vida4.gif"));        
			g.drawImage(imagenFondo22.getImage(),420,570,174, 38, null);        
			setOpacity(false);
			
			this.setVisible(false);
			
			victoria = new PantallaVictoria();
			
			
			

		}


									// final de la vida golem //
		
					// ........................................................ //

		if(puntero.atacado() == true){

			g.setColor (Color.white);
			g.drawString( golem.toString2(), 400, 600);


		}

		else{



			g.setColor (Color.white);
			g.drawString( golem.toString(), 400, 600);

			g.setColor (Color.white);
			g.drawString( personaje.toString(), 400, 555);
		}






		if(puntero.ataque() == true){

			
			

			Graphics2D g21z = (Graphics2D)g;
			g21z.drawImage(puntero.getImage2(), 500,300, null);

			


			g.setColor (Color.white);
			g.drawString( personaje.toString2(), 400, 555);

				
			try {
				Thread.sleep(1500);
			} catch (Exception e1) {
				System.out.println("error");
			}
			

		

		}

		if(puntero.personajeAtacado() == true){

			

			Graphics2D g21dd = (Graphics2D)g;
			g21dd.drawImage(puntero.getImage3(), 50,340, this);



			g.setColor (Color.white);
			g.drawString( personaje.toString(), 400, 555);
			
			
			
			
		}
		
		
		
/*
		if(puntero.fuego() == true){



			Graphics2D g21f = (Graphics2D)g;
			g21f.drawImage(puntero.getImage5(), 250, 100, this);
			
			
			g.setColor (Color.white);
			g.drawString( golem.toStringFuego(), 400, 555);
			
			
			
		
	}
	*/
		Toolkit.getDefaultToolkit().sync();
	}
	
	public void paint(Graphics g){
		
		
		buffer = createImage(getWidth(), getHeight());
		pantallaPrincipal = buffer.getGraphics();
		update(pantallaPrincipal);
		g.drawImage(buffer, 0, 0, this);
	
	

		

	}

	

	private void setOpacity(boolean b) {


	}



	private class TAdapter extends KeyAdapter {

		public void keyReleased(KeyEvent e) {
			puntero.keyReleased(e);



		}

		public void keyPressed(KeyEvent e) {
			puntero.keyPressed(e);


		}


	}



	public void actionPerformed(ActionEvent e) {




		puntero.move();

		repaint();

	}



	public void itemStateChanged(ItemEvent arg0) {

	}


	
	
}
