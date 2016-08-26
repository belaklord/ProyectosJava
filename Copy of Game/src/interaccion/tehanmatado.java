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


public class tehanmatado extends JFrame{
	
	
	public tehanmatado(){
		setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setSize (300,300);
		
	setLayout(null);
	 
	  JLabel label = new JLabel("TE HAN MATADO!");
	  JButton Aceptar = new JButton ("Aceptar");
	  label.setBounds(100,20,175,50);
	  Aceptar.setBounds(100, 100, 100, 100);
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
