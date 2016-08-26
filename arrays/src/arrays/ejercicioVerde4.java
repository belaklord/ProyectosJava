

// NO ESTA COMPLETA //

package arrays;
public class ejercicioVerde4 {
	public static void main (String []ags){

	
		int vector[] = {1,2,3,9,5,6,7};

	System.out.println(maximoIntConsecutivos(vector));

	}

   static int maximoIntConsecutivos(int array[]){
	
		int e=1;
		
	for (int i =0; i<array.length; i++){
		
		
		if (array[i] == array[i+1]-1){
			
			e++;
			
		}
		if (array [i] == array.length){
			
			
			
		}
		
		
	 
	}
	return e;
 
}
	
}
