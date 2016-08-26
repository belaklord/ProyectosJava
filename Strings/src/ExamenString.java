
public class ExamenString {
	
	public static  Usuario[] datosUsuarios;

	public static final int MAX_USUARIOS = 20;

	public static void main(String[] args) {


		StringBuffer  t = new StringBuffer ("0344556K,pepe0,López Pérez0,C/Luna,27 30132 Murcia,pepe0@gmail.com,1990.11.12,2014.12.3,miau0,usuario normal;"
											+ "00052231,pepe,López Pérez0,C/Luna,27 30132 Murcia,pepe0@gmail.com,1990.11.12,2014.12.3,miau0,usuario normal;"
											+ "0000000,pepe,López Pérez0,C/Luna,27 30132 Murcia,pepe0@gmail.com,1990.11.12,2014.12.3,miau0,usuario normal;");
											


		importarUsuarioTexto(t);


	}


	public static void  importarUsuarioTexto(StringBuffer t){




		String puntoycoma = ";";



		while(t.indexOf(puntoycoma)!= -1){


			int usuario = t.indexOf(puntoycoma);

			String sub = t.substring(0, usuario);

			t.delete(0,t.indexOf(puntoycoma)+1);

			String[] datosUsuarios = sub.split(",");


			
			Usuario [] datosUsuario = new Usuario [1];


			for(int i = 0; i<datosUsuarios.length; i++){

				for(int j= 0; j<datosUsuario.length; j++){

					if(datosUsuarios[i] == datosUsuarios[0]){


						datosUsuario[j] = new Usuario();
						datosUsuario[j].nif = datosUsuarios[0];
						datosUsuario[j].nombre =datosUsuarios[1];
						datosUsuario[j].apellidos =datosUsuarios[2];
						datosUsuario[j].domicilio =datosUsuarios[3];
						datosUsuario[j].correoE =datosUsuarios[4];
						datosUsuario[j].fechaNacimiento =datosUsuarios[5];
						datosUsuario[j].fechaAlta =datosUsuarios[6];
						datosUsuario[j].claveAcceso =datosUsuarios[7];
						datosUsuario[j].rol =datosUsuarios[8];


						System.out.println(datosUsuario[j]);

					}

				}



			}




		}





	}




	public static class Usuario
	{



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

	} 

}
