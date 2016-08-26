

/* Antonio luis Gallego Lopez
 * el programa pide un numero entero por teclado, seguidamente dirá el número de caracteres 
 * de los que se compone el numero introducido. si el numero introducido es negativo dará error y volverá 
 * a empezar y si el numero introducido es "0", el programa terminara.
 */
package examen;
import java.util.Scanner;
public class cifrasALGL {
	public static void main (String []args){

		int  numero, i;														// declaracion de variables //
		i = 0;
		Scanner S = new Scanner (System.in);					// usamos Scanner para reconocer el numero introducido//

		do {														// usamos un bucle do / while para que nos pida//
																			// numeros hasta que queramos //

			System.out.println("introduce el numero entero");
			numero = S. nextInt();

			if (numero < 0){									// añadimos el mensaje de error en caso de que sea
																// negativo el numero y pedimos otro numero //

				System.out.println("numero incorrecto");

			}
			else {

				while( numero > 0 ){									// dentro del bucle introducimos un bucle while//

					numero = numero / 10;								// eliminamos la ultima cifra del numero//

					i++;												// incrementamos i en 1 //

				}
				System.out.println("el numero introducido tiene " + i + " digitos");	

			}

		}while (numero != 0);			// el bucle termina cuando el numero es diferente de 0 //

																		
	}


}
