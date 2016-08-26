package arrays;
import java.util.Scanner;
public class comparacionVectores {
	public static void main (String []args){

		Scanner S = new Scanner (System.in);
		int vector1[]= new int [5];
		System.out.println("introduce los numero del primer array");
		for (int i =0; i<5; i++){

			// definicion de los dos arrays //
			vector1[i] =S. nextInt();

		}
		System.out.println("introduce los numero del segundo array");
		int vector2[] = new int [5];
		for (int i = 0; i<5; i++){



			vector2[i] = S. nextInt();
		}


		vectoresIntIguales(vector1, vector2);				// llamada al metodo //
	}

	static boolean  vectoresIntIguales( int vector1[],int vector2[]){	// metodo de comparacion //

		boolean iguales = true;					//variable booleana //

		for (int i =0; i < vector1.length &&  i <vector2.length; i++){

			if (vector1 [i]== vector2[i]){		

				iguales = true;					// comparamos la longitud de los dos arrays y los numeros que tienen //
			}
			else {								// cunado no sean iguales devolvera false //
				iguales = false;
			}


		}
		if (iguales == true){

			System.out.println("los vectores son iguales");			// si es true son iguales //
		}
		else {
			System.out.println("los vectores no son iguales");		// si el false no son iguales //
		}

		return iguales;			// devolvemos la variable booleana // 


	}


}
