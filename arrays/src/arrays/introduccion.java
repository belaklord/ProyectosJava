package arrays;
import java.util.Scanner;
public class introduccion {
	public static void main (String[]args){
		
		int array [] = new int [5];						// declaracion del array.
		
		Scanner S = new Scanner (System.in);
		
		for (int i =0; i<5; i++){								// bucle for para determinar cuantos numero introduciremos.
			
			System.out.println("introduce un numero");
				array [i] = S. nextInt();					// los valores que inrtroducamos se alamacenarán en la array hasta <5.
		}
		
		
		for (int i=0; i<5; i++){
			
			System.out.print(array [i] + " ");						// mostramos los numeros que contiene el array.
		}
		
	}
}