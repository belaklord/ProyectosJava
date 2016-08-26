
public class Verde7 {

									// falta el nº de asteriscos correctos //
	
	
	public static void main(String[] args) {
		
		
		String cadena1 =   "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		
		String  cadena2 = "JVM,Java,Oracle";
		
		reemplazaPalabras(cadena1, cadena2);
		
	}
	
	
	public static void  reemplazaPalabras (String  cadena1, String cadena2){
	
				
				
			String[] texto = cadena1.split(" ");
			String[] texto2 = cadena2.split(",");
	
				String asterisco = "*";
				
				for(int k = 0; k<texto.length; k++){
					
					for(int z=0; z<texto2.length; z++){
						
						
						if (texto[k].equals(texto2[z])){
							
						texto[k] = asterisco;
								
						
					
					
				}
				
						
								
					
					}
					
				
					System.out.println(texto[k]);
					
					}
					
								
					
					
					
				}
	
	
	
	

	
	

}

