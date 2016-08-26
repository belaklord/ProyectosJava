package interaccion;

import datos.Datos;

public class defensaGuerrero {
	
	
public static String ataque(){
		
		
		if (Datos.datosGerrero[0].vida <=0){
			
			
			Datos.datosGerrero[0].vida = 0;
			
			
		}
		
		else{
		
				int	contador = Datos.datosMago[0].ataque;
	
		
			
			Datos.datosGerrero[0].vida = Datos.datosGerrero[0].vida - contador;
		
			
		
			
		}
			
			
			return Datos.datosGerrero[0].toString();
		
		
		
		
	}
	
	

}
