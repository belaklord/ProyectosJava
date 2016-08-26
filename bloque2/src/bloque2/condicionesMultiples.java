package bloque2;

											//CONDICIONES MULTIPLES//
import java.util.Scanner;
public class condicionesMultiples {

	public static void main (String[]args){
		
		int x;
		
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("introduce un numero");
		
		x = S.nextInt();
		
			if (x > 0 && x < 10){			// tenemos "&&" que act�a como "y" y tambien "||" que act�a como "o"
				System.out.println("el numero esta entre 0 y 10");
			}
			else {
				System.out.println("el numero no esta entre 0 y 10");
			}
	}
		
}

