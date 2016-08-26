package sprites;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import batalla.BatallaGolem;

public class DialogoObjeto extends JFrame {
	
	FondoDialogo3 dialogo;
	Board board;
	public  JButton boton1;
	private BatallaGolem batalla;
	

	public DialogoObjeto(){
		
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
		FondoDialogo3 p = new FondoDialogo3();
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

	public void paint(Graphics g){
		
		
		
		 Dimension tamanio = getSize();
	     ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/DialogoMercader1.gif"));        
	     g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
	     setOpacity(false);
	     super.paintComponents(g);
	     
	    
	}

	private void setOpacity(boolean b) {
		
		
	}

		
	}
	
	
	
	
	
	
	
	
	
	

