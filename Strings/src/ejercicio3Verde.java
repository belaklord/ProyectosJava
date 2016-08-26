
public class ejercicio3Verde {

	public static void main(String[] args) {
		
		
	
		String texto1 = "Estamos viviendo en un submarino amarillo. No tenemos nada qué hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días";

		String texto2 = ("en");
				
		vecesSubCadena2(texto1.toUpperCase(),texto2.toUpperCase());
		
		
	}

	
	public static int vecesSubCadena2(String texto1,String texto2){
		
		
		texto2.toUpperCase();
		
		int contador = 0;
		 
		for (int i = 0; i<texto1.length(); i++){
		int subcadena = texto1.indexOf(texto2,i);
		
		 if (subcadena == i){
			 
		 	contador ++;
		
		 }
		 
	
}
		

		
		System.out.println("tenemos  " + contador + " subcadenas iguales en el texto");
		return contador;
	}


	
	
	
}
