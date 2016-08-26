package bloque2;
//EJERCICIO: COMPROBAR SI UN NUMERO DADO POR TECLADO ES PAR O IMPAR//


import java.util.Scanner;
public class parImpar {
public static void main (String [] args){
	
	int x, a = 2, c;
	
	System.out.println("introduce un numero");

	Scanner S = new Scanner (System.in);
	x = S.nextInt();
	
	c = x % a;
	
	if ( c != 0) {
		System.out.println ("el numero es impar");
		
	}
	else { 
		System.out.println (" el numero es par");
	}
}
}