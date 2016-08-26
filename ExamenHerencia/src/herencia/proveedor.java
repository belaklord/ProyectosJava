package herencia;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class proveedor extends Persona {

	 //ATRIBUTOS
    //*********

    private String idProveedor;
    private Calendar fechaAlta;


    //CONSTRUCTORES
    //*************

    /**
     * Constructor convencional
     * @param nombre
     * @param direccion
     * @param telefono
     * @param correo
     * @param idProveedor
     * @param fechaAlta
     */
    public proveedor(String nombre, String direccion, String telefono,
                     String correo, Calendar fechaAlta) {

        //Delega en constructor convencional de Persona
        super(nombre, direccion, telefono, correo);

        //Parte espec�fica de Proveedor
        setFechaAlta(fechaAlta);
        this.idProveedor = generarIdProveedor();
    }

    /**
     * Constructor por defecto
     * @throws Exception
     */
    public proveedor() {

        //Utiliza constructor por defecto de Persona
        super();

        //Parte espec�fica de Proveedor
        this.setFechaAlta(new GregorianCalendar());
        this.idProveedor = generarIdProveedor();
    }

    /**
     * Constructor copia
     * @param p - El Proveedor a clonar
     */
    public proveedor(proveedor p) {

        //Utiliza constructor copia de Persona
        super(p);

        //Parte espec�fica de Proveedor
        this.setFechaAlta(new GregorianCalendar(p.fechaAlta.get(Calendar.YEAR),
                                                p.fechaAlta.get(Calendar.MONTH),
                                                p.fechaAlta.get(Calendar.DAY_OF_MONTH)));
        this.idProveedor = generarIdProveedor();
    }


    //M�TODOS DE ACCESO
    //*****************

    /**
     * @return el idProveedor
     */
    public String getIdProveedor() {
        return idProveedor;
    }

    /**
     * @return the fechaAlta
     */
    public Calendar getFechaAlta() {
        return fechaAlta;
    }


    /**
     * @param nombre, el nombre a asignar.
     * Regenera el idProveedor
     * @throws Exception
     */
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
        resetIdProveedor();
    }

    /**
     * @param telefono, el telefono a asignar.
     * Regenera el idProveedor
     * @throws Exception
     */
    @Override
    public void setTelefono(String telefono)  {
        super.setTelefono(telefono);
        resetIdProveedor();
    }

    /**
     * Regenera el idProveedor
     */
    public void resetIdProveedor() {
        this.idProveedor = generarIdProveedor();
    }

    /**
     * @param f the fechaAlta to set
     * @throws Exception
     */
    public void setFechaAlta(Calendar f)  {
        if (f == null)
            this.fechaAlta = new GregorianCalendar();
        else
            this.fechaAlta = f;
    }


    
    
    //M�TODOS EST�NDAR REDEFINIDOS
    //****************************

    @Override
    public String toString() {
        return super.toString() + "\n"
               + idProveedor + "\n"
               + fechaAlta;
    }


    //M�TODOS AUXILIARES
    //******************

    /**
     * M�todo de uso interno para generar IdProveedor a partir de:
     *      - Tres primeras letras del nombre.
     *      - Tres �ltimos d�gitos del tel�fono, sin depender de la longitud.
     *      - Si no se dispone del n�mero de tel�fono a�ade 000.
     * @return el IdProveedor obtenido
     */
    private String generarIdProveedor() {
        if (telefono != null)
            return new String(nombre.substring(0, 3).toUpperCase()
                              + telefono.substring(telefono.length()- 3));
        else
            return new String(nombre.substring(0, 2).toUpperCase() + "000");
    }
	
	
	
}
