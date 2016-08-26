package arraylist;

public class listaDoble {


	//nodo de inicio //

	private nodo inicio;

	//nodo fin //

	private nodo fin;

	private nodo siguiente;
	private nodo anterior;
	
	private int elementos;
	//creamos el metodo //


	public listaDoble(){

		// los dos apuntan a null porque lo iniciamos vacio porque los dos inician en la misma posicion //
		anterior = null;
		siguiente  = null;
		inicio = null;
		fin = null;
		elementos = 0;
		// null o "0" en el caso de enteros --"INTEGER" //
		
		
	}


	// metodo que inserta al inicio de esta lista  le pasamos el dato que queremos almacenar//

	public void insertarInicio(String dato){


		//si se hacaba de crear la lista //
		if(inicio == null){

			// nos pide tres parametros ---abrimo la clase nodo----y nos pide .---1) el dato que queremos almacenar
			// 2) el nodo anterior 3) el nodo siguiente//


			inicio = new nodo(dato);		// ponemos los dos null porque esta vacio y los dos apuntan a null //

			
			
			// creamos el fin de la lista, comop creamos la lista son los dos iguales //

			elementos++;
			fin = inicio;

		}

		// en el caso de que ya tenga elementos esa lista //

		// le estamos diciendo que en el caso de que este lleno, nos coloque el dato 
		// al inicio de la lista y corra una posicion el que estaba en el inicio //
		else{

			nodo nuevo = new nodo(dato);
			inicio.setAnterior(nuevo);
			inicio = nuevo;
			
			
				
		}

	}

	// colocar un dato al final es similar al anterior //
	// es lo mismo solo que cambiando la pala por fin //

	public void insertarFinal(String dato){


		if(fin == null){


			fin = new nodo (dato);		

			elementos++;
			inicio = fin;

		}


		else{

			nodo nuevo = new nodo(dato);
			fin.setSiguiente(nuevo);
			fin = nuevo;
			elementos++;
		}
	}
	
	
	
	// metodo que elimina el elemento del inicio y saber que elemento se ha eliminado //
	// extraer el elemento del inicio de la lista //
	
	
	
	public Object extraerInicio (){
		
		//igualamos una variable al dato qe este en la primera posicion //
		
		
		Object dato = inicio.getDato();
		
		// hacemos un salto para que la lista empieze desde el siguiente al primero es decir desde el segundo //
		
		inicio = inicio.getSiguiente();
		
		if (inicio != null){
			
			inicio.setAnterior(null);
			elementos--;
		}
		else{
			
			fin = null;
			
		}
		return dato;
		
		
	}
	
	
	
	
	// extraer el ultimo elemento obrtebnerlo y eliminarlo //
	// es muy similar al anterior //
	
	
	
public Object extraerFinal (){
		
		//igualamos una variable al dato qe este en la primera posicion //
		
		
	Object dato = fin.getDato();
		
		// hacemos un salto para que la lista empieze desde el siguiente al primero es decir desde el segundo //
		
		fin = fin.getAnterior();
		
		if (fin != null){
			
			fin.setSiguiente(null);
			elementos--;
			
		}
		else{
			
			inicio = null;
			
		}
		return dato;
		
		
	}
	
	
	
	// metodo que recoore el arraylist y muestra los datos hacia delante //


public void MostrarAdelante(){
	
	
	// declaramos un nodo temporal //
	
	nodo temp = inicio;
	
	// mientras este nodo sea diferente de null----es decir mientras siga habiendo elementos//
	// me va a ir mostrando los datos hasta llegar al final que sera null //
	while (temp != null){
		
		
		System.out.println(temp.getDato());
		temp = temp.getSiguiente();
		
	}
	
	
}
	
	
	
	
	// metodo que hace lo mismo que el otro solo que desde el final de la lista //



	
public void MostrarAtras(){
	
	
	// declaramos un nodo temporal //
	
	nodo temp = fin;
	
	while (temp != null){
		
		
		System.out.println(temp.getDato());
		temp = temp.getAnterior();
		
	}
	
	
}
	


	// metodo para buscar un dato introducimos el dato y nos da la posicion //


public void buscar2(Object dato){
	if (inicio != null){
		nodo temp= inicio;

		int cont = 0;
		while (temp != null){
			if (temp.getDato() == dato ){
				cont++;
				temp = temp.getSiguiente();


				System.out.println("el dato esta en la posicion" +  " " +cont);

			}



		}                     



	}

}



	// obtiene el nodo correspondiente al indice //


	public nodo  obtenerNodo(int indice){
		
		
		if(indice >= elementos || indice <0){
			
			throw new IndexOutOfBoundsException("indice incorrecto" + indice);
			
			
		}
		
		nodo actual = inicio;
		for(int i = 0; i<indice; i++)
			
			actual = actual.getSiguiente();
			
			return actual;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
