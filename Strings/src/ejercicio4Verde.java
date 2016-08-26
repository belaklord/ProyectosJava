
public class ejercicio4Verde {



	//TERMINAR//

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer( "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos<mayus>nada</mayus> qué hacer.");


		mayusSubCadena(s);

	}

	public static StringBuffer mayusSubCadena(StringBuffer s){

		String etiqueta1 =  "<mayus>";
		String etiqueta2 = "</mayus>";

	
		do{
		int inicio = s.indexOf(etiqueta1)+7;
		
		
		int fin = s.indexOf(etiqueta2);
			
		String sub = s.substring(inicio, fin);
		String mayuscula = sub.toUpperCase();
		
		s.delete(inicio, fin);
		s.insert(inicio, mayuscula);
		s.delete(s.indexOf(etiqueta2),s.indexOf(etiqueta2)+8 );
		
		s.delete(s.indexOf(etiqueta1),s.indexOf(etiqueta1)+7 );

		}while (s.indexOf(etiqueta1)!=-1);
		
		
			System.out.println(s);
		

		return s;
	}


}
