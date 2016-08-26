package imagenes;
import java.awt.*;

import javax.swing.*;


public class barraVida100 extends javax.swing.JPanel {
	
	
	public barraVida100() {
		setSize(800, 600); //se selecciona el tamaño del panel
		
	
		}
		 
	public void paint(Graphics grafico) {
		Dimension height = getSize();
		 
		//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
		 
		ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/vida100.jpg")); 
		 
		//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
		 
		grafico.drawImage(Img.getImage(), 250, 450,244, 53, null);
		 
		setOpaque(false);
		super.paintComponent(grafico);
		
	
		
		
		}
	

}
	
	


