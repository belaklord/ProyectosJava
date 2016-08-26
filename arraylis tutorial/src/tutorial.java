

import java.util.*;

public class tutorial {
	
	public static void main (String []args ){

	// creamos el arraylist //
		
		ArrayList caca = new ArrayList();
		
		
		//variables //
		
		
		int a = 123;
		String b = "hola";
		
		//añadimos las variables con "add"//
		
		caca.add(a);
		caca.add(b);
		
	
		//recoreremos el arraylist con el tamañao "size" //
		
		for(int  i = 0; i<caca.size(); i++){
			
			// con "get" OBTENERMOS CADA POSICION DEL ARRAY LIST //
			
			System.out.println(caca.get(i));
			
			
		}
		
		
		// cambiar la posicion de los objetos del array list //
		
		
		// lo hacemos con ".set" //
		
		
		caca.set(0, b);
		caca.set(1, a);
		
		// hemos cambaido las posiciones de "a" y "b" //
		// para comporbarlo podemmos hacer un for para recorrer el array list //
		
		
		for(int  i = 0; i<caca.size(); i++){
			
			System.out.println(caca.get(i));
			
		}
		
		// ahora veremos como borrar elementos del array lisrt //
		
		// utilizamos el comando "remove" //
		
			caca.remove(0);
			
			/*coen esto eliminamos el elemento 0 de modo que el elemento que habia
			 en la posicion 1 ahora pasa a estar en la posicion 0, es decir, 
			 todolos los elementos se corren una posicion y el array list se 
			 redimensiona 
			 el roden de borrado importa, debemos tener en cuebnta el orden 
			 de borrado si vamos a borrar mas de una posicion ya que las demas 
			 cambairan cada vez que se borre una */
			
			
			
	
	}

}
