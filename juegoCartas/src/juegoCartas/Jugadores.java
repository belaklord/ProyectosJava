package juegoCartas;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;



public class Jugadores {
	
	
	
	
	
public static void main(String[]args){
		
	ArrayList<String> jugador1 = new ArrayList<String>();
	
	ArrayList<String> jugador2 = new ArrayList<String>();
	
	
				//JUGADOR 1 //

	System.out.println("introduce un nombre");
	
	
	Scanner S = new Scanner (System.in);
	

	
	String nombre = S. nextLine();
	
	
	
	
	
				//JUGADOR2//
	
	
	
		System.out.println("introduce un apellido");
	
	
	Scanner s = new Scanner (System.in);
	

	
	String apellido = S. nextLine();
	
	
	jugador1.add(nombre);
	jugador2.add(apellido);
	
	java.util.Iterator<String> Jugador1 = jugador1.iterator();
	
	while(Jugador1.hasNext()){
		
		
		String elemento = Jugador1.next();
		System.out.println(elemento +"/");
	}
	
		
		
	}


	

}
