package pantalla;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import sprites.Board;
import sprites.Board2;
import sprites.Personaje;

import javax.swing.*;

import batalla.PantallaVictoria;
import pantalla.JPanelBackground;
import personajes.Guerrero;



public class Marco extends JFrame implements ItemListener {
	

	JLabel  label;
	private JLabel label1, label2;
	public  JButton boton1;
	public Board board;
	private Image background;
	static JComboBox combo;
	JLabel picture;
	private Image image;
	private Board2 board2;
	private PantallaVictoria victoria;

	 private Guerrero guerrero;
	 
	 
	 	Image buffer;
		Graphics pantallaPrincipal;
	 

	public Marco() {
		
		
        setSize(800, 630);
        setLocationRelativeTo(null);
        this.setUndecorated(true);
        setResizable(false);
        setVisible(true);
        
		combo=new JComboBox();
		combo.addItem("vacio");
		combo.addItem("Mago");
		combo.addItem("Guerrero");
		combo.addItemListener(this);
		combo.setBounds(370,50,80,20);
		add(combo);
		
		boton1 = new JButton("Aceptar");
		boton1.setBounds(350,500,90,30);
		add(boton1);
		label2 = new JLabel("Nombre del Personaje");
		label2.setBounds(340,555,150,20);
		label2.setForeground(Color.green);
		add(label2);
		label1 = new JLabel("Seleccion de Personaje");
		label1.setBounds(350,20,200,30);
		label1.setForeground(Color.green); 
		add(label1);
		JPanelBackground p = new JPanelBackground();
		this.add( p , BorderLayout.CENTER);

	
		
		
		
		boton1.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				
				
				
				
				if (e.getSource()==boton1 && combo.getSelectedItem().equals("Guerrero") ){
					
				
				

					board = new Board();
					setVisible(false);
					
					
			
					 
				   
				}
			}
				
			});
		
		
	}
		
	
	

	public void ActionPerformed (ActionEvent e){
		
		
		
		
	}
	
	
	
	
	
	public void itemStateChanged(ItemEvent e) {
		
	}
	
	
	
	
	

	
	
	public void update(Graphics g){
		
		
		
       

		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/xZVyi5Y.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
		setOpacity(false);
		super.paintComponents(g);
		
		
		
		
		 if (combo.getSelectedItem().equals("Guerrero")){
			 
			  ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/guerrero.gif"));
			  g.drawImage(imagenFondo2.getImage(),60,295,200,300, null);  
			  setOpacity(false);
			  setVisible(true);
			  
		  }
		 
		 if (combo.getSelectedItem().equals("Mago")){
			
			  ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/mago.gif"));
			  g.drawImage(imagenFondo2.getImage(),60,295,200,300, null);  
			  setOpacity(false);
			  setVisible(true);
			  
		  }
		

	}
	
public void paint(Graphics g){
		
		
		buffer = createImage(getWidth(), getHeight());
		pantallaPrincipal = buffer.getGraphics();
		update(pantallaPrincipal);
		g.drawImage(buffer, 0, 0, this);
	
	

		

	}



	private void setOpacity(boolean b) {


	}








}







