package string;

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
    public String toString() {
        return "Usuario [\nnif=" + nif + "\n" + "Nombre=" + nombre + "\n" +"Apellidos="
                + apellidos + "\n" + "domicilio=" + domicilio + "\n" + "CorreoE="
                + correoE + "\n" + "FechaNacimiento=" + fechaNacimiento
                + "\n" + "FechaAlta=" + fechaAlta + "\n" + "ClaveAcceso=" + claveAcceso
                + "\n" + "Rol=" + rol + "]";
    }
	
}
