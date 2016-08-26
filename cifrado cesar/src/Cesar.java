


import java.util.Scanner;

public class Cesar {
	
	
	
	
	
	static String original = " ";
	static char[] cifrado;
	static int n;
	static Scanner lee = new Scanner(System.in);
	
	public static void main(String args[]){
		System.out.print("Introduzca la secuencia de caracteres a cifrar: ");
		original = lee.nextLine();
		System.out.print("Introduzca n: ");
		n = lee.nextInt();
		cesar();
		mostrar();
	}
	
	static void cesar(){
		String[] temp = original.split("");		//Convertimos la cadena original en un array para 
								//poder acceder a cada car�cter de forma individual
		cifrado = new char[original.length()];		//Asignamos el tama�o del vector que almacenar� 
								
		//el car�cter ASCII correspondiente al c�digo cifrado
		for(int i = 0;i < original.length() ;i++){			
			int x = (int)(temp[i].charAt(0));		//Guardamos en x el valor ASCII del car�cter que se encuentre en
									//temp[i]. Para extraer el car�cter empleamos el .charAt(0) y para 
									//convertirlo a entero, hacemos el casting a int.
			int y = x + n % 27;				//Codificamos el valor ASCII aplicando la f�rmula (y = x + n % 27)
													
													
			if(y > 127){
				int v = y / 127;//Calcula las veces que ha superado 127, ej: 300 se pasa 2 veces
				y = y - 128 * v;//Cerramos el bucle. Si el ASCII fuera 28 y n 1, y = 0 evitando errores
				cifrado[i] = (char)(y);
			}
			else
				cifrado[i] = (char)(y);
		}
	}
	
	static void mostrar(){
		System.out.print("C�digo sin cifrar: "+original);
		System.out.print("\nC�digo cifrado: ");
		for(int i = 0; i < cifrado.length; i++)
			System.out.print(cifrado[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
