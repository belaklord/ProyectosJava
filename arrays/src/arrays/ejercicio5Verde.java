
// el programa al introducir un numero por teclado te dice la primera posicion en la que se encuentra el numero 
// dentro del array //

package arrays;
import java.util.Scanner;
public class ejercicio5Verde {
	public static void main (String []args){
		
		
		int vector [] = {3,2,3,4,7,2,4};				
		
	System.out.println(buscaInt(vector));
		
	}

	
	static int buscaInt(int vector[]){
		
		int a;
		Scanner S = new Scanner (System.in);
		
		System.out.println("introduce un numero");
		
		a  = S. nextInt();
		
		for (int i=0; i< vector.length; i++){
		
		
		if (vector[i] == a){
			
				a = i;
		}
		
	}
		return a;
	}
	
}
