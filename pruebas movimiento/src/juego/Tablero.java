package juego;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Tablero extends JPanel implements Runnable  {
	
	 	private Image background;
	    private Image angrybird;
	    private Thread hilo;
	    private int x,y;
	    private final int DELAY=5;
	    
	    public Tablero(){
	        setBackground(Color.WHITE);
	        setDoubleBuffered(true);
	        background = new ImageIcon(this.getClass().getResource("/juego/Penguins.jpg")).getImage();
	        angrybird = new ImageIcon(this.getClass().getResource("/juego/guerrero.jpg")).getImage();
	        x=70;
	        y=200;
	    }
	    
	    @Override
	    public void addNotify(){
	        super.addNotify();
	        hilo = new Thread(this);
	        hilo.start();
	    }
	    
	    @Override
	    public void paint(Graphics g){
	        super.paint(g);
	        Graphics2D g2 = (Graphics2D)g;
	        g2.drawImage(background, 0,0, null);
	        g2.drawImage(angrybird,x,y, null);
	        Toolkit.getDefaultToolkit().sync();
	        g.dispose();
	    }
	    
	    //HASTA AKI EL FONDO Y LA IMAGEN QUIETA //
	    
	    public void ciclo(){
	        x += 1;
	        if ( x > (500+70) ){
	            x = -70;
	        }
	    }
	    
	    @Override
	    public void run() {
	        while(true){
	            ciclo();
	            repaint();
	            try{
	                Thread.sleep(DELAY);
	            }catch(InterruptedException err){
	                System.out.println(err);
	            }
	        }
	    }

	
	
	

}
