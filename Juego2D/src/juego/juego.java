
/*
 * video 6
 * 
 */



package juego;

import graficos.Pantalla;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

import control.Teclado;


/*
 * ventada del juego no se podrá modificar la ventana
 * 
 * "runable" video 3
 */
public class juego extends Canvas implements Runnable {
	
	// version del juego //
	private static final long serialVersionID = 1;
	
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	
	/*
	 * creamos una variable booleana para el funcionamiento
	 * "volatile" significa que esta variable nos e podrá usar de forma simultanea 
	 * en dos thread o hilos
	 */
	private static volatile boolean  enFuncionamiento = false;
	
	private static final String NOMBRE = "juego";
	
	private static int aps = 0;
	private static int fps = 0;
	
	private static int x = 0;
	private static int y =0;
	
	private static JFrame ventana;
	private Thread thread;
	private static Teclado teclado;
	private static Pantalla pantalla;
	
	
	private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
	
	private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
	
	private juego(){
		
		teclado = new Teclado();
		addKeyListener(teclado);
		setPreferredSize(new Dimension(ANCHO, ALTO));
		
		ventana = new JFrame(NOMBRE);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	
	// probamos la ventana con el main
	
	public static void main (String []args){
		
		
		juego juego = new juego();
		juego.iniciar();
		
	}
	
	
	/*
	 * para iniciar el juego (video 3)
	 * SCHYNCRONIZED  se asegura que los dos metodos no 
	 * modifiquen la varibale simultaneamente
	 */
	private synchronized void iniciar(){
		
		enFuncionamiento = true;
		thread = new Thread(this);
		thread.start();
		
	}
	
	//deteenr el juego (video 3) //
	
	private  synchronized void detener(){
		
		enFuncionamiento = false;
		
		// se intenta ejecutar el thread y si falla se captura el error 
		//  y no pasaría nada  no se quedaría colgado//
		try {
			thread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	// videos 5 //
	/*
	 * actualiza una serie de variables como vida etc
	 */
	private void actualizar(){
		
		teclado.actualizar();
		
		if(teclado.arriba){
			
			System.out.println("arriba");
			
			}
		
		if(teclado.abajo){
			
			System.out.println("abajo");
		}
		
		
		if(teclado.derecha){
			
			System.out.println("derecha");
			
		}
			
		if(teclado.izquierda){
			
			System.out.println("izquierda");
			
		}
			
		
		
		aps++;
		
		
	}
	
	// un buffer es un espacio de memoria que gurda cosas
	// en este caso creara los dibujos 
	private void mostrar(){
		
		BufferStrategy estrategia = getBufferStrategy();
		
		if(estrategia == null){
			
			createBufferStrategy(3);
			
			return;
			
		}
		
		pantalla.limpiar();
		pantalla.mostrar(x,y); // controles //
		
		System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
		
		
		Graphics g = estrategia.getDrawGraphics();
		
		g.drawImage(imagen, 0,0, getWidth(), getHeight(), null);
		
		g.dispose();
		
		estrategia.show();
		
		fps++;
		
		
	}
	// ejecuta el thread  (video 3)//

	
	public void run() {
		final int NS_POR_SEGUNDO = 1000000000; // cuantos nanosegundos hay en un segundo
		final byte APS_OBJETIVO = 60; //actualizaciones por segundo

		long referenciaActualizacion  = System.nanoTime();// metodo de temporizador nanosegundos //
		long referenciaContador = System.nanoTime();
		double  tiempoTranscurrido;
		double delta = 0; //tiempo transcurrido hasta que se hace una ctualizacion
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO /APS_OBJETIVO; //nanosegundos por actualizacion

		requestFocus();
		
		
		
		while (enFuncionamiento){
			final long inicioBucle = System.nanoTime();  // metodo de temporizador nanosegundos //
			tiempoTranscurrido = inicioBucle-referenciaActualizacion;
			referenciaActualizacion = inicioBucle;
			delta += tiempoTranscurrido/NS_POR_ACTUALIZACION;

			while(delta>=1){

				actualizar();
				delta --;
			}


			mostrar();
			
			// panel de fps visual en el juego //
			if(System.nanoTime()-referenciaContador> NS_POR_SEGUNDO){
				
				ventana.setTitle(NOMBRE + "|| APS:" + aps + " ||FPS: "+ fps);
				
				fps = 0;
				aps = 0;
				referenciaContador = System.nanoTime();
				
			}
		}


	}
}
