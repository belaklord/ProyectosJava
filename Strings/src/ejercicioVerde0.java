import java.util.Scanner;


public class ejercicioVerde0 {

	public static void main(String[] args) {
		System.out.println("introduce la expresion");
		String expresion;
		Scanner s = new Scanner (System.in);
		
		expresion = s. next();
		
			ParentesisCorrectos (expresion);
		
	}

	
	public static void   ParentesisCorrectos(String expresion){
		int contador =0;
		 
		 //para obtener sucesivas posiciones del caracter que queramos //
		 
		for (int i =0; i<expresion.length(); i++){
			
			
			if(expresion.charAt(i) == '('){
				
				contador ++;
				
			}
			
			if(expresion.charAt(i) == ')'){
				
				contador --;
				
			}
		}
		
		if (contador == 0){
			System.out.println("correcto");
		
		}
		if (contador !=0){
			System.out.println("incorrecto");
			
		}
		
		
	}
}
