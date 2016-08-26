package registro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import conexionSql.Conectar;
import pantalla.JPanelBackground;
import sprites.FondoDerrota;
import sprites.FondoRegistro;



public class Registro extends JFrame implements ItemListener {

	JLabel  label;
	static JComboBox combo;
	static JTextField textField, textField2, textField3;
	public  JButton boton1, boton2;
	private JLabel label1, label2, label3;

	private Conectar conectar;
	private Ingreso ingreso;


	private String guerrero = "/imagenes/npcabajo.gif";
	private Image background;
	private Image image;
	Image buffer;
	Graphics pantallaPrincipal;


	public Registro(){


		setSize(350, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setFocusable(true);
		setDoubleBuffered(true);
		setLayout(null); 

		combo=new JComboBox();
		combo.addItem("vacio");
		combo.addItem("Mago");
		combo.addItem("Guerrero");
		combo.addItemListener(this);
		combo.setBounds(200,50,80,20);
		add(combo);

		boton1 = new JButton("Registrar");
		boton1.setBounds(50,250,90,30);
		boton1.setForeground(Color.blue);
		add(boton1);


		boton2 = new JButton("Ya estoy registrado");
		boton2.setBounds(180,250,150,30);
		boton2.setForeground(Color.blue);
		add(boton2);



		textField = new JTextField(20);
		textField.setBounds(40,50,80,20);
		add(textField);

		label1 = new JLabel("Nombre de Usuario");
		label1.setBounds(25,30,120,10);
		label1.setForeground(Color.red);
		label1.setFont(new java.awt.Font("Tahoma", 0, 12)); 
		add(label1);



		textField2 = new JTextField(20);
		textField2.setBounds(43,110,80,20);
		add(textField2);


		label2 = new JLabel("Contrase�a");
		label2.setBounds(50,90,80,10);
		label2.setForeground(Color.red);
		label2.setFont(new java.awt.Font("Tahoma", 0, 12)); 
		add(label2);
		

		textField3 = new JTextField(20);
		textField3.setBounds(125,200,80,20);
		add(textField3);

		
		label3 = new JLabel("Nick");
		label3.setBounds(150,180,80,10);
		label3.setForeground(Color.red);
		label3.setFont(new java.awt.Font("Tahoma", 0, 12)); 
		add(label3);
		

		FondoRegistro p = new FondoRegistro();
		this.add( p , BorderLayout.CENTER);

		ImageIcon ii = new ImageIcon(this.getClass().getResource(guerrero));

		image = ii.getImage();



		boton2.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e){


				ingreso = new Ingreso();
				setVisible(false);

			}



		});



		boton1.addActionListener(new ActionListener(){


			public void actionPerformed(ActionEvent e){


				Conectar con = new Conectar();
				Connection reg = con.conexion();

				String nombre,contrasenia, nick;
				String sql, sql2, sql3;

				nombre = textField.getText();
				contrasenia = textField2.getText();
				nick =  textField3.getText();

				sql=   "insert into cliente (nombre, contrase�a) values(?,?)" ;
				sql2 = "insert into nick (nickname) values(?)";
				
				try{


					java.sql.PreparedStatement pst=  reg.prepareStatement(sql);
					java.sql.PreparedStatement pst2=  reg.prepareStatement(sql2);
					
					pst.setString(1, nombre);
					pst.setString(2, contrasenia);
					pst2.setString(1, nick);
			
					
					
					
					if(nombre.equals("") || contrasenia.equals("") || nick.equals("")||combo.getSelectedItem().equals("vacio") ){

						JOptionPane.showMessageDialog(null, "debe rellenar todos los campos y seleccionar un personaje");

					}
					
					
					


					else{		
						
						

						if(combo.getSelectedItem().equals("Guerrero") ||combo.getSelectedItem().equals("Mago")){
							
							int n = pst.executeUpdate();
							int n2 = pst2.executeUpdate();
							
							if(n>0 && n2>0){

							JOptionPane.showMessageDialog(null, "guardado con exito");

							ingreso = new Ingreso();
							setVisible(false);
							}
						}

						else{

							JOptionPane.showMessageDialog(null, "error");

							

						}


					}

				}catch (SQLException ex){

					

					JOptionPane.showMessageDialog(null, "el usuario ya existe");


				}



			}

		});


	}

	public void update(Graphics g){




		Dimension tamanio = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondoRegistro.gif"));        
		g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
		setOpacity(false);
		super.paintComponents(g);




		if (combo.getSelectedItem().equals("Guerrero")){

			ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/guerrero.gif"));
			g.drawImage(imagenFondo2.getImage(),200,150,100,100, null);  
			setOpacity(false);
			setVisible(true);

		}

		if (combo.getSelectedItem().equals("Mago")){

			ImageIcon imagenFondo2 = new ImageIcon(getClass().getResource("/imagenes/mago.gif"));
			g.drawImage(imagenFondo2.getImage(),210,150,100,100, null);  
			setOpacity(false);
			setVisible(true);

		}
		

	}

	public void paint(Graphics g){


		buffer = createImage(getWidth(), getHeight());
		pantallaPrincipal = buffer.getGraphics();
		update(pantallaPrincipal);
		g.drawImage(buffer, 0, 0, this);





	}



	private void setDoubleBuffered(boolean b) {
		// TODO Auto-generated method stub

	}



	public Image getImage(){

		return image;

	}




	public void itemStateChanged(ItemEvent arg0) {




	}





	private void setOpacity(boolean b) {
		// TODO Auto-generated method stub

	}





	







	
	
	
	
	
	
	
	
	
	
	
	
	
}
