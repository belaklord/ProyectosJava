package interaccion;

import java.awt.*;
import imagenes.vida75;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;

import datos.Datos;
import imagenes.imagenVS;
import interaccion.barraCarga;
import imagenes.barraVida100;

public class escenario extends JFrame {



	public  escenario(){

		setLocationRelativeTo(null);

		JFrame frame2 = new JFrame ("seleccionado");

		imagenVS vs = new imagenVS();
		
		barraVida100 vida = new barraVida100();
		
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		setSize (800,600);

		setLayout(null);


		JLabel label = new JLabel(Datos.datosGerrero[0].toString());
		JLabel label2 = new JLabel(Datos.datosMago[0].toString());
		label2.setBounds(200,200,500,450);
		label.setBounds(200,80,500,10);
		JButton Atacar = new JButton ("Atacar");
		JButton Defender = new JButton ("Defender");
		JButton Magia = new JButton ("Magia");
		Atacar.setBounds(230,5,75,30);
		Defender.setBounds(300,5,100,30);
		Magia.setBounds(400,5,75,30);

		
		
		add(vida);
		add(vs);
		add(label);
		add(Atacar);
		add(Defender);
		add(Magia);
		add (label2);
		
		setVisible (true);
		


		Magia.addActionListener(new ActionListener(){
			

			public  void actionPerformed(ActionEvent e) {


				Atacar.addActionListener(new ActionListener(){


					public void actionPerformed(ActionEvent e) {


						if (Datos.datosMago[0].vida <=0){


							hasGanado win = new hasGanado();

							return;

						}

						if (Datos.datosGerrero[0].vida <=0){


							tehanmatado muerto = new tehanmatado();
							return;
						}

						else{


							label.setText(null);
							label2.setText(null);


							JLabel label3 = new JLabel(defensaMago.ataque());
							JLabel label4 = new JLabel(defensaGuerrero.ataque());

							label4.setBounds(15,80,500,10);

							label3.setBounds(50,75,500,300);

							add (label3);
							add (label4);

							setVisible (true);

							barraCarga JProgressBar = new barraCarga();



							Atacar.addActionListener(new ActionListener(){

								public void actionPerformed(ActionEvent e) {

									label3.setText(null);
									label4.setText(null);


								}



							});

						}


					}


				});

				if (Datos.datosGerrero[0].vida <=0){


					tehanmatado muerto = new tehanmatado();

					return;
				}

				if (Datos.datosMago[0].vida <=0){

					hasGanado win = new hasGanado();


					return;
				}




				else {


					if(Datos.datosGerrero[0].mana == 0){


						return;

					}

					
					
					JLabel label3 = new JLabel(defensaMago.ataque());
					JLabel label4 = new JLabel(defensaGuerrero.ataque());

					label4.setBounds(50,80,500,10);
					label3.setBounds(50,75,500,300);
					
					add (label4);
					add(label3);

					setVisible (true);
					barraCarga JProgressBar = new barraCarga();


					Magia.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							
							
							



						}



					});



				}



			}


		});



		



	}






}
