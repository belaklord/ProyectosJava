package provisional;

public  class nodoDatos {
	
	
	
	public static nodoDatos siguiente;
	public static nodoDatos anterior;
	static  Object  dato;
	
	
	
	
	public nodoDatos(Object dat){
		
		dato = dat;
		anterior = null;
		siguiente = null;
		
		
		
		
	}

	public  Object getValor() 
	{
		return dato;
	}


	public  nodoDatos getSiguiente() {
		return siguiente;
	}




	public  void setSiguiente(nodoDatos siguiente) {
		this.siguiente = siguiente;
	}




	public  nodoDatos getAnterior() {
		return anterior;
	}




	public  void setAnterior(nodoDatos anterior) {
		this.anterior = anterior;
	}




	public  Object getDato() {
		return dato;
	}




	public  void setDato(Object dato) {
		this.dato = dato;
	}

	
	
	
}
