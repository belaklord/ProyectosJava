package pruebaExamenArray;

public class usuario {
	
	public String nif;
	public String noos;
	public String domicilmbre;
	public String apellidio;
	public String correoE;
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
