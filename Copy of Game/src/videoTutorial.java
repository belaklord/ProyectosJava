import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class videoTutorial extends JFrame {

	public videoTutorial(){
		
		//llamamos al constructor de la super clase jframe//
		
		super("curso tutorial");
		
		// configuramos el tamaño con setsize //
		
		setSize(200, 200);
		
		// configuramos que es lo que euremos que haga el boton cuando se pulse //
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//terminamos haciendo que aparezca el marco //
		
		setVisible(true);
		
		
		// ya tenemos el marco ahora ya podemos  añadirle componentes //
		// para cada componente tenemos una clase dentro del paquete swin //
		
					//jButton para vrear los botones//
		
		// layout para el esuqema del contenido del  marco localizacion de botones etc //
		
		
		FlowLayout dis = new FlowLayout();
		setLayout (dis);
		
		//añadimos los componenetes // en este caso botones //
		//los creamos //
		
		JButton Guerrero = new JButton ("Guerrero");
		JButton Mago = new JButton ("Mago");
	
		
		// con el metodo add los añadimos al marco//
		
		add(Guerrero);
		add(Mago);
		
		// para que sean visibles //
		setVisible (true);
		
		//componente de etiquetas de texto JLabel(informacion que no puede se modificada por el usuario
		//y JTextField (para que el usuario escriba) ///
		
		JLabel titulo = new JLabel("seleccion de personaje", JLabel.RIGHT);
		
		FlowLayout flo  = new FlowLayout();
		setLayout(flo);
		add(titulo);
		
		setVisible(true);
		
		
			
			
		
		
		
			Guerrero.addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
		
			System.out.println("hola!!");
			
				}
			});
			
			
		
		
		
		
		
	
			
			
		
			
			
			
		
		
		
		
		
	}
	
	
	//creamos un objeto de la clase videotutorial para que se cree el marco //
	
	public static void main (String [] args){
		
		
		videoTutorial usr2 = new videoTutorial();
		
		
		
		
		
		
	}
	
	
	
}



		

