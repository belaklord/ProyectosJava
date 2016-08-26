package datos;

import personajes.guerrero;
import personajes.mago;

public class Datos {
	
	
	public static guerrero[] datosGerrero = new guerrero[1];
	public static mago[] datosMago = new mago[1];
	
		public static void cargarDatosGuerreros(){
			
			
			
			for(int i = 0; i<Datos.datosGerrero.length;i++){
				
				
				Datos.datosGerrero[i] = new guerrero();
				Datos.datosGerrero[i].nombre = "belaklord" + " ";
				Datos.datosGerrero[i].ataque = 20 ;
				Datos.datosGerrero[i].defensa = 50 ;
				Datos.datosGerrero[i].mana = 10 ;
				Datos.datosGerrero[i].vida = 100 ;
				
				/*
				System.out.println(Datos.datosGerrero[i].toString());
				
				*/
				
			}
			
			
			
		}
		
		public static void cargarDatosMago(){
			
			int contador = 0;
			
			for(int j = 0; j<Datos.datosMago.length; j++){
				
				Datos.datosMago[j] = new mago();
				Datos.datosMago[j].nombre = "mentzal" + " ";
				Datos.datosMago[j].ataque =10;
				Datos.datosMago[j].defensa = 30;
				Datos.datosMago[j].mana = 50;
				Datos.datosMago[j].vida = 75;
				contador ++;
				/*
				System.out.println(Datos.datosMago[j].toString());
			*/
			}
			
			
			
		}

}


