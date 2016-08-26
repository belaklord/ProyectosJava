package HERENCIA;

public abstract  class Persona {

	 //ATRIBUTOS
    //*********

    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String correo;


    //CONSTRUCTORES
    //*************

    /**
     * Constructor convencional
     * @param nombre
     * @param direccion
     * @param telefono
     * @param correo
     */
    public Persona(String nombre, String direccion,
                   String telefono, String correo) {

        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setCorreo(correo);

    }

    /**
     * Constructor por defecto
     */
    public Persona() {
        this("Nombre Apellido Apellido", "Calle 00, 00000 Poblacion", "+034 (968) 000 000", "correo@correo.com");
    }

    /**
     * Constructor copia
     * param p Persona a clonar
     */
    public Persona(Persona p) {
        this(new String(p.nombre),
             new String(p.direccion),
             new String(p.telefono),
             new String(p.correo));
    }


    //M�TODOS DE ACCESO
    //*****************

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @return el telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @return el correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param nombre, el nombre a asignar.
     */
    public void setNombre(String nombre) {
        // Comprueba que:
        // Nombre est� formado por tres partes separadas por un espacio y
        // cada uno de ellos a su es un bloque de tres letras, al menos que
        // empiezan por may�scula. S�lo se adminten caracteres alfab�ticos.


        if (nombre == null || nombre.matches("^[A-ZÑ][a-zñáéíóú]{3,} [A-ZÑ][a-zñáéíóú]{3,} [A-ZÑ][a-zñáéíóú]{3,}") == false)
            this.nombre = "Pepe L�pez Ruiz";
        else
            this.nombre = nombre;
    }

    /**
     * @param direccion, la direccion a asignar
     */
    public void setDireccion(String direccion) {
        if (direccion == null || direccion.equals("") || direccion.equals(" "))
            this.direccion = "Calle nada, 00000 Poblacion";
        else
            this.direccion = direccion;
    }

    /**
     * @param correo, el correo a asignar
     * @throws Exception
     */
    public void setTelefono(String telefono) {
        // Comprueba que:
        // Tel�fono est� formado por un c�digo de pais y
        // tres bloques de d�gitos.

        if (telefono == null || telefono.matches("^\\+?\\d{1,3}?[ ]?\\(?\\d{2,3}\\)?[ ]?\\d\\d\\d[ ]?\\d\\d\\d$") == false)
            this.telefono = "+034 (968) 000 000";
        else
            this.telefono = telefono;
    }

    /**
     * @param correo, el correo a asignar
     */
    public void setCorreo(String correo) {
        // Comprueba que:
        // correo est� formado por dos partes separadas por dos partes conteniendo @
        // y un tipo de dominio final.

        if (correo == null || correo.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$") == false)
            this.correo = "correo@correo.com";
        else
            this.correo = correo;
    }


    //M�TODOS EST�NDAR REDEFINIDOS
    //****************************

    /**
     * @return el texto con todos el valor de todos los atributos
     */
    @Override
    public String toString() {
        return new String(nombre +
                          "\n" + direccion +
                          "\n" + telefono +
                          "\n" + correo);
    }
	
	
	
	
}
