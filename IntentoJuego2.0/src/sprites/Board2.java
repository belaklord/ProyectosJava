package sprites;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.Timer;


import pantalla.Mapa2;


public class Board2 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image buffer;
	Graphics pantallaPrincipal;
	private Timer timer;
	Personaje craft;
	Agua agua;
		
		
		public Board2(){
			

			setFocusable(true);
			setSize(800, 630);
			setLocationRelativeTo(null);
			this.setUndecorated(true);
			addKeyListener(new TAdapter());
			setResizable(false);
			setVisible(true);

			Mapa2 p = new Mapa2();
			agua = new Agua();
			craft = new Personaje();				

			this.add( p , BorderLayout.CENTER);


			timer = new Timer(6, this);
			timer.start();
		}
	
	 public void update(Graphics g) {
		 
		 
		 
		 	Dimension tamanio = getSize();
			ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/mapa2.gif"));        
			g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
			setOpacity(false);
			super.paintComponents(g);
		 
			
			Graphics2D Agua = (Graphics2D)g;
			Agua.drawImage(agua.getImage(), agua.getX(), agua.getY(), this);
			
			Graphics2D g21d = (Graphics2D)g;
			g21d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);
			
			Toolkit.getDefaultToolkit().sync();
			g.dispose();
			
			
		 
	 }
	
	
	  private void setOpacity(boolean b) {
		
		
	}

	public void paint(Graphics g){
			
			
			buffer = createImage(getWidth(), getHeight());
			pantallaPrincipal = buffer.getGraphics();
			update(pantallaPrincipal);
			g.drawImage(buffer, 0, 0, this);
		
		

			

		}
	
	
	
	
	public void actionPerformed(ActionEvent arg0) {
		
		craft.move();
    	
    	repaint();
		
		
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
