package pruebaExamenArray;



public class arayy {
	final static int MAX_USUARIO = 45;
	public static
 usuario[] datosusuario = new usuario[MAX_USUARIO];
	
	public static void main (String []args){
		
		usuario usr1 = null;
		usuario usr2 = new usuario ();
		usuario usr3 = new usuario ();
		
		usr2.nif = "48648248-m";
        usr2.nombre = "antonio";
        usr2.apellidos = "gallego lopez";
        usr2.domicilio = "calle capuchinos, numero 23, 3f";
        usr2.correoE = "belaklord@gmail.com";
        usr2.fechaNacimiento = "23/11/87";
        usr2.fechaAlta = "09/12/14";
        usr2.claveAcceso = "123456";
        usr2.rol = "root";
		
		
		int  vector [] = {0,1,1,1,0};


		usuario array [] = new usuario[8]; 

		int contador = 0;

		if (vector.length < MAX_USUARIO && contador <=4){

			for (int i = 0; i<array.length; i++){

				 new usuario();

				contador ++;



			}


		}
System.out.println(usr2);

				

	}

}
