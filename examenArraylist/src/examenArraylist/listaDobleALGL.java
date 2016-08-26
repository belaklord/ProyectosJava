package examenArraylist;

public class listaDobleALGL {


	/**
	 * Representa la implementación parcial de una lista enlazada doble en la que
	 * se tiene acceso directo a los elementos primero y último.
	 */
	
		/**
		 * La clase Nodo está anidada y representa la estructura de elemento de
		 * la lista enlazada doble.
		 */
		private class Nodo {

			//Atributos

			Object dato;
			Nodo anterior;
			Nodo siguiente;


			//Constructor

			/**
			 * Constructor que inicializa atributos por defecto
			 * @param elem - el elemento de información útil a almacenar
			 */

			public Nodo(Object elem) {
				dato = elem;
				anterior = null;
				siguiente = null;
			}

		};
			

		private Nodo primero;
		private Nodo ultimo;
		private int numElementos;


		//Métodos ListaDobleAAA

		/**
		 * Constructor que inicializa los atributos al valor por defecto
		 */
		public listaDobleALGL() {
			primero = null;
			ultimo = null;

			numElementos = 0;
		}

		/* eliminacion y obtencion del ultimo dato */
		public Object removeUltimoALGL(){
			
			

				//igualacion de una variable al dato//
				
				
			Object dato = ultimo.dato;
				
				// empezamos desde el anterior al ultimo //
				
				ultimo = ultimo.anterior;
				
				// eliminiacion del ultimo elemento //
				if (ultimo != null){
					
					ultimo.siguiente = (null);
					numElementos--;
					
				}
				
				// array vacio, primero null //
				else{
					
					primero = null;
					
		
				}
				// devueleve el dato eliminado //
				return dato;
		}
		
		
		public void insertarInicio(int dato){


			//si se hacaba de crear la lista //
			if(primero == null){

				// nos pide tres parametros ---abrimo la clase nodo----y nos pide .---1) el dato que queremos almacenar
				// 2) el nodo anterior 3) el nodo siguiente//


				primero = new Nodo(dato);		// ponemos los dos null porque esta vacio y los dos apuntan a null //

				
				
				// creamos el fin de la lista, comop creamos la lista son los dos iguales //

				numElementos++;
				ultimo = primero;
			}
			else{

				Nodo nuevo = new Nodo(dato);
				primero.anterior = nuevo;
				primero = nuevo;
				
				
					
			}
			}
 
		public void MostrarAdelante(){
			
			
			// declaramos un nodo temporal //
			
			Nodo temp = primero;
			
			// mientras este nodo sea diferente de null----es decir mientras siga habiendo elementos//
			// me va a ir mostrando los datos hasta llegar al final que sera null //
			while (temp != null){
				
				
				System.out.println(temp.dato);
				temp = temp.siguiente;
				
			}
			
			
		}
		
		public static void main (String [] args){
			
			listaDobleALGL ld = new listaDobleALGL();
			
			ld.insertarInicio(23);
			ld.insertarInicio(234);
			ld.insertarInicio(222323);
			
			ld.MostrarAdelante();
			/*
			ld.removeUltimoALGL();
			ld.MostrarAdelante();
			*/
			
		}
		
				
	

}
