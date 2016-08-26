
public class ClienteALGL {


	/*
	 * atributos de la clase
	 */

	String NombreEmpresa;
	String cif;
	String domicilio;
	String telefono;
	private TipoEmpresa empresa;




	/*
	 * constructor por defecto
	 * Establece el valor inicial, por defecto, de cada uno de los atributos.
	 * Llama al constructor convencional. 
	 */


	public ClienteALGL(){

		this("johan.SL","1999293-k", "c/penca n23 3f","888888", new TipoEmpresa());		


	}

	/*
	 * constructor convencional
	 * constructor que  establece valores iniciales a los atributos 
	 */

	public ClienteALGL(String NombreEmpresa, String telefono, String domicilio, String cif, TipoEmpresa empresa){


		setNombreEmpresa(NombreEmpresa);
		setCif(cif);
		setDomicilio(domicilio);
		setTelefono(telefono);
		setEmpresa(empresa);

		this.NombreEmpresa = "pepe.SL";
		this.cif = "1999293-k";
		this.domicilio = "c/cacca n23 3f";
		this.telefono = "99999999";
		this.empresa = empresa;
	}







	/*
	 * metodo copia.
	 * 
	 * Establece el valor inicial de cada uno de los atributos a partir de
 		los valores obtenidos de un objeto de su misma clase.
 		Llama al constructor convencional.

	 */

	public ClienteALGL(ClienteALGL p){

		if(p != null){

			setNombreEmpresa(new String(p.NombreEmpresa));
			setCif(p.cif);
			setDomicilio(p.domicilio);
			setTelefono(p.telefono);
			setEmpresa(p.empresa);
		}


	}


	/*
	 * metodos de acceso
	 */


	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {

		if(nombreEmpresa == null || nombreEmpresa.equals("")|| nombreEmpresa.equals(" ")){

			this.NombreEmpresa = "nombre y apellidos por defecto";

		}

		else{

			this.NombreEmpresa = nombreEmpresa;
		}
	}

	public String getCif() {

		return cif;
	}

	public void setCif(String cif) {

		if(cif == null || cif.equals("") || cif.equals(" ")){

			// cif por defecto //

			this.cif = "1999293-k";

		}
		else{

			this.cif = cif;

		}

	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {


		if(domicilio.equals("") || domicilio.equals(" ") ){

			this.domicilio = "c/cacca n23 3f";

		}

		else{

			this.domicilio = domicilio;

		}

		this.domicilio = domicilio;
	}




	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {

		if(telefono.equals("") || telefono.equals(" "))

			this.telefono = telefono;
	}

	public TipoEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(TipoEmpresa empresa) {


		this.empresa = empresa;
	}

	public String toString() {
		return String.format("Cliente [Nombre de la empresa : %s, cif : %s, domicilio : %s, telefono : %s, Empresa: %s]",
				NombreEmpresa, cif, domicilio, telefono,empresa);
	}

}
