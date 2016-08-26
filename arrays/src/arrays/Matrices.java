
						// escribe por teclado la matriz y la muetra //

package arrays;
import java.util.Scanner;
public class Matrices {
	public static void main (String [] args){
		
		Scanner S = new Scanner (System.in);
		
		// declaracion de la matriz //
			// matriz de 2x2 //
		
		int [][] matriz  = new int [2][2];
		
		
		// recorremos la matriz y escribimos los numeros de la matriz //
	
		for(int i = 0; i< matriz.length; i++){
			
			for (int j =0; j< matriz[0].length; j++){				// [0] posicion porque siempre tendremos algo en la posicion 0 comoo minimo, por eso ponemos el cero de referncia //
				
				System.out.println("introduce los numeros de la matriz");
				
				matriz [i][j] = S. 	nextInt();
				
				
				
			}
		}
		
		
		// comprobamos que la matriz tiene esos numeros recorrriendola y mostrandola por pantalla //
		
		for(int i =0 ; i< matriz.length; i++){
			for (int j=0; j< matriz[0].length; j++){
				
				System.out.print(matriz [i][j] + "  ");
				
			}
			
			System.out.println();
		}
		
	}
}
