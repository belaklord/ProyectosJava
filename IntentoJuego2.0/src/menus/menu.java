package menus;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import pantalla.JPanelBackground;
import pantalla.Mapasingolem;
import sprites.Board;
import sprites.Personaje;






public class menu extends JFrame implements ItemListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  JButton boton1, boton2, boton3;
	
	Image buffer;
	Graphics pantallaPrincipal;
	FondoMenu fondomenu;
	
	public menu(){
		
		setSize(300, 200);
        setLocationRelativeTo(null);
        this.setUndecorated(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null); //------->>>>>  hace que los botones no se salga de sus dimensiones //
        setVisible(true);
        
        FondoMenu p = new FondoMenu();
		this.add( p , BorderLayout.CENTER);
        
        
         
  
      
        boton1 = new JButton(new ImageIcon(this.getClass().getResource("/imagenes/botonStart.jpg")));
        boton1.setPressedIcon(new ImageIcon(this.getClass().getResource("/imagenes/botonStart2.jpg")));
        boton1.setBounds(new Rectangle(110,40,90,30));
        add (boton1);
       
        boton2 = new JButton(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines3.jpg")));
        boton2.setPressedIcon(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines4.jpg")));
        boton2.setBounds(new Rectangle(110,80,90,30));
        add (boton2);
        
        
        boton3 = new JButton(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines5.jpg")));
        boton3.setPressedIcon(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines6.jpg")));
        boton3.setBounds(new Rectangle(110,120,90,30));
        add (boton3);
        
        
        boton3.addActionListener(new ActionListener(){
		
		
		public void actionPerformed(ActionEvent e){
			
			
			
			
			System.exit(0);
			
				
				
		
				 
			   
			
		}
			
		});
        boton1.addActionListener(new ActionListener(){
    		
    		
    		public void actionPerformed(ActionEvent e){
    			
    			
    			setVisible(false);
    			
        
}
			
		});
		
	}
	
	
	private void setOpacity(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	public void update(Graphics g) {
		
		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondomenu.jpg"));        
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
		setOpacity(false);
		super.paintComponents(g);
	}

	public void paint(Graphics g){

		
		buffer = createImage(getWidth(), getHeight());
		pantallaPrincipal = buffer.getGraphics();
		update(pantallaPrincipal);
		g.drawImage(buffer, 0, 0, this);
		
		


	}



	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
