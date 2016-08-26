

// examen de prueba creacion de usuarios dentro de un vector siguiendo un patron //

// tiene errores cuando se compila //

class Usuario
{

	public String nif;
	public String nombre;
	public String apellidos;
	public String correoE;
	public String domicilio;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

}

public class examenArray
{


	final static int MAX_USUARIOS =45;

	public static Usuario[] datosUsuarios = new Usuario [MAX_USUARIOS];

	public static void main (String []args){



		int vector[] = {1,0,1,0,1,1,0};

		cargaDatosUsuariosPatronALGL(vector);


	}

	public static void cargaDatosUsuariosPatronALGL (int[] vector){

		int posicion = 0;
		
		
		for (int j = 0; j<datosUsuarios.length; j++){
			
			for (int i = 0; i< vector.length; i++){
			
			
			if(vector[i] == 1){
				
				
					if (vector[i] == vector[6]){
						
						i = 0;
						
					}
					
					
					
				datosUsuarios[j] = new Usuario();
				datosUsuarios[j].nif = "456789" + " " +posicion;
				datosUsuarios[j].nombre = "antonio"+ " " + posicion;
				datosUsuarios[j].apellidos = "gallego" + " " + posicion;
				datosUsuarios[j].correoE = "antonio@gmail.com "+ " "  + posicion;
				datosUsuarios[j].domicilio = "c/ capuchinos n23 3f" + " " +posicion;
				datosUsuarios[j].fechaNacimiento = "23.11.1987" + " " + posicion;
				datosUsuarios[j].fechaAlta = "02.07.2000" +  " " +posicion;
				datosUsuarios[j].claveAcceso = "tierrasanta"+  " " +posicion;
				datosUsuarios[j].rol = "root" +  " " +posicion;

				
				

				System.out.println(datosUsuarios[j].nif);
				System.out.println(datosUsuarios[j].nombre);
				System.out.println(datosUsuarios[j].apellidos);
				System.out.println(datosUsuarios[j].correoE);
				System.out.println(datosUsuarios[j].domicilio);
				System.out.println(datosUsuarios[j].fechaNacimiento);
				System.out.println(datosUsuarios[j].claveAcceso);
				System.out.println(datosUsuarios[j].fechaAlta);
				System.out.println(datosUsuarios[j].rol);
				System.out.println("    ");
				System.out.println("    ");
				System.out.println("    ");
			

			}
			
			if (vector[i] == 0){
				
				datosUsuarios[posicion] = null;
				System.out.println("    ");
				System.out.println("vacio");
				System.out.println("    ");
			}
			
			
			posicion ++;
			

			}
			
			
			
		}
		
		
		
		
			
		

			

	}



}


		
	
	
