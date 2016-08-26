package metodos;
import java.util.Scanner;
public class tablasMultiplicar {
	
	public static void main (String []args){
	
	int entero, resultado;
	
	Scanner S = new Scanner (System.in);
	
	System.out.println("introduce el numero de la tabla");
	
	entero = S. nextInt();
	
	
	resultado = tablas(entero);
	System.out.println(resultado);
	
	
	
	
}

public static int tablas(int numero){
	
	int i = 1;
	int e = 1;
	do {
		if (numero >0 && numero <= 15)
		
			
		System.out.println(numero + " x " + e + " = " + numero*e);
		
		e++;
		i++;
		
		
	}while (numero > 0 && numero <= 16 && i < 16 && e<16);
	
	
	
	return numero;
	
	
}







}
