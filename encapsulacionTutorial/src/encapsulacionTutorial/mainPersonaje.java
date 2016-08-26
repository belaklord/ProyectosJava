package encapsulacionTutorial;

public class mainPersonaje {
	
	
	public static void main (String []args){
		
		// vamos a crear un nuevo personaje//
		
		personaje cualquiera = new personaje();
		
		
		// metodo getter para consultar la vida, es decir, aceder a ella//
		
		System.out.println(cualquiera.getVida());
		System.out.println(cualquiera.getNombre());
		
		/*
		 * cambiamos el nombre del jugador y lo consultamos despues
		 */
			cualquiera.cambiarNombre("antonio");
			System.out.println(cualquiera.getNombre());
		
		
		/* 
		 * para evitar la modificacion de los tributos, utilizamos la
		 * encapsulacion, de modo que solo podramos con los metodos
		 * getter y setter acceder a ellos pero no podificarlos
		 * para esto pnemos en los atributos "protected"
		 */
		
		
		
		
	}
	

}
