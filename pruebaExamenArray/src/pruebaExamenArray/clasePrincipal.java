package pruebaExamenArray;

public class clasePrincipal {

	final static int MAX_USUARIO = 45;
	public static usuario[] datosusuario = new usuario[MAX_USUARIO];
	
	
	public static void main (String []args){


		int  vector [] = {0,1,1,1,0};


	}

	static usuario usuarios (int vector[]){
		
				usuario array[]  = new usuario[8]; 
				
				int contador = 0;

				if (vector.length < MAX_USUARIO && contador <=4){
					
				 array[8] = new usuario();
				 
				 contador ++;
					
				}
		
	System.out.println(array);

	}
}
