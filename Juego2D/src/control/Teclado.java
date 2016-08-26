/*
 * video 8
 */


package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Teclado implements KeyListener {
	
	// usaremos un array de booleanos ///
	
	private final static int numeroTeclas = 120; // caracteres que representan las teclas, es el codigo de teclas y el mas alto sera menor que 120 //
	
	private boolean[] teclas = new boolean[numeroTeclas];

	public boolean arriba;
	public boolean abajo;
	public boolean derecha;
	public boolean izquierda;
	
	public void actualizar(){
		
		arriba = teclas[KeyEvent.VK_W]; // la variable arriba es la tecla "w" //
		abajo = teclas[KeyEvent.VK_S];
		derecha = teclas[KeyEvent.VK_D];
		izquierda = teclas[KeyEvent.VK_A];
	}

	public void keyPressed(KeyEvent e) { // tecla pulsada y no soltamos
		
		
		teclas [e.getKeyCode()] = true;
		
	}

	
	public void keyReleased(KeyEvent e) { // tecla liberada no pulsada
		
		teclas [e.getKeyCode()] = false;
		
	}

	
	public void keyTyped(KeyEvent arg0) { // tecla tecleada y soltada
		
		
	}
	

	
	
	
	

}
