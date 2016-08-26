package arrays;

public class ArrayConHuecosALGL {
	public static void main(String[] args) {


		// Configuración de un patrón de huecos, como ejemplo, para las pruebas

		int[] patronHuecos = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0};


		 ampliarDatosUsuariosALGL();

	}



	/**
	 * Clase para representar el concepto de usuario de un sistema.
	 * @author ajp
	 */
	public static class Usuario
	{

		//Atributos

		public String nif;
		public String nombre;
		public String apellidos;
		public String correoE;
		public String domicilio;
		public String fechaNacimiento;
		public String fechaAlta;
		public String claveAcceso;
		public String rol;

	 //class
	}


	/**
	 * Clase que contiene un array de objetos de la clase Usuario
	 * y métodos para las pruebas y manipulación del array.
	 * @author ajp
	 *
	 */
	public static class ArrayConHuecosAAA
	{

		static int maxUsuarios = 45;

		// Vector de objetos
		public static Usuario[] datosUsuarios = new Usuario[maxUsuarios];


		/**
		 * Método principal que carga datos de prueba y coordina la
		 * llamada a los distintos métodos probados.
		 * @param args
		 */

	



		public void cargarDatosUsuariosPatron(int[] patron) {

			//Recorre el vector de datos y el patrón
			for (int i = 0, j = 0; i < maxUsuarios; i++, j++) {

				//Vuelve al principio del patrón si se acaba
				if (j >= patron.length) {
					j = 0;
				}

				// Genera objeto si lo indica el patrón con un 1
				if (patron[j] == 1) {
					datosUsuarios[i] = new Usuario();
					datosUsuarios[i].nif = "7324563" + i + "-K";
					datosUsuarios[i].nombre = "Juan" + i;
					datosUsuarios[i].apellidos = "López Ruiz";
					datosUsuarios[i].domicilio = "C/ Alta, 23. 30120 Murcia";
					datosUsuarios[i].correoE = "jlr" + i + "@gmail.com";
					datosUsuarios[i].fechaNacimiento = "13.12.8" + i;
					datosUsuarios[i].fechaAlta = "13.12.89";
					datosUsuarios[i].claveAcceso = "rata" + i;
					datosUsuarios[i].rol = "Usuario normal" + i;
				}
			}
		}
	}
	
	/**
	 * Método  que dobla el tamaño del vector de almacenamiento de objetos
	 * y oredena hacia la derecha los ususarios, dejando en las demas
	 * posiciones los huecos vacíos
	 */
	public static void ampliarDatosUsuariosALGL(){
		// vector patron//
		int[] patronHuecos = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0};
		//decalarion de variables y del nuevo vector de tamaño doble //
		int maxUsuarios = 90 ;
		Usuario[] datosUsuarios = new Usuario[maxUsuarios];
		int orden =0;
		
		//recorre el vector patronHuecos //
			for (int j = 0; j<patronHuecos.length; j++){
		// recorre el vector datosUsuarios//
			for (int i = 0; i<datosUsuarios.length; i++){
				
						
			// si se cumple la condicion se genera un usuario //
				if (patronHuecos[j] == 1){

					if (patronHuecos[j] == patronHuecos.length){
						
						j =0;
					}


					datosUsuarios[orden] = new Usuario();
					datosUsuarios[orden].nif = "7324563" + i + "-K";
					datosUsuarios[orden].nombre = "Juan" + i;
					datosUsuarios[orden].apellidos = "López Ruiz";
					datosUsuarios[orden].domicilio = "C/ Alta, 23. 30120 Murcia";
					datosUsuarios[orden].correoE = "jlr" + i + "@gmail.com";
					datosUsuarios[orden].fechaNacimiento = "13.12.8" + i;
					datosUsuarios[orden].fechaAlta = "13.12.89";
					datosUsuarios[orden].claveAcceso = "rata" + i;
					datosUsuarios[orden].rol = "Usuario normal" + i;
					datosUsuarios[orden] = datosUsuarios[orden];

						orden++;
					
						
				}
				// si se cumple la condicion el espacio queda nulo y muestra "vacio" //
				
				if (patronHuecos[j] == 0){

				datosUsuarios[orden] = null;

				
				
				

			}
				
				
				
				
			}

			
		}
	}


}




			

		


	


	/**
	 * Crea nuevos usuarios y asigna valores diferentes en los
	 * elementos del vector dejando elementos vacíos según un patrón
	 * de huecos establecido por un array de 1 y 0 recibido como
	 * argumento.
	 * @param patron - de huecos
	 */


// class
 

 


