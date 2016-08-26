import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class DatosSesiones1ALGL {

	// Vectores de objetos
    public static Usuario[] datosUsuarios;
    public static SesionUsuario[] datosSesiones;

    /**
     * Método principal que coordina la
     * llamada a los distintos métodos probados.
     * @param args
     */
    public static void main(String[] args) {

        // Prepara texto para la prueba con una cantidad arbitraria de objetos SesionUsuario
        // Cada objeto SesionUsuario va delimitado por el par de etiquetas: <sesion></sesion>
        // Cada sesión está compuesta por:
        //      - Un objeto Usuario delimitado por las etiquetas: <usr></usr>
        //      - Una fecha delimitada por: <fecha></fecha>
        // Cada atributo del objeto usuario va separado por las etiquetas: <atrib></atrib>

        StringBuffer textoDatos = new StringBuffer( 

            "<sesion>"
              + "<usr>"
                + "<atrib>0344556K</atrib>"
                 + "<atrib>pepe0</atrib>"
                 + "<atrib>López Pérez0</atrib>"
                 + "<atrib>C/Luna, 27 30132 Murcia</atrib>"
                 + "<atrib>pepe0@gmail.com</atrib>"
                 + "<atrib>1990.11.12</atrib>"
                 + "<atrib>2014.12.3</atrib>"
                 + "<atrib>miau0</atrib>"
                 + "<atrib>usuario normal</atrib>"
              + "</usr>"
              + "<fecha>13.01.2015</fecha>"
            +"</sesion>"

            +"<sesion>"
              + "<usr>"
                + "<atrib>1344556K</atrib>"
                + "<atrib>pepe1</atrib>"
                + "<atrib>López Pérez1</atrib>"
                + "<atrib>C/Luna, 27 30132 Murcia</atrib>"
                + "<atrib>pepe1@gmail.com</atrib>"
                + "<atrib>1990.11.12</atrib>"
                + "<atrib>2014.12.3</atrib>"
                + "<atrib>miau1</atrib>"
                + "<atrib>usuario normal</atrib>"
              + "</usr>"
              + "<fecha>13.01.2015</fecha>"
            +"</sesion>"

            +"<sesion>"
              + "<usr>"
                + "<atrib>2344556K</atrib>"
                + "<atrib>pepe2</atrib>"
                + "<atrib>López Pérez2</atrib>"
                + "<atrib>C/Luna, 27 30132 Murcia</atrib>"
                + "<atrib>pepe2@gmail.com</atrib>"
                + "<atrib>1990.11.12</atrib>"
                + "<atrib>2014.12.3</atrib>"
                + "<atrib>miau2</atrib>"
                + "<atrib>usuario normal</atrib>"
              + "</usr>"
              + "<fecha>13.01.2015</fecha>"
            +"</sesion>"

            +"<sesion>"
              + "<usr>"
                + "<atrib>3344556K</atrib>"
                + "<atrib>pepe3</atrib>"
                + "<atrib>López Pérez3</atrib>"
                + "<atrib>C/Luna, 27 30132 Murcia</atrib>"
                + "<atrib>pepe3@gmail.com</atrib>"
                + "<atrib>1990.11.12</atrib>"
                + "<atrib>2014.12.3</atrib>"
                + "<atrib>miau3</atrib>"
                + "<atrib>usuario normal</atrib>"
              + "</usr>"
              + "<fecha>13.01.2015</fecha>"
            +"</sesion>");

        //...

        //Llamada al método de importación de datos

        //...
        
        importarDatosEtiquetados1ALGL(textoDatos);

    }

    /*
     * metodo que recibe un texto para tratarlo y almacenar en arrays tanto de usuario como de sesiones de usuarios los datos
     * de dicho texto eliminando previamente las etiquetas.
     */
    public static void  importarDatosEtiquetados1ALGL (StringBuffer textoDatos){


    	// declaracion de las etiquetas a utilizar //
    	String etiqueta1 = "<sesion>";
    	String etiqueta2 = "</sesion>";
    	String etiqueta5 = "<atrib>";
    

// bucle que se repite hasta que desaparezcan todas las etiquetas //
    	while(textoDatos.indexOf(etiqueta1)!= -1){


    		int usuario = textoDatos.indexOf(etiqueta2);

    		textoDatos.delete(0,textoDatos.indexOf(etiqueta2));

    		String sub = textoDatos.substring(0, usuario);


    		String[] datosUsuarios = sub.split(etiqueta5);

    		textoDatos.delete(0,textoDatos.indexOf(etiqueta2));

    		Usuario [] datosUsuario = new Usuario [4];

// bucles anidados que recoores los dos arrays he introducen los datos dentro del array de usuario //
    		for(int i = 0; i<datosUsuarios.length; i++){

    			for(int j= 0; j<datosUsuario.length; j++){

    				if(datosUsuarios[i] == datosUsuarios[j]){


    					datosUsuario[j] = new Usuario();
    					datosUsuario[j].nif = datosUsuarios[1];
    					datosUsuario[j].nombre =datosUsuarios[2];
    					datosUsuario[j].apellidos =datosUsuarios[3];
    					datosUsuario[j].domicilio =datosUsuarios[4];
    					datosUsuario[j].correoE =datosUsuarios[5];
    					datosUsuario[j].fechaNacimiento =datosUsuarios[6];
    					datosUsuario[j].fechaAlta =datosUsuarios[7];
    					datosUsuario[j].claveAcceso =datosUsuarios[8];
    					datosUsuario[j].rol =datosUsuarios[9];




    				}

    			}



    		}




    	}


    	







    }

    	
    		
    		
    			
    	
    		
 
    		
    		
    		
    		
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

    // Otros métodos...



 //class


/**
 * Clase que representa un usuario de un sistema.
 * @author ajp
 */
class Usuario
{

    //Atributos

    public String nif;
    public String nombre;
    public String apellidos;
    public String domicilio;
    public String correoE;
    public String fechaNacimiento;
    public String fechaAlta;
    public String claveAcceso;
    public String rol;
    
    
    public String toString() {
		return "Usuario [\nnif:" + nif + "\n" + "Nombre :" + nombre + "\n" +"Apellidos:"
				+ apellidos + "\n" + "domicilio:" + domicilio + "\n" + "CorreoE:"
				+ correoE + "\n" + "FechaNacimiento:" + fechaNacimiento
				+ "\n" + "FechaAlta:" + fechaAlta + "\n" + "ClaveAcceso:" + claveAcceso
				+ "\n" + "Rol:" + rol + "]";
	}

} //class



/**
 * Clase que representa una sesión de usuario en un sistema.
 * @author ajp
 */
class SesionUsuario
{

    // Atributos

    public Usuario usr;
    public String fecha;
	
}
