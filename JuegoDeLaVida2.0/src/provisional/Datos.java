
													// prototipo 1.1 // String correo electronico // etc //

																		// falta las condiciones de null cuando no se encuentre //

// esta clase organiza y almacena los datos de la aplicacion //

//por lo tanto quitamos el almacen de datos del main y lo situamos en la clase Datos asumiendo y 
// corrigiendo los errores que nos pueda dar el main despues de mover los alamcenes de datos // 

package provisional;

import provisional.SesionUsuario;
import provisional.Usuario;
import provisional.nodoDatos;
import provisional.datosNodos;

public class Datos {
	/*

	public static final int MAX_USUARIOS = 10;
	public static final int MAX_SESIONES = 10;
	public static Usuario [] datosUsuarios = new Usuario [MAX_USUARIOS];
	public static SesionUsuario [] sesionesUsuario = new SesionUsuario [MAX_SESIONES];

	*/
	
	
	
	
	public static void cargarUsuarioNodo(){
		
		
		
		
		for(int i = 0; i<10; i++){
			
			Usuario.nombre = "antonio" +i;
			Usuario.apellidos = "alfrdos"+i;
			Usuario.nif = "84757578" +i;
			Usuario.correoE = "pepelu@gmail.com" +i;
			Usuario.domicilio ="c/ caca n23 3r" +i;
			Usuario.fechaNacimiento ="23/06/85" +i;
			Usuario.fechaAlta = "22/09/2000" +i;
			Usuario.claveAcceso ="antonio" +i;
			Usuario.rol = "Admin" +i;
			
			System.out.println(Usuario.nombre);
			System.out.println(Usuario.apellidos);
			System.out.println(Usuario.nif);
			System.out.println(Usuario.correoE);
			System.out.println(Usuario.domicilio);
			System.out.println(Usuario.fechaNacimiento);
			System.out.println(Usuario.fechaAlta);
			System.out.println(Usuario.claveAcceso);
			System.out.println(Usuario.rol);
			}
		
		

		
		
		
		
	}
	
	

	

	/*
	public static void cargarDatosUsuario(){

		int posicion =0;
		int posicion2 = 0;
		for (int i = 0; i<Datos.datosUsuarios.length; i++){

			Datos.datosUsuarios[i] = new Usuario();
			Datos.datosUsuarios[i].nif = "48567453-m" + posicion;
			Datos.datosUsuarios[i].nombre = "Antonio" + posicion;
			Datos.datosUsuarios[i].apellidos = "gallego" + posicion;
			Datos.datosUsuarios[i].correoE = "antonio@gmail.com" + posicion;
			Datos.datosUsuarios[i].domicilio ="c/ capuchinos n23 3f" + posicion;
			Datos.datosUsuarios[i].fechaNacimiento = "23/11/198" + posicion;
			Datos.datosUsuarios[i].fechaAlta = "22/11/200" + posicion;
			Datos.datosUsuarios[i].claveAcceso = "tierrasanta" + posicion;
			Datos.datosUsuarios[i].rol= "root" + posicion;



			// aqui tenemos 10 usuarios automaticos con un bucle //

			// System.out.println(datosUsuarios[i].nif);	
			
		System.out.println(datosUsuarios[i].nif);
		System.out.println(datosUsuarios[i].nombre);
		System.out.println(datosUsuarios[i].apellidos);
		System.out.println(datosUsuarios[i].correoE);
		System.out.println(datosUsuarios[i].domicilio);
		System.out.println(datosUsuarios[i].fechaNacimiento);
		System.out.println(datosUsuarios[i].fechaAlta);
		System.out.println(datosUsuarios[i].claveAcceso);
		System.out.println(datosUsuarios[i].rol);
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("    ");
			  
			posicion ++;


		}	




		for (int i = 0; i<sesionesUsuario.length-1; i++){

			Datos.sesionesUsuario[i] = new SesionUsuario();
			Datos.sesionesUsuario[i].usr = datosUsuarios[i];
			Datos.sesionesUsuario[i].fecha ="22/01/201" + posicion2;

			posicion2 ++;
		}



	}

	public static void datosUsuariosTexto(){


		StringBuffer  cadena = new StringBuffer();

		for (int i=0; i<datosUsuarios.length; i++){

			cadena = cadena.append(datosUsuarios[i].nombre +"," + datosUsuarios[i].nif +"," + datosUsuarios[i].apellidos +"," + datosUsuarios[i].correoE +"," + datosUsuarios[i].domicilio +","
					+ datosUsuarios[i].fechaNacimiento +"," + datosUsuarios[i].fechaAlta +"," + datosUsuarios[i].claveAcceso +"," + datosUsuarios[i].rol + ";");


		}


	}



	public static void DatosSesionesTexto(){

		StringBuffer  cadena = new StringBuffer();

		for (int i=0; i<sesionesUsuario.length; i++){

			cadena = cadena.append(sesionesUsuario[i].usr.nombre + "," + sesionesUsuario[i].fecha + ";");



		}




	}

	public static String buscaUsuario (String contraseña){


		StringBuffer  cadena = new StringBuffer();

		for (int i = 0; i<datosUsuarios.length; i++){

			cadena = cadena.append(datosUsuarios[i].nombre +"," + datosUsuarios[i].nif +"," + datosUsuarios[i].apellidos +"," + datosUsuarios[i].correoE +"," + datosUsuarios[i].domicilio +","
					+ datosUsuarios[i].fechaNacimiento +"," + datosUsuarios[i].fechaAlta +"," + datosUsuarios[i].claveAcceso +"," + datosUsuarios[i].rol + ";");


			if (datosUsuarios[i].claveAcceso.equals(contraseña) ){


						contraseña = datosUsuarios[i].claveAcceso;
				System.out.println("el usuario" + " " + datosUsuarios[i].nombre+ " "+ "ha iniciado sesion");
				

			}
			
						// deberia haber aqui un else con el null, pero daba problemas //

		}
		return contraseña;
	}


	public static StringBuffer buscaSesion (String dni){


		StringBuffer  cadena = new StringBuffer();
		StringBuffer  cadena2 = new StringBuffer();

		for (int i = 0; i<datosUsuarios.length; i++){

			cadena = cadena.append(datosUsuarios[i].nombre +"," + datosUsuarios[i].nif +"," + datosUsuarios[i].apellidos +"," + datosUsuarios[i].correoE +"," + datosUsuarios[i].domicilio +","
					+ datosUsuarios[i].fechaNacimiento +"," + datosUsuarios[i].fechaAlta +"," + datosUsuarios[i].claveAcceso +"," + datosUsuarios[i].rol + ";");


			if (datosUsuarios[i].nif.equals( dni)){

				for (int j = 0; j<sesionesUsuario.length; j++){

					cadena2 = cadena2.append(sesionesUsuario[i].usr.nombre + "," + sesionesUsuario[i].fecha + ";");
					if (datosUsuarios[i].nombre.equals (sesionesUsuario[j].usr.nombre)){


						System.out.println(datosUsuarios[i] + " " + sesionesUsuario[j].usr.nombre +" " + sesionesUsuario[j].fecha );

					}


				}

			}


		}

		return cadena;

	}

	public static StringBuffer buscaSesionSobrecargado ( String dni, String fecha){

		StringBuffer  cadena = new StringBuffer();
		StringBuffer  cadena2 = new StringBuffer();

		for (int i = 0; i<datosUsuarios.length; i++){

			cadena = cadena.append(datosUsuarios[i].nombre +"," + datosUsuarios[i].nif +"," + datosUsuarios[i].apellidos +"," + datosUsuarios[i].correoE +"," + datosUsuarios[i].domicilio +","
					+ datosUsuarios[i].fechaNacimiento +"," + datosUsuarios[i].fechaAlta +"," + datosUsuarios[i].claveAcceso +"," + datosUsuarios[i].rol + ";");

			if (datosUsuarios[i].nif.equals(dni)){


				for (int j = 0; j<sesionesUsuario.length; j++){
					cadena2 = cadena2.append(sesionesUsuario[j].usr.nombre + "," + sesionesUsuario[j].fecha + ";");

					if (sesionesUsuario[j].fecha.equals(fecha)){


						System.out.println(datosUsuarios[i] + " " + sesionesUsuario[j].usr.nombre +" " + sesionesUsuario[j].fecha);

					}


					

					

				}


			}
			


		}
		
		
		return cadena;

	}

*/

}