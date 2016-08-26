

import java.util.Scanner;
public class ejercicio2Verde {
	
	
	public static void main (String []args){
		
		Scanner S = new Scanner (System.in);
		Scanner n = new Scanner (System.in);
		
		System.out.println("introduce la cadena 1");
		 String cadena1 = S. nextLine();
		 
		System.out.println("introduce la cadena 2");
		String cadena2 = n. nextLine();
		
		/*
		String cadena1 = "en mi casa y en el patio";
		String cadena2 = "en";
		*/
		
		vecesSubCadena(cadena1,cadena2);
		
		
	}
	
	static int vecesSubCadena(String cadena1, String cadena2){
		
		int contador = 0;
		 
		for (int i = 0; i<cadena1.length(); i++){
		int subcadena = cadena1.indexOf(cadena2,i);
		
		 if (subcadena == i){
			 
		 	contador ++;
		
		 }
		 
	
}
		System.out.println("tenemos  " + contador + " subcadenas iguales en el texto");
		return contador;
}
}