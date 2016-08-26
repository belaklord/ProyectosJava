package juego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;



public class Baraja 

{
	
	
    
  static ArrayList<Carta> baraja = new ArrayList<Carta>();
  
   


    public void barajaE(){ /* Baraja Española */
    	
    	
	
	
	
    
    
	  String numero[] = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
	         "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey" };
	      String palos[] = { "Copas", "Oros", "Bastos", "Espadas" };
	      
	      
		  
	     double valor = 1;
		  
		  
			  if(valor > 7){
				  
				  valor = 1;
			  }
			  
			  for(int i = 0; i<numero.length-5; i++){
			      
			      /* Bucle anidado ej: 4 veces AS, 4 veces dos, etc.*/
				  
				  for(int z = 0; z<palos.length; z++){
					  
					  
					  baraja.add(new Carta(numero[i], palos[z],valor));
				  	
				  }
			    	
				 
			    	
				    valor++;  		 
		  }
		  
			   double valor2 = 0.5;
			  for(int i = 7; i<numero.length; i++){
				  
				  for(int z = 0; z<palos.length; z++){
					  
					  baraja.add(new Carta(numero[i], palos[z],valor2));
					  
					  
					  
					  
				  }
			    	
				   	
		  }
			  
	            
		    
    }

		    public static void Inicio_jugada(){
		    	
		    	 ArrayList<Double> compara = new ArrayList<Double>();
		    	Collections.shuffle(baraja);
		    	
		    	  double total2 = 0.0;
		    	/*
		    	 * declaramos array list de la mano del jugador 
		    	 * con un for recorremos el array list de la baraja 
		    	 * añadimos las cartas del array baraja al array mano
		    	 * lo mostramos y volvemos a prguntar
		    	 * 
		    	 */
		    	
		     ArrayList<Carta> mano = new ArrayList<Carta>();
		   
		     boolean contador = true;
		    	  
		    
		    	 
		    		for(int i = 0; i<baraja.size(); i++){	
		    			
		    			 if(contador == true){
		    			
		    			

			    		mano.add(baraja.get(i));
			    		System.out.println(baraja.get(i));
			    		
			    		System.out.println("desea una nueva carta");
			    		
			    		Scanner teclado1 = new Scanner(System.in);
			    	    String respuesta = teclado1.nextLine();
			    	    
    	    
			    		if(respuesta == "" ){
			    			
			    			System.out.println("error");
			    		}
			    		else{
			    			
			    			
			    			 char siOno = respuesta.charAt(0);
					    	    
			    	    	 switch (siOno){
						    	    
						    	    case 'S':
						    	    	
						    	    	contador = true;
						    	    	
						    	    	break;
								    	  
						    	    
						    		
						    	    case 'N':
						    	    	contador = false;
						    	    	Iterator<Carta> datos = mano.iterator();
						    	    	
						    	    	ArrayList<Double> suma = new ArrayList<Double>();
						    	    	
						    	    	
						    	    	Iterator<Double> total = suma.iterator();
						    	    	
						    	    	if(Jugadores.contador <1){
						    	    		  System.out.println("el jugador1 se planta con las siguientes cartas" );
						    	    	}
						    	    	else{
						    	    		
						    	    		System.out.println("el jugador2 se planta con las siguientes cartas" );
						    	    	}
						    	    	
						    	      
						    	        
						    	        
						    	        
						    	        while(datos.hasNext()){
						    	        	Object elemento = datos.next();
						    	        	System.out.print(elemento + "\n");
						    	        	
						    	        	
						    	        }
						    	        
						    	        for(int j= 0; j<mano.size(); j++){
						    	        	
						    	        	suma.add(mano.get(j).valor);
						    	        	
						    	        }
						    	        
						    	      
						    	       for(int z= 0; z<suma.size(); z++){
						    	    	   
						    	    	   total2 += suma.get(z);
						    	    	   
						    	    	 
						    	    	   
						    	       }
						    	       compara.add(total2);
						    	        
						    	      
						    	       
						    	       System.out.println("la suma es " + total2);				// falta comparar el total de este jugador conel total del otro jugador //
						    	       
						    	     
						    		
						    		break;
						    	  
						    	    default:
						    	    	try{
						    	    		
						    	    		System.out.println("eleccion erronea");
						    	    		contador = true;
						    	    
						    	    	}
						    	    		catch(Exception e){
						    	    			
						    	    			System.out.println("error");
						    	    		}
						    	    			
						    	    		
						    	    		
						    	    	}
						    	    	
						    
				    	  
				    	   
				    		
				    	    	}
				    			
				    			 
				    		}
				    		
			    			    
			    		}
		    		
		    		
		    		  
			    	   
		    	if(Jugadores.contador <1){
		    		Jugadores.mostrar_jugador2();
		    		
		    		
		    	}
		    	
		    	
		    	 System.out.println(compara.get(0));
		    			/*
		    		if(compara.get(0)>compara.get(1) && compara.get(0)<=7.5){
		    			
		    			
		    			System.out.println("el jugador 1 gana con la siguiente puntuacion" +  " " + compara.get(0));					// hacer bien el texto //
		    		}
		    		
		    		
		    		if(compara.get(1)>compara.get(0) && compara.get(0)<=7.5){
		    			
		    			System.out.println("el jugador 2 gana con la siguiente puntuacion" +  " " + compara.get(1));	
		    		}
		    		
		    		
		    		if(compara.get(0)<compara.get(1) && compara.get(0)>7.5){
		    			

		    			System.out.println("el jugador 1 gana con la siguiente puntuacion" +  " " + compara.get(0));
		    			
		    			
		    		}
		    		
		    		
		    		if(compara.get(1)<compara.get(0) && compara.get(1)>7.5){
		    			
		    			System.out.println("el jugador 2 gana con la siguiente puntuacion" +  " " + compara.get(1));
		    		}
		    		
		    		
		    	 */
		     }
		    	
	   	
		    
   

    public void barajaF() { /* Baraja francesa*/
	
	
	
    
    ArrayList<Carta> baraja = new ArrayList<Carta>();
    
    
    	String numero[] = { "A", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
         "Siete", "Ocho", "Nueve", "Diez", "J", "Q", "K" };
    	String palos[] = { "Corazones", "Rombos", "Picas", "Treboles" };
      
       
    	double valor = 1;
	  
	  
	  if(valor > 7){
		  
		  valor = 1;
	  }
	  
	  for(int i = 0; i<numero.length-6; i++){
	      
	      /* Bucle anidado ej: 4 veces AS, 4 veces dos, etc.*/
		  
		  for(int z = 0; z<palos.length; z++){
			  
			  
			  baraja.add(new Carta(numero[i], palos[z],valor));
		    	
		    	
		  }
	    	
	    	
		    valor++;  		 
  }
    
	
    	
	  
	  double valor2 = 0.5;
	  for(int i = 7; i<numero.length; i++){
		  
		  for(int z = 0; z<palos.length; z++){
			  
			  baraja.add(new Carta(numero[i], palos[z],valor2));
		  }
	    	
  }
    

      
      /* Barajar cartas */
	  
        Collections.shuffle(baraja);
        
        Iterator<Carta> datos = baraja.iterator();
        while(datos.hasNext()){
        	Object elemento = datos.next();
        	System.out.print(elemento+" / " + "\n");
        }
        
    }
    
    
}
   
    
    
    
    
    
    

