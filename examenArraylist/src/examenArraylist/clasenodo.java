package examenArraylist;

public class clasenodo {

    //Atributos

    Object dato;
    clasenodo anterior;
    clasenodo siguiente;


    //Constructor

    /**
     * Constructor que inicializa atributos por defecto
     * @param elem - el elemento de información útil a almacenar
     * @return 
     */

    public void Nodo(Object elem) {
        dato = elem;
        anterior = null;
        siguiente = null;
    }


	public Object getDato() {
		return dato;
	}


	public void setDato(Object dato) {
		this.dato = dato;
	}


	public clasenodo getAnterior() {
		return anterior;
	}


	public void setAnterior(clasenodo anterior) {
		this.anterior = anterior;
	}


	public clasenodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(clasenodo siguiente) {
		this.siguiente = siguiente;
	}
};