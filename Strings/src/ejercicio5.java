
public class ejercicio5 {

	public static void main(String[] args) {



		String s = ("Introducción");
		char dos = '*';
		int tres = 20;

		padRight(s,dos,tres);

	}


	public static String padRight(String s,char dos, int tres){




		for (int i = s.length(); i<tres; i++){


			if (i <tres){

				s = s+dos;

			}


		}



		System.out.println(s);

		return s;

	}

	
	
	
	
}
