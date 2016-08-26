

/*
 *  hacer un metodo para tratar los errores, no ponerlos en el set....
 *  llamar a ese metodo en los metodos sets.
 */

// primero hacer los guettes y setter y luego los constructores aplicando los getes o setes en ellos //

public class EmpleadoALGL {
	
	
	//atributos de la clase //
	
	private String nombre;
	private int edad;
	private double sueldo;
	// usamos como atributo de la clase otra clase la cual crearemos con el asistente
	// y que no rellenartemos //
	private PuestoTrabajoALGL puesto;
	
	
	
   	/*
   	 * constructor convencional
	 * constructor que  establece valores iniciales a los atributos 
	 */
	
	
	public EmpleadoALGL(String nombre, int edad, double sueldo,PuestoTrabajoALGL puesto){
		
		// los metodos "set" se aplican a cada constructor de modo que 
		// en cada constructor hay que ponerlos ya que los atributos camnbian 
		
		setNombre(nombre);
		setSueldo(sueldo);
		setEdad(edad);
		setPuesto(puesto);
		
		this.nombre = "pepe";
		this.edad = 18;
		this.sueldo = 122.23;
		this.puesto = puesto;
		
		
		
	}
	
	/*
	 * constructor por defecto
	 * Establece el valor inicial, por defecto, de cada uno de los atributos.
	 * Llama al constructor convencional. 
	 */
	
	
	
	public EmpleadoALGL(){
		
		this("juan", 18,122.23, new PuestoTrabajoALGL());		// creamos un nuevo puesto de trahajo en el atributo //
				
		
	}
	

	/*
	 * metodo copia.
	 * 
	 * Establece el valor inicial de cada uno de los atributos a partir de
	 los valores obtenidos de un objeto de su misma clase.
	 Llama al constructor convencional.
	
	 */
	 
	public EmpleadoALGL(EmpleadoALGL p){
		
		if(p != null){
			
			setNombre(new String(p.nombre));
			setSueldo(p.sueldo);
			setEdad(p.edad);
			setPuesto(p.puesto);
			
		}
		
		
	}
	
	
	/*
	 * metodos de acceso
	 */

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		if(nombre == null || nombre.equals("")|| nombre.equals(" ")){
			
			// si se cumple sacamos este valor por defecto //
			
			this.nombre = "nombre y apellidos por defecto";
			
		}
		
		else{
		this.nombre = nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		
		if(edad >=65 && edad <16){
			
			this.edad = 16; // valor por defecto //
		}
		else{
		this.edad = edad;
		}
	}

	public double getSueldo() {
	
		
		return sueldo;
		}
	

	public void setSueldo(double sueldo) {
		
		if(sueldo <0){
			
			this.sueldo = 100; // sueldo por defecto //
		}
		
		else{
		this.sueldo = sueldo;
		}
	}

	public PuestoTrabajoALGL getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoTrabajoALGL puesto) {
		this.puesto = puesto;
	}
	
	
	
	
	/*
	 * metodo toString
	 */
	
	@Override
	public String toString() {
		return String.format("Empleado [nombre : %s, edad : %s, sueldo : %s, puesto : %s]", nombre, edad, sueldo, puesto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
