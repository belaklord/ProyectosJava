package sprites;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import batalla.BatallaGolem;
import batalla.PantallaVictoria;
import batalla.Puntero;


import sprites.Dialogo;
import pantalla.Mapasingolem;
import pantalla.Marco;
import pantalla.Mercader;
import pantalla.Mercado;


public class Board  extends JFrame implements ActionListener {

	private Timer timer;
	private Personaje craft;
	private Mercado mercado;
	private Mercader mercader;
	private Dialogo dialogo;
	private Personaje personaje;
	private Golem golem;
	private BatallaGolem batalla;
	private Matas matas;
	private Puntero puntero;
	private PantallaVictoria victoria;
	private Board2 board2;
	private boolean contador = false;
	
	



	Image buffer;
	Graphics pantallaPrincipal;

	public  JButton boton1;


	public Board() {

		setSize(800, 630);
		setLocationRelativeTo(null);
		this.setUndecorated(true);
		setResizable(false);
		setVisible(true);
		addKeyListener(new TAdapter());
		setFocusable(true);

		setDoubleBuffered(true);


		Mapasingolem p = new Mapasingolem();
		this.add( p , BorderLayout.CENTER);
		requestFocus();


		mercado  = new Mercado();
		craft = new Personaje();
		mercader = new Mercader();
		golem = new Golem();
		matas = new Matas();




		timer = new Timer(6, this);
		timer.start();

		

	}




	public boolean contador(){

		return contador;
	}
	public void contador ( boolean contador){

		this.contador = contador;

	}

	private void setDoubleBuffered(boolean b) {
		// TODO Auto-generated method stub

	}




	public void update(Graphics g) {




		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/mapasingolem.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
		setOpacity(false);
		super.paintComponents(g);


		Graphics2D mercados = (Graphics2D)g;
		mercados.drawImage(mercado.getImage(), mercado.getX(), mercado.getY(), this);


		Graphics2D mercadere = (Graphics2D)g;
		mercadere.drawImage(mercader.getImage(), mercader.getX(), mercader.getY(), this);


		Graphics2D g21d = (Graphics2D)g;
		g21d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);

		Graphics2D matojo = (Graphics2D)g;
		matojo.drawImage(matas.getImage(), matas.getX(), matas.getY(), this);


		Graphics2D golemm = (Graphics2D)g;
		golemm.drawImage(golem.getImage(), golem.getX(), golem.getY(), this);


		Toolkit.getDefaultToolkit().sync();
		g.dispose();

	}

	private void setOpacity(boolean b) {
		// TODO Auto-generated method stub

	}



	public void paint(Graphics g){


		buffer = createImage(getWidth(), getHeight());
		pantallaPrincipal = buffer.getGraphics();
		update(pantallaPrincipal);
		g.drawImage(buffer, 0, 0, this);





	}



	public void actionPerformed(ActionEvent e) {



		craft.move();

		repaint();

		Rectangle golemm = golem.getBounds();
		Rectangle rectanglePlayer = craft.getBounds();




		//golem derecha //

		if(rectanglePlayer.intersects(754,80,1,80)){


			craft.Izquierda();

		}


		//golem izquierda//

		if(rectanglePlayer.intersects(680,80,1,80)){


			craft.Derecha();

		}


		//golem arriba //

		if(rectanglePlayer.intersects(680,90,46,1)){


			craft.Arriba();

		}

		// golem abajo //

		if(rectanglePlayer.intersects(680,167,200,1)){


			craft.Abajo();

		}

		// parte derecha del mercado //

		if(rectanglePlayer.intersects(150, 0, 1 ,90)){

			craft.Izquierda();



		}

		//

		// parte inferior del mercado //
		if(rectanglePlayer.intersects(0, 100, 145 ,1)){

			craft.Abajo();


		}


		// cierre de la parte de arriba del mapa//

		if(rectanglePlayer.intersects(0, 0, 800 ,1)){


			craft.Abajo();


		}

		// CAMBIO DE MAPA.., aplicar esto en el sitio del juego que me parezca //

		if(craft.GetContador4() == true){


			this.dispose();

			board2 = new Board2();
			craft.SetContador4(false);


		}


		// cierre de la parte izquierda del mapa//
		if(rectanglePlayer.intersects(0, 0, 1 ,630)){


			craft.Izquierda();
		}


		// cierre parte abajo del mapa//
		if(rectanglePlayer.intersects(0, 630, 800 ,1)){


			craft.Arriba();



		}

		// cierre parte derecha del mapa //

		if(rectanglePlayer.intersects(800, 0, 1 ,630)){

			craft.Derecha();
		}



	}




	private class TAdapter extends KeyAdapter {



		public void keyReleased(KeyEvent e) {
			craft.keyReleased(e);
			
			




		}

		public void keyPressed(KeyEvent e) {
			craft.keyPressed(e);
			




		}

	}  

}
