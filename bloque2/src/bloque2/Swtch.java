package bloque2;

										// EL TIPO SWITCH//


public class Swtch {

	public static void main (String []args){
		
		char letra;									//podemos hacerlo con "char" (caracter) o con "int" (enteros)//
		
		letra = '%';
		
		switch (letra){							// comparacion de multiples casos//
			
			case 'a':
				System.out.println("el valor es a");
				break;									//"break" para que solo se ejecute esa linea en el caso
														// de que sea verdadera//
			case '%':
				System.out.println("el valor es %");
				break;
				
				default:								// en el caso de que no sea ninguna de las anteriores
														// se ejecuta el default//
					System.out.println("el valor no esta");
		}
	}
}
