package interaccion;
import datos.Datos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class botonMago extends JFrame {
	
	private Button Aceptar;
	
	public botonMago(){
		
		super ("Mago");
	      setLocationRelativeTo(null);

setLayout (new BorderLayout());
	
JLabel label2 = new JLabel("HAS SELECCIONADO MAGO");

label2.setBounds(165,10,500,10);

JLabel label3 = new JLabel("PULSA ACEPTAR PARA EMPEZAR LA BATALA",JLabel.CENTER);

JLabel label = new JLabel(Datos.datosMago[0].toString(),JLabel.CENTER);

label.setBounds(5,30,500,10);

Aceptar = new Button ("Aceptar");
add (Aceptar,BorderLayout.SOUTH);
add(label);
add(label2);
add(label3);
setSize (500,300);
setVisible(true);
		
		Aceptar.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			escenario2 esc3 = new escenario2();
			
				 setVisible(false);
				// creacion del objeto escenario //
				
				
				
				
			}	
				
			
		});
		
		
	}
	
	

}
