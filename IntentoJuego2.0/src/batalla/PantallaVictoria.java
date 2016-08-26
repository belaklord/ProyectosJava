package batalla;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import pantalla.Mapasingolem;
import pantalla.Marco;
import pantalla.Mercader;
import pantalla.Mercado;
import sprites.Board;
import sprites.Board2;
import sprites.FondoDerrota;
import sprites.FondoVictoria;
import sprites.Golem;
import sprites.Matas;
import sprites.Personaje;

public class PantallaVictoria extends JFrame implements ActionListener {
	
	
	FondoVictoria victoria;
	private Board board;
	private Board2 board2;
	public  JButton boton1;
	private Personaje personaje;
	private boolean nivel2 = false;
	private Marco marco;
	private Mercado mercado;
	private Personaje craft;
	private Mercader mercader;
	private Golem golem;
	private Matas matas;
	
	
	
	
	public PantallaVictoria(){
		
		
		this.setAlwaysOnTop( true );
		setLocation(400,300);
		setSize(500, 400);
		this.setUndecorated(true);
		setFocusable(true);
	    setResizable(false);
	    setVisible(true);
	    boton1 = new JButton("Aceptar");
		boton1.setBounds(200,300,90,30);
		add(boton1);
		// cambiar fondo del dialogo // poner "te han matado " // pantalla de puntos de experiecia //
		FondoVictoria p = new FondoVictoria();
	    this.add( p , BorderLayout.CENTER);
	    requestFocus();
	   	
	   
    boton1.addActionListener(new ActionListener(){
		
    	
		
		public void actionPerformed(ActionEvent e){
			
				
			
				
				nivel2(true);
				setVisible(false);
				
				
				 		
			 
		}
    });
}
	
	
	
	public void nivel2(boolean nivel2){
		
		this.nivel2 = nivel2;
		
		
	}
	
	
	public boolean nivel2(){
		
		return nivel2;
		
	}



	
	public void actionPerformed(ActionEvent e) {
		
		
		
		
	}
	
	
}
