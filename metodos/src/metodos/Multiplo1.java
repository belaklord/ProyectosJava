					// EJECRCICOS DE LA PARTE DE PROGRAMACION ESTRUCTURADA, (METODOS) //

										// EJERCICIO COLOR NARANJA //
										
					// ESTO ES UN EJERCICIO BASE PARA REALIZAR LOS DEMAS EJERCICIOS DE METODOS //


package metodos;
// Multiplo1.java
	// Fecha: 14/10/2013
	// Autor/a:.......
	// Escribe en pantalla los m�ltiplos de 2 por debajo de un TOPE, 16.

	import java.util.Scanner;
	public class Multiplo1 	{
		public static void main(String argumentos[]) {
			
			
			 // LLAMADA AL METODO //
			muestraMultiplos1();  // escribimos el nombre del m�todo que usaremos m�s adelante. // // todo lo que sea est�tico 
												// estara en cursiva //.
			
			// UN METODO SIEMPRE TIENE LLAMADA O INVOCACION (USAR EL M�TODO), 
			//DECLARACION (COMO SE LLAMA EL METODO) E IMPLEMENTACION (DONDE SE DICE LO QUE HACE EL METODO) //

			// Declaraci�n de variables
			Scanner teclado = new Scanner(System.in);
			final int TOPE = 16  ; 				// Constante, el m�ximo valor del m�ltiplo
			int mult  ;							// Almacena el m�ltiplo calculado
			int cont  ;							// Contador utilizado en el c�lculo

			// Inicializa las variables
			mult = 0 ;
			cont = 0 ;

			System.out.println("\t M�ltiplos de 2\n");
			while (mult < TOPE)					// Bucle de c�lculo y visualizaci�n
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
			teclado.close();
		}
				// DECLARACION DEL METODO// // PODEMOS PONER LA DECLARACION Y DESPUES LA LLAMA O VICEVERSA //
		private static void muestraMultiplos1() {		// creacion del m�todo //
			
			
		}
	}
	
	// explicacion : el programa simple hecho, debajo del main creamos el m�todo , 
	
	// ESTE ES EL COODIGO QUE USAREMOS, VEREMOS LA LLAMAD AL METODO // lo veremos en multiplo2//
	
	