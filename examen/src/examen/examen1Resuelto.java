package examen;
import java.util.Scanner;
public class examen1Resuelto {


	public static void main(String args[]) {

		int valorEntrada;

		int mayor = 0;

		int menor = Integer.MAX_VALUE;

		int numValorValidos = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Teclea números positivos y enteros");

		System.out.println("-Cero para terminar-");

		do {

			valorEntrada = teclado.nextInt();

			if (valorEntrada >= 0) {

				if (valorEntrada > mayor) {

					mayor = valorEntrada;

				}

				if (valorEntrada < menor & valorEntrada > 0) {

					menor = valorEntrada;

				}

				if (valorEntrada == 0) {

					if (numValorValidos >= 2) {

						System.out.print("Teclea T para terminar ");

						if (!(new Scanner(System.in).nextLine().toUpperCase().equals("T"))){ 		

							valorEntrada = 1;

						}

					}

					else {

						System.out.print("Hacen falta dos números por lo menos");

						valorEntrada = 1;

					}

				}

				else {

					numValorValidos++;

				}

			}

			else {

				System.out.println("ERROR: Teclea números entre 1 y " + Integer.MAX_VALUE);

				System.out.println("-Cero para terminar-");

				valorEntrada = 1;

			}

		} while (valorEntrada > 0);

		System.out.println("Mayor: " + mayor);

		System.out.println("Menor: " + menor);

		teclado.close();

	}

}