package metodos;
import java.util.Scanner;
public class ejercicioSalario {
	public static void main (String []args){
		
	
	
	int  numero, sueldo;
	
	Scanner S = new Scanner (System.in);
	
	
	System.out.println("introduce el numero de horas que trabaja");
	
		numero = S. nextInt();
		
	
		
		
		sueldo=calculaSalario(numero);
		System.out.println(sueldo);
	
	

		
	}

	static int calculaSalario (int h){
		
		
			if (h < 35){
				
				h = h*15;
				
				
			}
			else{
				
				h= (h-35) * 22 + (35*15);
				
				
			}
			 
			 return h;					// el return debe ir fuera del if o del bucle porque es lo que devuelve 
			 								//despues de hacerlo//
	
	
	
	
	}
		
		

		
		
	
	
	
}
