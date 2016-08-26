package principal;

import usuario.usuario;


public class principal {

    
	 
    
	  public static void main(String[] args) {
	    		
	    		
	    StringBuffer t = new StringBuffer ( "0344556K,pepe0,López Pérez0,C/Luna, 27 30132 Murcia,pepe0@gmail.com,1990.11.12,2014.12.3,miau0,usuario normal;");

	        

	    }
	
	
	  
	  
	  
	  public static void  importarUsuarioTexto(StringBuffer t){
  		
		  
		  System.out.println(t);
  		
	    	/*
	    	 * 
	    	 * Recibe el texto con los datos a importar que pueden corresponder a cualquier cantidad arbitraria de usuarios separados por punto y coma. 
			No se conoce a priori el tamaño del vector.
				El tamaño inicial del vector debe establecerse al número de usuarios a importar más una cantidad extra de 20.
			Carga objetos de la clase Usuario  en el vector datosUsuario .
			Ejemplo de uso:
						String t = "0344556K,pepe0,López Pérez0,C/Luna, 27 30132 Murcia,pepe0@gmail.com,1990.11.12,2014.12.3,miau0,usuario normal;";
								/		/Hay un solo objeto
i											mportarUsuariosTextoAAA(t);
	    	 * 
	    	 * 
	    	 */
	    		
	    		String etiqueta = ",";
	    			for (int i = 0; i<t.length(); i++){
	    				
	    			int	usuario = t.indexOf(etiqueta);
	    			
	    			
	    			String sub = t.substring(usuario);
	    			
	    			t.delete(0, usuario);
	    			
	    			
	    			usuario[] datosUsuarios = new usuario [20];
	    			for(int j = 0; j<datosUsuarios.length; j++){
	    			
	    				datosUsuarios[i] = new usuario();
	    				datosUsuarios[j].nif = sub;
	    				
	    			System.out.println(datosUsuarios[j].nif);
	    			}
	    			
	    			
	    			}
	    					
	    			
	    				
	
}
	  
	  
	  
	  
	
}
