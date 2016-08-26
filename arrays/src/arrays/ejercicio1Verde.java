package arrays;
import java.util.Scanner;
public class ejercicio1Verde {
	public static void main (String []args){
		
		int b = 4;								
		 									// declaramos el vector y el numero //
		int vector [] = new int [5];
		
		
			frecuenciaNum(vector, b);			// llamamos al metodo //
		
		
		
	}
	
	
	static int frecuenciaNum(int array [], int b){				//creamos el metodo que recibe el vector y el numero //
		
			int e= 0;											// contador para el if //
			
		
		Scanner S = new Scanner (System.in);
		 
		for (int i = 0; i<5; i++){
			System.out.println("introduce un numero");				// llenamos el vector //
			
			array[i] = S. nextInt();
			
			if (array[i] == b){
					e++;
				
			}
			
		}
		System.out.println(" el numero  " + b + " se repite " + e + " veces" );			// repeticion del numero //.
			return e;
				
		
		}
	
		
		

	

}
