package interaccion;

import imagenes.imagenVS;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import datos.Datos;





public class escenario2 extends JFrame {



	public escenario2(){

		setLocationRelativeTo(null);


		JFrame frame2 = new JFrame ("seleccionado");

		imagenVS vs = new imagenVS();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		setSize (500,300);

		setLayout(null);

		JProgressBar barra=new JProgressBar();
		JLabel label = new JLabel(Datos.datosGerrero[0].toString(),JLabel.CENTER);
		JLabel label2 = new JLabel(Datos.datosMago[0].toString());
		label.setBounds(5,75,500,300);
		label2.setBounds(50,80,500,10);
		JButton Atacar = new JButton ("Atacar");
		JButton Defender = new JButton ("Defender");
		JButton Magia = new JButton ("Magia");
		Atacar.setBounds(130,5,75,30);
		Defender.setBounds(200,5,100,30);
		Magia.setBounds(300,5,75,30);

		add(vs);
		add(barra);
		add(label);
		add(Atacar);
		add(Defender);
		add(Magia);
		add (label2);
		setVisible (true);


		

		Magia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				
				
				
				if (Datos.datosMago[0].vida <=0){


					tehanmatado muerto = new tehanmatado();

					return;
				}

				if (Datos.datosGerrero[0].vida <=0){

					hasGanado win = new hasGanado();


					return;
				}




				else{
					
					
					if (Datos.datosMago[0].mana <20){

						Magia.removeActionListener(this);

					}


					label2.setText(null);
					label.setText(null);

					JLabel label3 = new JLabel(defensaMagia.defensaMagia());
					JLabel label4 = new JLabel(defensaMago.ataque());

					label4.setBounds(50,80,500,10);
					label3.setBounds(50,75,500,300);

					add (label4);
					add (label3);

					setVisible (true);
					barraCarga JProgressBar = new barraCarga();

					
					Magia.addActionListener(new ActionListener(){

						public void actionPerformed(ActionEvent e) {
							
							
							label3.setText(null);
							label4.setText(null);


						}



					});

				}



			}
		});


		Atacar.addActionListener(new ActionListener(){
			

			public void actionPerformed(ActionEvent e) {
				
				

				if (Datos.datosMago[0].vida <=0){


					tehanmatado muerto = new tehanmatado();

					return;
				}

				if (Datos.datosGerrero[0].vida <=0){


					hasGanado win = new hasGanado();

					return;
				}

				else{

					label2.setText(null);
					label.setText(null);


					JLabel label3 = new JLabel(defensaGuerrero.ataque());
					JLabel label4 = new JLabel(defensaMago.ataque());

					label4.setBounds(50,80,500,10);
					label3.setBounds(50,75,500,300);

					add (label4);
					add (label3);
					
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



	}








}
