package arraylist;

public class nodo {

	// apunta al atributo siguiente //
	private nodo siguiente;

	// apunta al atributo anterior //

	private nodo anterior;

	// la lista sera de string pero puede ser de otro tipo de datos //

	Object dato;



	// creamos su metodo //


	public nodo(Object dat){


		dato =dat;
		anterior = null;
		siguiente = null;


		// para agregar los metodos get y set pinchamos boton derecho en la clase ----source----generate getter and setters---select all---aceptar//



	}




	public nodo getSiguiente() {
		return siguiente;
	}




	public void setSiguiente(nodo siguiente) {
		this.siguiente = siguiente;
	}




	public nodo getAnterior() {
		return anterior;
	}




	public void setAnterior(nodo anterior) {
		this.anterior = anterior;
	}




	public Object getDato() {
		return dato;
	}




	public void setDato(int dato) {
		this.dato = dato;
	}

}
