package arrays;
import java.util.Scanner;
public class ComparacionMatrices {
	public static void main (String [] args){

		Scanner S = new Scanner (System.in);

		boolean iguales = true;
		int contador = 1;
		int a, b;
		int matriz [][] = {

				{1,2,3},
				{4,5,6},
				{7,8,9}

		};


		System.out.println("introduce la dimension a de la matriz");

		a = S. nextInt();

		System.out.println ("introduce la dimension b de la matriz");

		b= S. nextInt();

		int[] [] matriz2 = new int [a][b];

		// rellenamos la matriz con numeros del uno hasta el numero maximo de la longitud  lo hacemos con el contador//

		for (int i = 0; i< matriz2.length;i++){

			for (int j = 0; j< matriz2[0].length; j++){

				matriz2[i][j] = contador ++;


			}
		}


		// una vez rellena sabemos que es igual ya que los numeros van del 1 al 9 gracias al contador que ha ido agregandolos // 

		// ahora vemos las condiciones para saber s son iguales o no //

		// comparamos las longitudes de los dos vectores  // 

		if ( matriz.length == matriz2.length){

			//// si los indices tambien coinciden, para ello ponemos la siguiente condicion ////

			if (matriz[0].length == matriz2[0].length){

				// recoreremos una de los dos matrices ya que las dos miden lo mismo si entra en esta condicion //

				for (int i = 0; i< matriz.length&& iguales; i++){

					for (int j = 0; j< matriz.length&& iguales; j++){

						if(matriz[i][j] != matriz2[i][j]){

							iguales = false;
						}
					}
				}

			}

			else {

				iguales = false;
			}


		}
		else {

			iguales = false;
		}
		if (iguales){

			System.out.println("las dos matrices son iguales");
		}
		else{

			System.out.println("no son iguales");
		}

	}

}
