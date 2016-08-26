package arayyjava;


import accesoDatos.Datos;

import java.util.Scanner;

import modelo.SesionUsuario;
import modelo.Usuario;

						//para hacer lo del correo podemos atender a expresiones regulares //

public class Principal {

	// vectores que almacenan hasta 10 usuarios y 10 sesiones de usuario  ( movidos a la clase Datos esto produce errores que
	// hay que resolver para ello importamos el paquete donde esta la clase y posteriormente ponemos la clase antes de 
	// el vector que vamos a usar ejemplo: datos.datosUsuarios........)//



	public static void main (String []args){
		
		
		
		

		/*
		Scanner S = new Scanner (System.in);
		
		System.out.println("introduce el correo");
		
		String correo = S. nextLine();
		
		
		/*
		System.out.println("introduce el dni a buscar");
		
		String dni =  S. nextLine();
		
		System.out.println("introduce la fecha");
		
		String fecha = S. nextLine();
*/
		

		Datos.cargarDatosUsuario();
		/*
		Datos.datosUsuariosTexto();
		
		Datos.DatosSesionesTexto();
		
		Datos.buscaUsuario (dni);
		/*
		Datos.buscaSesion (dni);
		
		Datos.buscaSesionSobrecargado (dni,fecha);
		
		Usuario.correoValido(correo);
	*/
		 iniciarSesion();




	}
	
	public static void iniciarSesion(){
		
		Scanner S = new Scanner (System.in);
		
		int intento =0;
		boolean a = true;
		
		do{


			String usuario, contraseña;

			System.out.println("introduce el nombre se usuario");

			usuario = S. nextLine();

			int error =0;
			int	contador = 0;
			
			// recorremos elvector datosUsuarios entero //
			for (int i = 0; i<Datos.datosUsuarios.length; i++){										


				if (Datos.datosUsuarios[i].nombre.equalsIgnoreCase(usuario) ){


					System.out.println("introduce la contraeña");



					contraseña = S. next();



					if (contraseña.equals(Datos.datosUsuarios[i].claveAcceso)){			
						// ponemos un contador para referirnos a la misma posicion del usuario introducido //
						// de esta forma solo valdrá su contraseña ///
						SesionUsuario Sesion1 = new SesionUsuario();
						Sesion1.usr = Datos.datosUsuarios[i];
						Sesion1.fecha = "23.11.2010";
						a = true;

							System.out.println("el usuario" + " " + Datos.datosUsuarios[i].nombre + " "+ "ha iniciado sesion" );
					}

					else{

						System.out.println("contraseña incorrecta");
						intento++;
						a = false;


					}


				}
				else{

					error++;

				}

				if (error == 10){

					System.out.println("usuario incorrecto");
					a = false;
					intento++;

				}

				contador ++;

			}




		}while( a == false && intento <4);


		String y;

		if (intento==4){


			System.out.println("sesion bloqueada, numero máximo de intentos fallidos");
		}
		else {
			System.out.println("pulsa (y) para confirmar el inicio de sesion");


			y = S. next();

			if (y.equalsIgnoreCase("y")){

				System.out.println("bienvenido");
			}

			else {

				System.out.println("confirmacion erronea, inicio de sesion cancelado");
			}
		}




		
		
		
		
	}
	
}
