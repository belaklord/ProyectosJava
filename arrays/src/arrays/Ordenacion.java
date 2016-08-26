package arrays;
																						// algoritmo de ordenacion, metodo burnuja ///
public class Ordenacion {
		public static void main (String []args){
			
			int vector[] = {0,3,5,6,7,1,2,3,8,9,7,8,9,6,5,4,3,2};
			int contador;
			
		 // recorremos el vector //
			
			for (int i = 0; i < vector.length; i++){						
				
		// recorremos el mismo vector una posicion delantada para la comparacion //
				
				
				for (int j = i+1; j < vector.length; j++){
					
		// cambiamos de orden los numeros segun sean mayores o menores para ordenarlos //
					
					if (vector [j] < vector[i]){
						
						contador = vector [j];
						vector [j] =   vector [i];
						vector [i] = contador;
						
					}
					
				}
				
		// mostramos por pantalla el vector ordenado //
				
				
				System.out.print(vector [i]);
			}
			
			
		}

}
