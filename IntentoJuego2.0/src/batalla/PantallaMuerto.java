package batalla;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import sprites.Board;
import sprites.FondoDerrota;
import sprites.FondoDialogo2;
import sprites.Personaje;




public class PantallaMuerto extends JFrame  {
	
	FondoDerrota derrota;
	Board board;
	public  JButton boton1;
	private boolean golem = false;
	private boolean pieMercader =  true;
	Personaje personaje;

	
	
	public PantallaMuerto(){
		
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
		FondoDerrota p = new FondoDerrota();
	    this.add( p , BorderLayout.CENTER);
	    requestFocus();
		
	

    boton1.addActionListener(new ActionListener(){
		
		
		public void actionPerformed(ActionEvent e){
			
			if (e.getSource()==boton1){
				
				
				
				setVisible(false);
				
				 
			
			}
			 
		}
    });
}

	
	
	
	
	public boolean muerto(){
		
		return golem;
	}
	
	
	
	
	public boolean pieMercader(){
		
		return pieMercader;
		
		
	}
	
	
	
	
	
	
	
}
