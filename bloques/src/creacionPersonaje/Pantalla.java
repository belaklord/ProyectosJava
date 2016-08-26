/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionPersonaje;

import java.awt.Color;

import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;


/**
 *
 * @author pelu
 */
public class Pantalla extends JFrame implements ItemListener {
    
        JLabel  label;
	static JTextField textField, textField2, textField3;
	public  JButton boton1, boton2;
	private JLabel label1, label2, label3;
        Image buffer;
    
    public  Pantalla(){
        
                setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setFocusable(true);
		setDoubleBuffered(true);
		setLayout(null); 
                
                
              
                
                
                textField = new JTextField(20);
		textField.setBounds(40,50,80,20);
		add(textField);
                
                
                textField2 = new JTextField(20);
		textField2.setBounds(43,110,80,20);
		add(textField2);
                
                
               
                
                
                boton1 = new JButton("Registrar");
		boton1.setBounds(50,250,90,30);
		boton1.setForeground(Color.blue);
		add(boton1);

		
                  boton1.addActionListener(new ActionListener(){
                      
                      
                      
                     
                      public void actionPerformed(ActionEvent e){
                          
                          
                          
                  
                     
                    
                          
                          
                      }
                      

                   
                       
                       
                       
                   });
    
                
    }
    

    public static void main(String args []){

		new Pantalla();

	}

    
    
    
    
    private void setDoubleBuffered(boolean b) {
		// TODO Auto-generated method stub

	}
    
    
    
    public void itemStateChanged(ItemEvent arg0) {




	}
                 
    
    

    
    
}
