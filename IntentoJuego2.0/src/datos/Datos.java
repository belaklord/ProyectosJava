package datos;

import personajes.Guerrero;
import personajes.Mago;



public class Datos {

	private static final int MAX_USUARIOS = 1;
	
	public static Guerrero  [] datosGuerrero = new Guerrero  [MAX_USUARIOS];
	public static Mago [] datosMago = new Mago[MAX_USUARIOS];
	
	
	public static void cargarDatosPersonajes(){
		
		
		for (int i = 0; i<datosGuerrero.length; i++){
			
			Datos.datosGuerrero[i] = new Guerrero();
			Datos.datosGuerrero[i].getAtaque();
			Datos.datosGuerrero[i].getDefensa();
			Datos.datosGuerrero[i].getMana();
			Datos.datosGuerrero[i].getNombre();
			Datos.datosGuerrero[i].getVida();
			
			
			
		
			System.out.println("Nombre:"+datosGuerrero[i].getNombre());
			System.out.println("Ataque:" +datosGuerrero[i].getAtaque());
			System.out.println("Defensa:" +datosGuerrero[i].getDefensa());
			System.out.println("Mana:" +datosGuerrero[i].getMana());
			System.out.println("Vida:" +datosGuerrero[i].getVida());
			System.out.println("    ");
			System.out.println("    ");
		}
		
		
		for (int j = 0; j<datosMago.length; j++){
				
				Datos.datosMago[j] = new Mago();
				Datos.datosMago[j].getAtaque();
				Datos.datosMago[j].getDefensa();
				Datos.datosMago[j].getMana();
				Datos.datosMago[j].getNombre();
				Datos.datosMago[j].getVida();
				
				
				
			
				System.out.println("Nombre:"+datosMago[j].getNombre());
				System.out.println("Ataque:" +datosMago[j].getAtaque());
				System.out.println("Defensa:" +datosMago[j].getDefensa());
				System.out.println("Mana:" +datosMago[j].getMana());
				System.out.println("Vida:" +datosMago[j].getVida());
				System.out.println("    ");
				System.out.println("    ");
			}
		
		
		
		
		
		
	}
	
	
	
}
