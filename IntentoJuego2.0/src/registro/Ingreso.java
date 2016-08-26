package registro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import pantalla.Marco;
import sprites.Board;
import sprites.FondoRegistro;
import conexionSql.Conectar;

public class Ingreso extends JFrame implements ItemListener{

	Board board;
	
	public  JButton boton1;
	private JLabel label1, label2;
	
	static JTextField textField, textField2;
	public Ingreso() {
		
		setSize(350, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setFocusable(true);
    	setDoubleBuffered(true);
    	setLayout(null); 
    	
    	boton1 = new JButton("Aceptar");
    	
		boton1.setBounds(140,250,80,20);
	

		label1 = new JLabel("Nombre de Usuario");
		label1.setBounds(125,80,120,10);
		label1.setForeground(Color.red);
		
        
		textField = new JTextField(20);
		textField.setBounds(135,100,80,20);
		
		
		
		label2= new JLabel("contrase�a");
		label2.setBounds(145,170,120,10);
		label2.setForeground(Color.red);
		
		
		textField2 = new JTextField(20);
		textField2.setBounds(135,200,80,20);
		
		
		
		
		add(label1);
		add(textField);
		add(label2);
		add(textField2);
		add(boton1);
		
	FondoRegistro p = new FondoRegistro();
	    this.add( p , BorderLayout.CENTER);
	
	
	
boton1.addActionListener(new ActionListener(){
		
		
		public void actionPerformed(ActionEvent e){
			
			Conectar con = new Conectar();
			Connection reg = con.conexion();
			
			String nombre,contrasenia;
			String sql;
			
			
			
			try {
				contrasenia = textField2.getText();
				nombre = textField.getText();
				java.sql.PreparedStatement pst=  reg.prepareStatement("select contrase�a, nombre from cliente where contrase�a= ? and nombre= ?  ");
				
				
				
				pst.setString(1, contrasenia);
				pst.setString(2, nombre);
				
				
				
				
				ResultSet rs = pst.executeQuery();
				
				
				
				while(rs.next()){
					
					
						
					JOptionPane.showMessageDialog(null, "inicio correcto");
					
					board = new Board();
					setVisible(false);
					reg.close();
				
				
				
			}
				rs.close();
				pst.close();
				
				} catch (SQLException ex) {
					
					
				JOptionPane.showMessageDialog(null, "el usuario no existe");
				}  
			
			
		}
		
});


}

			
	
	
private void setDoubleBuffered(boolean b) {
		
	
	
		
	}


	
	
	
	public void itemStateChanged(ItemEvent arg0) {
		
		
	}
	
	

}
