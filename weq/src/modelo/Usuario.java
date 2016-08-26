
package modelo;


import java.util.regex.*;
public class Usuario {


	public String nif;
	public String nombre;
	public String apellidos;
	public String correoE;
	public String domicilio;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;
	
	@Override
	
	// metodo para dar formato a los atributos de cada objeto, en este caso de los datos de los usuarios //
    public String toString() {
        return "Usuario [\nnif:" + nif + "\n" + "Nombre :" + nombre + "\n" +"Apellidos:"
                + apellidos + "\n" + "domicilio:" + domicilio + "\n" + "CorreoE:"
                + correoE + "\n" + "FechaNacimiento:" + fechaNacimiento
                + "\n" + "FechaAlta:" + fechaAlta + "\n" + "ClaveAcceso:" + claveAcceso
                + "\n" + "Rol:" + rol + "]";
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
