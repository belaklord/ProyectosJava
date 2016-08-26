package arrays;
import java.util.Scanner;
public class ejercicioVerde3 {
	public static void main (String []args){

		String[] vector1 = {"hola amigos"};
		String[] vector2 = {"hola amigosss"};			// creamos los dos vectores //

		compararVectorChar(vector1, vector2);			// llamada al metodo //


	}


	static String compararVectorChar(String vector1[], String vector2[]){		// creacion del metodo de comparacion //


		String numero = "0";

		for (int i= 0; i< vector1.length && i< vector2.length;i++){			// si son iguales devuleve 0 //

			if (vector1[i] == vector2[i]){


				numero = "0";
				System.out.println(numero);

			}
			if ( vector1[i].length() > vector2[i].length()){			// si el primero es mayor devuelve 1 //
				
					

				numero = "1";
				System.out.println(numero);


			}
			else {												// si no es ninguna de las dos es que el segundo es mayor
																	// que el primero y devuelve -1 //
				numero = "-1";
				System.out.println(numero);
			}

		}


		return numero;									// el metodo devuleve un string //
	}
}