package ejercicio_sesion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Usuario {
	
	
	public static final int MAX_USUARIOS = 10;
	public static Usuario [] datosUsuarios = new Usuario [MAX_USUARIOS];
	
	
	
	public static String nif;
	public static String nombre;
	public static String apellidos;
	public static String correoE;
	public static String domicilio;
	public static String fechaNacimiento;
	public static String fechaAlta;
	public static String claveAcceso;
	public static String rol;
	
	
	public static void main (String []args){
		
		
		
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("introduce el correo");
		
		String correo = S. nextLine();
		
		 correoE = correo;
		 
		try{
			
			
			if(correoValido(correoE)){
				

				 datosUsuarios[0] = new Usuario();
				 datosUsuarios[0].correoE = correoE;
				 
				 System.out.println(datosUsuarios[0].correoE);
				
			}
			
			
			
			
		}
		catch(Exception e){
			
			System.out.println("caca");
		}
		 
		 
		 
		 
			 
			 
		 }
	
	
	
	
	
	
	
	

	public static boolean correoValido(String correo){

		//define la expresion regular //


		String patron = "^[\\w-]+@[\\w-]+[\\.]+[A-Za-z]+$";
		// compila la expresion regular a un patron //

		Pattern pattern = Pattern.compile(patron);
		// crea un comparador para comparar la cadena con el patron //

		Matcher matcher = pattern.matcher(correo);
		// si la cadena se ajusta al patron ///

		if (matcher.matches()){

			System.out.println("correo verificado");


			return true;




		}


		System.out.println("correo no verificado");
		return false;


}
	
	
	
	
	
	
	
	
	
		
	}
	


