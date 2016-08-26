package bloque2;

												//CONDICIONAL ANIDADO//
import java.util.Scanner;

public class condicionalAnidado {
	
	public static void main (String[]args){
		
		double temp;
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("ingresa una temperatura");
		
		temp = S.nextDouble();
		
	if (temp >30){
		System.out.println("hace calor");
	}
		
		else if (temp > 25){									//no es mas que un if dentro de otro if//
																// tambi�n podemos meter un else dentro//
			System.out.println("hace frio!");
			
		}
	if (temp > 15){
		System.out.println("ouuyeah!!");
	}
	}
		
	}
	

