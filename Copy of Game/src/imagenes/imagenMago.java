package imagenes;
import java.awt.*;

import javax.swing.*;



public class imagenMago extends  javax.swing.JPanel {
	
	
		public imagenMago() {
		setSize(600, 450); //se selecciona el tamaño del panel
		
	
		}
		 
		//Se crea un método cuyo parámetro debe ser un objeto Graphics
		 
		public void paint(Graphics grafico) {
		Dimension height = getSize();
		 
		//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
		 
		ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/gnome_wizard.jpg")); 
		 
		//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
		 
		grafico.drawImage(Img.getImage(), 400, 180,100, 100, null);
		 
		setOpaque(false);
		super.paintComponent(grafico);
		
	
		
		
		}
	
	
	
	
	

}
