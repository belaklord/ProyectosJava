package interaccion;
import datos.Datos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class botonGuerrero extends JFrame {
	
	private Button Aceptar;
	
	public botonGuerrero(){
	     

		super ("guerrero");
		 setLocationRelativeTo(null);
		setLayout (new BorderLayout());
		
		JLabel label2 = new JLabel("HAS SELECCIONADO GUERRERO");
		
		label2.setBounds(165,10,500,10);
		
		JLabel label3 = new JLabel("PULSA ACEPTAR PARA EMPEZAR LA BATALA",JLabel.CENTER);
		
		JLabel label = new JLabel(Datos.datosGerrero[0].toString(),JLabel.CENTER);
		
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
			escenario esc3 = new escenario();
			
				 setVisible(false);
				// creacion del objeto escenario //
				
				
				
				
			}	
				
			
		});
		
		
	}
	

}
