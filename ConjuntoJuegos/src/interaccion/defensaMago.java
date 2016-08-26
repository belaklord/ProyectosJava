package interaccion;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import personajes.mago;
import datos.Datos;

public class defensaMago  {
	
	
	public static String ataque(){
		
		
		if (Datos.datosMago[0].vida <=0){
			
			
			Datos.datosMago[0].vida = 0;
			
		}
			
			
		else{
		
				int	contador = Datos.datosGerrero[0].ataque;
				
		
			
			Datos.datosMago[0].vida = Datos.datosMago[0].vida - contador;
		
			
				
			
		}
			
			
			return Datos.datosMago[0].toString();
			
		
		
		
		
	}
	
	
	
	
	

}
