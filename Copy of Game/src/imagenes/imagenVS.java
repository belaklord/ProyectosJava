package imagenes;
import java.awt.*;
import javax.swing.*;

public class imagenVS extends javax.swing.JPanel{
	
	
	
	
	public imagenVS() {
		setSize(800, 600); //se selecciona el tama�o del panel
		
	
		}
		 
		//Se crea un m�todo cuyo par�metro debe ser un objeto Graphics
		 
		public void paint(Graphics grafico) {
		Dimension height = getSize();
		 
		//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
		 
		ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/VS.jpg")); 
		 
		//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
		 
		grafico.drawImage(Img.getImage(), 310, 220,40, 40, null);
		 
		setOpaque(false);
		super.paintComponent(grafico);
		
	
		
		
		}
	

}
