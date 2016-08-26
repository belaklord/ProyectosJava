package examen;
import java.util.Scanner;
public class tecladoMayor {
	
	public static void main ( String[]args ){
		
		Scanner S = new Scanner (System.in);
		int numero, mayor=1;
		
		System.out.println("introduce los numeros");
		do {
			
			numero  = S. nextInt();
				
				if (numero > mayor){			//hacer la comparacion con las variables para almacenar datos
					
					mayor = numero;
				}
				
				
				
		
	}		while (numero >0);
	
	System.out.println( " el numero mayor es " + mayor);
}
}