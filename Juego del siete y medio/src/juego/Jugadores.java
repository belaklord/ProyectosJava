package juego;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Jugadores 
{


private String Alias;
private String Nombre;
private String Apellidos;
static int contador =0;

static ArrayList<String> jugador = new ArrayList<String>();

static ArrayList<String> jugador2 = new ArrayList<String>();


static ArrayList<String> jugador3 = new ArrayList<String>();






	public static void Seleccion_1jugador() {
		
	
    
                /* JUGADOR 1 */
    
    System.out.println ("Introduzca los datos del jugador 1");
    
    
    Jugadores jugador1 = new Jugadores();
    
    
    Scanner teclado2 = new Scanner(System.in);
    System.out.println("Alias:");
    String Alias = teclado2.nextLine();
    
     jugador1.setAlias(Alias);
    
    System.out.println("Nombre:");
    String Nombre = teclado2.nextLine();
    
    jugador1.setNombre(Nombre);
    
    System.out.println("Apellidos:");
    String Apellidos = teclado2.nextLine();
    
    jugador1.setApellidos(Apellidos);
    
    jugador.add(jugador1.Alias);
    jugador.add(jugador1.Nombre);
    jugador.add(jugador1.Apellidos);
    
    
    /* JUGADOR MAQUINA */
    
    System.out.println ("Datos jugador 2 (Autogenerado)");
    
    Jugadores maquina = new Jugadores ();
    
    System.out.println("Alias:");
    maquina.setAlias_maquina();
    System.out.println(maquina.getAlias_maquina());
    
    System.out.println("Nombre:");
    maquina.setNombre_maquina();
    System.out.println(maquina.getNombre_maquina());
    
    System.out.println("Apellidos:");
    maquina.setApellidos_maquina();
    System.out.println(maquina.getApellidos_maquina());
    
    
    
}
	
	
	
	
	public static void mostrar_jugador(){
		
		
			Iterator<String> datos = jugador.iterator();
        System.out.println("inicio jugada jugador1");
        while(datos.hasNext()){
        	Object elemento = datos.next();
        	System.out.print(elemento + " ");
        }
        System.out.println("\n");						// ponemos "\n" despues del bucle para formatear correctamente los datos //
        Baraja.Inicio_jugada();
		}
		
	
	
//				DOS JUGADORES MOSTRAR //

       public static void mostrar_jugador2(){
    	   

    	   Iterator<String> datos2 = jugador3.iterator();
    	   System.out.println("inicio jugada jugador2");
    	   while(datos2.hasNext()){
    		   Object elemento = datos2.next();
    		   System.out.print(elemento + " ");
    	   }
    	   System.out.println("\n");
    	   			contador = 1;										// ponemos "\n" despues del bucle para formatear correctamente los datos //
    	   Baraja.Inicio_jugada();
    	   
    	   

    	   
       }
	
	
	
	
	
	public static void mostrar_jugadores(){
		
			
		Iterator<String> datos = jugador2.iterator();

		System.out.println("inicio jugada jugador1");
		while(datos.hasNext()){
			Object elemento = datos.next();
			System.out.print(elemento + " ");
		}
		System.out.println("\n");						
		Baraja.Inicio_jugada();
        
        
			
			
		}
		
	
		
		
	


    public static void Seleccion_2jugadores() {
    	

    System.out.println ("Introduzca los datos del jugador 1");
    
    Jugadores jugador1 = new Jugadores (); 
    
    Scanner teclado1 = new Scanner(System.in);
    System.out.println("Alias:");
    String Alias = teclado1.nextLine();
    
    jugador1.setAlias(Alias);
    
    System.out.println("Nombre:");
    String Nombre = teclado1.nextLine();
    
    jugador1.setNombre(Nombre);
    
    System.out.println("Apellidos:");
    String Apellidos = teclado1.nextLine();
    
    jugador1.setApellidos(Apellidos);
    
    

    jugador2.add(jugador1.Alias);
    jugador2.add(jugador1.Nombre);
    jugador2.add(jugador1.Apellidos);

    
    
    
    		/* JUGADOR 2*/
  
    System.out.println ("Introduzca los datos del jugador 2");
    
    
    Jugadores jugador2 = new Jugadores (); 
    
    Scanner teclado3 = new Scanner(System.in);
    System.out.println("Alias:");
    String Alias2 = teclado3.nextLine();
    
    jugador2.setAlias(Alias2);
    
    System.out.println("Nombre:");
    String Nombre2 = teclado3.nextLine();
    
    jugador2.setNombre(Nombre2);
    
    System.out.println("Apellidos:");
    String Apellidos2 = teclado3.nextLine();
    
    jugador2.setApellidos(Apellidos2);
    
    
    

    jugador3.add(jugador2.Alias);
    jugador3.add(jugador2.Nombre);
    jugador3.add(jugador2.Apellidos);


    }



      /* JUGADOR 1 y JUGADOR 2 */

/**
 * @return el alias
 */
public String getAlias() {
    return Alias;
}



/**
 * @param alias el alias a establecer
 */
public void setAlias(String alias) {
    Alias = alias;
}


/**
 * @return el nombre
 */
public String getNombre() {
    return Nombre;
}

/**
 * @param nombre el nombre a establecer
 */
public void setNombre(String nombre) {
    Nombre = nombre;
}


/**
 * @return el apellidos
 */
public String getApellidos() {
    return Apellidos;
}



/**
 * @param apellidos el apellidos a establecer
 */
public void setApellidos(String apellidos) {
    Apellidos = apellidos;
}
  
    
		/* JUGADOR MAQUINA */
  
public String getAlias_maquina() {
    return Alias;
}
public void setAlias_maquina() {
    Alias = "autogen";
}    

public String getNombre_maquina() {
    return "player2";
}

/**
 * @param nombre el nombre a establecer
 */
public void setNombre_maquina() {
    Nombre = "player2";
}

public String getApellidos_maquina() {
    return "auto generado";
}

/**
 * @param nombre el nombre a establecer
 */
public void setApellidos_maquina() {
    Nombre = "auto generado";
}




public String toString(){
	return (this.Alias);
   }
}






    
    
    
    
    
    
    
    

