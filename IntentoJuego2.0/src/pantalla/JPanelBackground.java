package pantalla;
import pantalla.Marco;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ComboBoxUI;

public class JPanelBackground extends JPanel {
	



	public JPanelBackground(){
		
		 this.setSize(800,630);
		 
	}
	
	public void paint(Graphics g){
		
		
		
		
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/xZVyi5Y.gif"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        super.paintComponent(g);
        
        

		 if (Marco.combo.getSelectedItem().equals("Guerrero")){
			 Dimension tamanio2 = getSize();
			  ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/guerrero.gif"));
			  g.drawImage(imagenFondo2.getImage(),60,295,200,300, null);  
			  setOpaque(false);
			  setVisible(true);
			  
		  }
		 
		 if (Marco.combo.getSelectedItem().equals("Mago")){
			 Dimension tamanio2 = getSize();
			  ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/mago.gif"));
			  g.drawImage(imagenFondo2.getImage(),60,295,200,300, null);  
			  setOpaque(false);
			  setVisible(true);
			  
		  }
        
        repaint();
        
        
}
	
	
	}
	
	
	
	
	
	

