package botones;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



public class main extends JFrame {
	public  JButton boton1, boton2, boton3;
	
	
	public main(){
		
		setSize(800, 630);
        setLocationRelativeTo(null);
        this.setUndecorated(true);
        setResizable(false);
        setVisible(true);
        
       
        boton1 = new JButton(new ImageIcon(this.getClass().getResource("/imagenes/botonStart.jpg")));
        boton1.setPressedIcon(new ImageIcon(this.getClass().getResource("/imagenes/botonStart2.jpg")));
        boton1.setBounds(350,300,90,30);
        add (boton1);
        
        boton2 = new JButton(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines3.jpg")));
        boton2.setPressedIcon(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines4.jpg")));
        boton2.setBounds(350,350,90,30);
        add (boton2);
        
        
        boton3 = new JButton(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines5.jpg")));
        boton3.setPressedIcon(new ImageIcon(this.getClass().getResource("/imagenes/menuopcines6.jpg")));
        boton3.setBounds(350,400,90,30);
        add (boton3);
        
        
        
		
	}
	
	public static void main (String args[]){
		
		new main();
		
		
		
	}

}
