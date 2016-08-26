package HERENCIA;




public class PuestoTrabajoALGL {

	public enum Categoria {


		OPERARIO, ESPECIALISTA, EXPERTO;

	}


	private String nombre;
	private String descripcion;
	private Categoria categoria;
	private double sueldoBase;



	//CONSTRUCTORES
	//*************

	/**
	 * Constructor convencional
	 * @param nombre
	 * @param Empleado
	 * @param categoria
	 * @param descripcion
	 */
	public PuestoTrabajoALGL(String nombre,
			double Empleado,
			Categoria categoria,
			String descripcion) {

		setNombre(nombre);
		setsueldoBase(sueldoBase);
		setCategoria(categoria);
		setDescripcion(descripcion);
	}

	/**
	 * Constructor Por Defecto
	 */
	public PuestoTrabajoALGL() {
		this("Nombre puesto", 1.0,Categoria.OPERARIO,"Descripcion del puesto");
	}

	/**
	 * Constructor copia
	 * @param p -PuestoTrabajo a clonar
	 */
	public PuestoTrabajoALGL(PuestoTrabajoALGL p) {
		//Se supone que un objeto Proveedor es �nico...
		//Se comparte entre varios productos
		this(p.nombre, p.sueldoBase, p.categoria, p.descripcion);
	}


	//M�TODOS DE ACCESO
	//*****************

	/**
	 * @return  nombre
	 */
	public String getNombre() {
		return nombre;
	}




	/**
	 * @param nombre
	 */
	public void setNombre(String nombre)  {
		if (nombre == null || nombre == "" || nombre == "")
			this.nombre = "Nombre producto";
		else
			this.nombre = nombre;
	}

	/**
	 * devuelve el sueldo base
	 * @return
	 */
	public double getsueldoBase(){


		return sueldoBase;
	}

	/**
	 * metodo para asignar o modificar sueldoBase
	 * @param sueldo
	 */

	public void setsueldoBase(double sueldo){

		if(sueldo <0){

			sueldo = 0;
		}
		else{
			this.sueldoBase = sueldo;	
		}

	}

	/**
	 *  devuelve la categoria
	 * @return
	 */
	public Categoria getCategoria(){

		return categoria;	
	}
	/**
	 * establece la categoría profesional
	 * @param cat
	 */

	public void setCategoria(Categoria cat ){

		if(cat == null){

			this.categoria = Categoria.OPERARIO;

		}
		else{

			this.categoria = cat;

		}
	}

	/**
	 * devueleve la descripcion
	 * @return
	 */
	public String getDescripcion(){

		return descripcion;
	}


	/**
	 * asigna una de las descripociones establecidas, no permite null ni vacio
	 * @param Desc
	 */
	public void setDescripcion(String Desc){

		if(Desc == null || Desc == " " || Desc == ""){

			Desc = descripcion;


		}
		else{

			this.descripcion = Desc;
		}

	}

	//M�TODOS EST�NDAR REDEFINIDOS
	//****************************

	@Override
	public String toString() {
		return "" + "\n" + nombre +
				"\n" + sueldoBase +
				"\n" + categoria +
				"\n" + descripcion;
	}
}



