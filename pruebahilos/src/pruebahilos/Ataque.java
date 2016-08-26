package pruebahilos;

public class Ataque extends Thread{
	
	
	
	
	
	
	public Ataque(String nombre) {
	    super(nombre);
	  }
	
	
	
	public void run(){
		
		Ataque hilo1=new Ataque("Subproceso 1");
		
		
		hilo1.start();
        
 
        
        
        
        
	}
	
	
	
	
	

}
