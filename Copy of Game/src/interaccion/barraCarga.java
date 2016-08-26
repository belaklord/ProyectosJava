package interaccion;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

import datos.Datos;

public class barraCarga extends JFrame {

	JProgressBar current;
	  JTextArea out;
	  JButton find;
	  Thread runner;
	  int num = 0;
	  
	  
	  public barraCarga(){
		  
		 
	      setLocationRelativeTo(null);

		  int i = 10;
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JLabel label = new JLabel("Tu Oponente te ha atacado");
		  JButton Aceptar = new JButton ("Aceptar");
		  JPanel pane = new JPanel();
		  pane.setLayout(new FlowLayout());
		  current = new JProgressBar(0, 10);
		  current.setValue(i);
		  current.setStringPainted(true);
		  pane.add(current);
		  setContentPane(pane);
		  this.setSize(300, 200);
		  add(label);
		  add(Aceptar);
		  setVisible(true);
		  
		  
		  Aceptar.addActionListener(new ActionListener(){
			  
			  public void actionPerformed(ActionEvent e) {
				  
				  
				  setVisible(false);
				  
				  
				  
				  
			  }
			  
			  
			  
		  });
		  
			
		  
		  }


		}
		
  

