package finalexamen;

/** Examen2.2b.ajp
 *  Implementa el concepto de Usuario según el enunciado del examen.
 *  @source: Usuario.java
 *  @version: 1.0 - 2015.05.25
 *  @author: ajp
 */

import java.io.Serializable;

public abstract class Usuario implements Serializable
{

    //ATRIBUTOS
    //*********
    protected String id;
    protected String nombre;


    //MÉTODOS DE ACCESO
    //*****************

    /**
     * Cambia id.
     * @param id - a cambiar.
     * Verifica que sea correcto.
     * @throws Exception - si no es válido.
     */
    public abstract void setId(String id) throws Exception;


    /**
     * Cambia el nombre.
     * @param nombre - a cambiar.
     * Verifica que sea correcto.
     * @throws Exception - si no es válido.
     */
    public abstract void setNombre(String nombre) throws Exception;


    /**
     * @return - el id
     */
    public String getId() {
        return id;
    }


    /**
     * @return - el nombre
     */
    public String getNombre() {
        return nombre;
    }


    //OTROS MÉTODOS
    //*************

    /**
     * @return true si el id está disponible y no está ya en uso.
     */
    protected boolean idValido(String id) {

        if (Datos.getInstance().obtener(id) == null)
            return true;

        return false;
    }


} //class

/** Examen2.2b.ajp
 *  Interfaz con las operaciones previstas del almacén de datos según el enunciado de examen.
 *  @source: OperacionesDatos.java
 *  @version: 1.0 - 2015.05.25
 *  @author: agu
 */

import java.io.File;

public interface OperacionesDatos {

    /**
     *  Alta de un objeto en el almacén de datos.
     *  @param obj - Objeto a almacenar.
     *  @throws Exception - si ya existe.
     */
    void alta(Object obj) throws Exception;


    /**
     *  Exporta datos desde la base de datos a un fichero de objetos serializados.
     *  @throws Exception - si hay errores.
     */
    void backup() throws Exception;


} //interface