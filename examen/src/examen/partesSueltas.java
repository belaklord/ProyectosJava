
// introducir 8 numeros y que te saque la suma de los 8 numeros //

// hay hechos dos, pero los demas son iguales //




package examen;
import java.util.Scanner;
public class partesSueltas {
	
	public static void main (String []args){
		int numero, suma=0,  i = 0;							// declaramos variables numero, suma y i (contador)
		Scanner S = new Scanner (System.in);
		System.out.println("escribe exactamente 8 numeros enteros");
		
		
			while ( i < 8){									// abrimos un bucle hasta el numero 8.	
				
				numero = S. nextInt();
				
				suma = suma +numero;						// declaramos una variable suma y la igualamos a 0
															// de esta forma podemos cada vez que entre un numero
															// tome el valor de suma y le suma el nuevo numero 
															// introducido, así hasta que termine el contador.
				
					i++;									// contador, hasta 8 numeros .
				}
			
				System.out.println("la suma es " + suma);
				
					
			
				
			
			
			
					
		 
		
	}
}
