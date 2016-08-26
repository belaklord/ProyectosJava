package datos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import sprites.Personaje;

public class DatosDelPersonaje extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel Nombre;
	private JLabel profesion;
	private JLabel vida;
	private JLabel mana;
	private JLabel objetos;
	private JLabel ataque;
	private JLabel defensa;
	static JTextArea jtextarea;
	
	
	
	Personaje personaje;
	
	
	public DatosDelPersonaje(){
		
		
	setSize(500, 300);
    setLocationRelativeTo(null);
    this.setUndecorated(false);
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);
    setLayout(null);
    
    
    Nombre = new JLabel("Nombre:");
    Nombre.setBounds(50, 20, 50, 50);
	Nombre.setForeground(Color.red);
	add(Nombre);
	
	
	profesion = new JLabel("Profesion:");
	profesion.setBounds(50, 40, 100, 50);
	profesion.setForeground(Color.red);
	add(profesion);
	
	vida = new JLabel("Vida:");
	vida.setBounds(50, 60, 50, 50);
	vida.setForeground(Color.red);
	add(vida);
	
	mana = new JLabel("Mana:");
	mana.setBounds(50, 80, 50, 50);
	mana.setForeground(Color.red);
	add(mana);
	
	ataque = new JLabel("Ataque:");
	ataque.setBounds(50, 100, 50, 50);
	ataque.setForeground(Color.red);
	add(ataque);
	
	defensa = new JLabel("Defensa:");
	defensa.setBounds(50, 120, 50, 50);
	defensa.setForeground(Color.red);
	add(defensa);
	
	objetos = new JLabel("Objetos:");
	objetos.setBounds(50, 200, 50, 50);
	objetos.setForeground(Color.red);
	add(objetos);
	
	
	jtextarea = new JTextArea();
	jtextarea.setBounds(new Rectangle(50, 250, 200, 100));
	jtextarea.setEditable(false);
	add(jtextarea);
	
	
	
	}
	
	
	/*
	
	public void paint(Graphics g){
		
		
		g.setColor (Color.white);
		g.drawString( personaje.toString(), 400, 555);
		
		
		
		Toolkit.getDefaultToolkit().sync();
	}
*/
}
