					// EJECRCICOS DE LA PARTE DE PROGRAMACION ESTRUCTURADA, (METODOS) //

										// EJERCICIO COLOR NARANJA //
										
					// ESTO ES UN EJERCICIO BASE PARA REALIZAR LOS DEMAS EJERCICIOS DE METODOS //


package metodos;
// Multiplo1.java
	// Fecha: 14/10/2013
	// Autor/a:.......
	// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

	import java.util.Scanner;
	public class Multiplo1 	{
		public static void main(String argumentos[]) {
			
			
			 // LLAMADA AL METODO //
			muestraMultiplos1();  // escribimos el nombre del método que usaremos más adelante. // // todo lo que sea estático 
												// estara en cursiva //.
			
			// UN METODO SIEMPRE TIENE LLAMADA O INVOCACION (USAR EL MÉTODO), 
			//DECLARACION (COMO SE LLAMA EL METODO) E IMPLEMENTACION (DONDE SE DICE LO QUE HACE EL METODO) //

			// Declaración de variables
			Scanner teclado = new Scanner(System.in);
			final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
			int mult  ;							// Almacena el múltiplo calculado
			int cont  ;							// Contador utilizado en el cálculo

			// Inicializa las variables
			mult = 0 ;
			cont = 0 ;

			System.out.println("\t Múltiplos de 2\n");
			while (mult < TOPE)					// Bucle de cálculo y visualización
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
			teclado.close();
		}
				// DECLARACION DEL METODO// // PODEMOS PONER LA DECLARACION Y DESPUES LA LLAMA O VICEVERSA //
		private static void muestraMultiplos1() {		// creacion del método //
			
			
		}
	}
	
	// explicacion : el programa simple hecho, debajo del main creamos el método , 
	
	// ESTE ES EL COODIGO QUE USAREMOS, VEREMOS LA LLAMAD AL METODO // lo veremos en multiplo2//
	
	