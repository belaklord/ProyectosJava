package HERENCIA;


import java.util.Calendar;
import java.util.GregorianCalendar;
public class EmpleadoALGL extends Persona {


	private String idEmpleado;
	private double sueldo;
	private Calendar fechaAlta;
	private PuestoTrabajoALGL puesto;


	//CONSTRUCTORES
	//*************

	/**
	 * Constructor convencional
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param correo
	 * @param idEmpleado
	 * @param fechaAlta
	 */
	public EmpleadoALGL(String nombre, String direccion, String telefono,
			String correo, Calendar fechaAlta) {

		//Delega en constructor convencional de Persona
		super(nombre, direccion, telefono, correo);

		//Parte espec�fica de Empleado
		setFechaAlta(fechaAlta);
		this.idEmpleado = generarIdEmpleado();
	}



	/**
	 * Constructor por defecto
	 * 
	 */
	public EmpleadoALGL() {

		//Utiliza constructor por defecto de Persona
		super();

		//Parte espec�fica de Empleado
		this.setFechaAlta(new GregorianCalendar());
		this.idEmpleado = generarIdEmpleado();
	}

	/**
	 * Constructor copia
	 * @param p - El Empleado a clonar
	 */
	public EmpleadoALGL(EmpleadoALGL p) {

		//Utiliza constructor copia de Persona
		super(p);

		//Parte espec�fica de Empleado
		this.setFechaAlta(new GregorianCalendar(p.fechaAlta.get(Calendar.YEAR),
				p.fechaAlta.get(Calendar.MONTH),
				p.fechaAlta.get(Calendar.DAY_OF_MONTH)));
		this.idEmpleado = generarIdEmpleado();
	}


	/**
	 * metodos get y set (acceso)
	 */
	/**
	 * @return idProveedor
	 */
	public String getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * @return  fechaAlta
	 */
	public Calendar getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * 
	 * @return sueldo
	 */
	public double sueldo(){

		return sueldo;
	}

	/**
	 * determina el puesto de trabajo
	 * @return
	 */
	public PuestoTrabajoALGL getPuesto(){
		return puesto;

	}


	public void setPuesto(PuestoTrabajoALGL puesto){

		if(puesto == null){

			puesto = new PuestoTrabajoALGL();
		}
		else{

			this.puesto = puesto;
		}
	}




	/**
	 * @param nombre, el nombre a asignar.
	 * Regenera el idEmpleado
	 * 
	 */
	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
		
	}

	/**
	 * @param telefono, el telefono a asignar.
	 * Regenera el idEmpleado
	 * 
	 */
	@Override
	public void setTelefono(String telefono)  {
		super.setTelefono(telefono);
		
	}

	/**
	 * Regenera el idEmpleado
	 */
	public void resetIdEmpleado() {
		this.idEmpleado = generarIdEmpleado();
	}

	/**
	 * establece la fecha de alta
	 */

	public void setFechaAlta(Calendar f)  {
		if (f == null )
			this.fechaAlta = new GregorianCalendar();
		else
			this.fechaAlta = f;
		
		resetIdEmpleado();
	}

	/**
	 * establece valores a sueldo
	 */

	public void setSueldo(double sueldo){
		if(sueldo < puesto.getsueldoBase()){

			sueldo = puesto.getsueldoBase();
		}
		else{

			this.sueldo = sueldo;
		}


	}

	public double getSueldo(){


		return sueldo;
	}


	//M�TODOS EST�NDAR REDEFINIDOS
	//****************************

	@Override
	public String toString() {
		return super.toString() + "\n"
				+ idEmpleado + "\n"
				+ fechaAlta;
	}


	//M�TODOS AUXILIARES
	//******************

	/**
	 * M�todo de uso interno para generar IdEmpleado a partir de:
	 *     
	 * @return el IdEmpleado obtenido
	 */
	private String generarIdEmpleado() {
		if (correo != null)
			return new String("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*".toUpperCase() + "*" +
					+ fechaAlta.DAY_OF_WEEK);
	
		else{
			return new String(correo.substring(0, 2).toUpperCase() + "000");
	}
}
}














