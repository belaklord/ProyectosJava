package arraylist;


import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
	
// declaramos el ojeto lista doble //
		
		
		listaDoble ld = new listaDoble();
		
		
		Scanner S = new Scanner (System.in);
		
		
		System.out.println("introduce un nombre");
		
		
		ld.insertarInicio(S.next());
		
		ld.MostrarAdelante();
	/*	
		// insertamos los datos en la lista doble //
		
		ld.insertarInicio(133332);
		ld.insertarFinal(123);
		ld.insertarFinal(1234);
		
		
		ld.MostrarAdelante();
				/*
		ld.obtenerNodo(1);
		ld.MostrarAdelante();
		
		
		ld.MostrarAdelante();
		
		
		
		System.out.println("==============================");
		System.out.println("eliminado el dato primero de la lista");
		ld.extraerInicio(); // elimina el primer dato //
		ld.MostrarAdelante(); // muestra todos menos el que se ha eliminado //
		
		ld.buscar2(123);// muestra la posicion del dato 12 //
		*/
		
		
		
		
		
		
		
	}

}
