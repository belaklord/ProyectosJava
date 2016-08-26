


/* la cabecera es importante en el examen, hay que tenerla hecha 

 * lo que hace el programa. tambien documentar el programa con comentarios
 * seleccionar y pulasar control "i" para ordenar el codigo, los copentarios todos alineados.
 */
package examen;
import java.util.Scanner;

public class mayorMenorAGL {

	public static void main (String []args){
		Scanner S = new Scanner (System.in);


		int numero, mayor, menor, numerosValidos;
		menor = Integer.MAX_VALUE;
		mayor = 0;
		numerosValidos = 0;

		System.out.println("introduce los numeros y pulsa 0 para terminar");


		do{
			numero = S. nextInt();

			if (numero >= 0 && numero > mayor){

				mayor = numero;
			}

			if (numero >0 && numero < menor){

				menor = numero;

			}

			if ( numero == 0 || numerosValidos >=2){

				System.out.println("pulsa T para terminar");

				if (!(new Scanner(System.in). nextLine(). toUpperCase(). equals("T"))){

					numero =1;
				}

				else {

					numero = 0;
				}




			}



		}while(numero > 0);

		System.out.println("el numero mayor es " + mayor);
		System.out.println("el numero menor es " + menor);

		// hasta aqui el programa básico que me saca el mayor y
		//el menor de una serie de numeros //
		// faltan añadir las expceptciones //
	}
}



	
	

	
	



				