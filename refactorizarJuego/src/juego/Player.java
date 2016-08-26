package juego;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;



	

	import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
		
		/**
		 *
		 * @author Miguel Angel
		 */
		public class Player extends JPanel implements ActionListener{
		    
		    Timer timer;
		    int width=374,height=254;
		    String imagen="img.png";
		    int formacion=1;
		    int limites[][]={
		        //Límites para el triangulo.izquierda,derecha,superior,inferior.
		        {6,8,0,6},
		        //Límites para el cuadrado.izquierda,derecha,superior,inferior.
		        {0,2,0,7},
		        //Límites para el rectangulo.izquierda,derecha,superior,inferior.
		        {1,4,0,5}
		    };
		    int[][] triangulo={
		        {40,10},
		        {25,40},{55,40},
		        {10,70},{40,70},{70,70},
		        {10,100},{40,100},{70,100}
		         
		    };
		    int[][] cuadrado={
		        {10,10},{40,10},{70,10},
		        {10,40},{40,40},{70,40},
		        {10,70},{40,70},{70,70}
		    };
		    int[][] rectangulo={
		        {55,10},
		        {10,40},{40,40},{70,40},{100,40},
		        {10,70},{40,70},{70,70},{100,70}
		    };
		    Sprite[] sprite=new Sprite[9];
		    
		    public Player(){
		        addKeyListener(new TAdapter());
		        setBackground(Color.BLACK);       
		        setFocusable(true);
		        setDoubleBuffered(true);
		        setSize(400,300);
		        setVisible(true);
		        
		        initFormacion();
		        
		        timer=new Timer(5,this);
		        timer.start();
		    }
		    
public static void main(String[] args) {
		    	
		    	
		    	new Player();
		    }
		    
		    @Override
		    public void actionPerformed(ActionEvent e){
		        mover();
		        repaint();
		    }
		    
		    @Override
		    public void paint(Graphics g){
		        super.paint(g);
		        
		        for (int i=0;i<sprite.length;i++){
		            g.drawImage(sprite[i].getImage(),sprite[i].getX(),sprite[i].getY(),this);
		        }
		        
		        Toolkit.getDefaultToolkit().sync();
		        g.dispose();
		    }
		
		    public void initFormacion(){
		        for (int i=0; i<sprite.length; i++){
		            sprite[i]=new Sprite(imagen,cuadrado[i][0],cuadrado[i][1]);
		        }
		    }
		        public void mover(){
		        for (int i=0;i<sprite.length;i++){
		            sprite[i].setX(sprite[i].getX()+sprite[i].getDx());
		            sprite[i].setY(sprite[i].getY()+sprite[i].getDy());
		        } 
		        //Se comprueba si la formación ha llegado a un límite del marco.
		        //En ese caso se ponen a 0 dx y dy.
		        //Colision con el marco izquierdo.
		        if (sprite[limites[formacion][0]].getX()<1){
		            asignaDx(0,1);
		        }
		        //Colision con el marco derecho.
		        if (sprite[limites[formacion][1]].getX()>width){
		            asignaDx(0,-1);
		        }
		        
		        //Colisión con el marco superior.
		        if (sprite[limites[formacion][2]].getY()<1){
		            asignaDy(0,1);
		        }
		        //Colisión con el marco inferior.
		        if (sprite[limites[formacion][3]].getY()>height){
		            asignaDy(0,-1);
		        }
		    }  
		    
		    
		    
		    public void asignaDx(int dx,int ajuste){
		        for (int i=0;i<sprite.length;i++){
		            sprite[i].setDx(dx);
		            sprite[i].setX(sprite[i].getX()+ajuste);
		        }            
		    }
		    public void asignaDy(int dy,int ajuste){
		        for (int i=0;i<sprite.length;i++){
		            sprite[i].setDy(dy);
		            sprite[i].setY(sprite[i].getY()+ajuste);
		        }
		    }    
		    
		    private class TAdapter extends KeyAdapter{
		        @Override
		        public void keyPressed(KeyEvent e){
		            Pulsada(e);
		        }
		        @Override
		        public void keyReleased(KeyEvent e){
		            Soltada(e);
		        }
		    }
		
		    public void Pulsada(KeyEvent e){
		        int key=e.getKeyCode();
		        
		        //Si se pulsa la tecla t se asignan las posiciones del array triangulo.
		        if(key==KeyEvent.VK_T){
		            for (int i=0; i < sprite.length; i++){
		                sprite[i].setX(triangulo[i][0]);
		                sprite[i].setY(triangulo[i][1]);
		                formacion=0;
		            }
		        }
		        //Si se pulsa la tecla c se asignan las posiciones del array cuadrado.
		        if(key==KeyEvent.VK_C){
		            for (int i=0; i < sprite.length; i++){
		                sprite[i].setX(cuadrado[i][0]);
		                sprite[i].setY(cuadrado[i][1]);
		                formacion=1;
		            }
		        }        
		        //Si se pulsa la tecla r se asignan las posiciones del array rectangulo.
		        if(key==KeyEvent.VK_R){
		            for (int i=0; i < sprite.length; i++){
		                sprite[i].setX(rectangulo[i][0]);
		                sprite[i].setY(rectangulo[i][1]);
		                formacion=2;
		            }
		        }
		        
		        if (key==KeyEvent.VK_UP){
		            for (int i=0;i<sprite.length;i++){
		                sprite[i].setDy(-1);
		            }
		        }
		        if (key==KeyEvent.VK_DOWN){
		            for (int i=0;i<sprite.length;i++){
		                sprite[i].setDy(1);
		            }
		        }        
		        if (key==KeyEvent.VK_LEFT){
		            for (int i=0;i<sprite.length;i++){
		                sprite[i].setDx(-1);
		            }
		        }
		        if (key==KeyEvent.VK_RIGHT){
		            for (int i=0;i<sprite.length;i++){
		                sprite[i].setDx(1);
		            }
		        }
		    }
		    
		    public void Soltada(KeyEvent e){
		        int key=e.getKeyCode();
		        
		        if (key==KeyEvent.VK_UP){
		            for (int i=0;i < sprite.length;i++){
		                sprite[i].setDy(0);
		            }
		        }        
		        if (key==KeyEvent.VK_DOWN){
		            for (int i=0; i < sprite.length; i++){
		                sprite[i].setDy(0);
		            }
		        }        
		        if (key==KeyEvent.VK_LEFT){
		            for (int i=0; i < sprite.length;i++){
		                sprite[i].setDx(0);
		            }
		        }
		        if (key==KeyEvent.VK_RIGHT){
		            for (int i=0; i < sprite.length;i++){
		                sprite[i].setDx(0);
		            }
		        }
		    }
		    
		    
}
