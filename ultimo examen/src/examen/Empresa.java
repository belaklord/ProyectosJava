package examen;

import java.io.Serializable;

public class Empresa implements Serializable
{

    public enum TipoEmpresa {
        INDUSTRIAL, SERVICIOS, OTROS
    };

    //ATRIBUTOS
    //*********
    private String id;              //Identificador único dentro del sistemas de la empresa.
    private String nombre;          //Nombre o razón social de la empresa.
    private String cif;             //Código de identificación fiscal de la entidad.
    private String telefono;        //Número de teléfono de contacto de la empresa.
    private TipoEmpresa tipo;       //Es el tipo al que pertenece la empresa.


    //CONSTRUCTORES
    //*************

    /**
     * Constructor convencional.
     * @param id
     * @param nombre
     * @param cif
     * @param telefono
     * @param tipo
     * @throws EmpresaException
     */
    public Empresa(String id, String nombre, String cif, String telefono, TipoEmpresa tipo) throws EmpresaException {
        setId(id);
        setNombre(nombre);
        setCif(cif);
        setTelefono(telefono);
        setTipo(tipo);
    }


    /**
     * Constructor por defecto.
     * Se asumen valores preestablecidos no nulos.
     * @throws EmpresaException
     */
    public Empresa() throws EmpresaException {

        this("E-000", "Nombre empresa", "A00000000", "+34 (999) 99 99 99", TipoEmpresa.SERVICIOS);
    }


    /**
     * Constructor copia.
     * Realiza copia profunda del objeto.
     * @param empresa
     * @throws EmpresaException
     */
    public Empresa(Empresa empresa) throws EmpresaException {

        if (empresa ==  null)
            throw new EmpresaException("Empresa no se puede clonar...");

        setId(empresa.id);
        setNombre(empresa.nombre);
        setCif(empresa.cif);
        setTelefono(empresa.telefono);
        setTipo(empresa.tipo);
    }


    //MÉTODOS DE ACCESO
    //*****************

    /**
     * @param id, a cambiar.
     * Admite cualquier formato.
     * Verifica que sea correcto; utiliza un método auxiliar.
     * @throws EmpresaException - Si recibe un valor nulo o repetido.
     */
    public void setId(String id) throws EmpresaException {

        //verifica id
        if (id == null || !idValido(id))
            throw new EmpresaException("Id null o repetido...");

        this.id = id;
    }


    /**
     * @param nombre, a cambiar.
     * Verifica que sea correcto.
     * @throws EmpresaException - Si recibe un valor nulo o incorrecto.
     */
    public void setNombre(String nombre) throws EmpresaException {

        //verifica nombre
        if (nombre == null || !nombre.matches("^[A-ZÑ][a-zñáéíóú SAUL.]+"))
            throw new EmpresaException("Nombre null o formato no válido...");

        this.nombre = nombre;
    }


    /**
     * @param cif, a cambiar.
     * Verifica que sea correcto.
     * @throws EmpresaException - Si recibe un valor nulo o con formato incorrecto.
     */
    public void setCif(String cif) throws EmpresaException {

        //verifica cif
        if (cif == null || !cif.matches("^[ABCDEFGHKLMNPQS][0-9]{8}$"))
            throw new EmpresaException("Cif null o formato no válido...");

        this.cif = cif;
    }


    /**
     * @param telefono, a cambiar.
     * Verifica que sea correcto.
     * @throws EmpresaException - Si recibe un valor nulo o con formato incorrecto.
     */
    public void setTelefono(String telefono) throws EmpresaException {

        //verifica telefono
        if (id == null || !telefono.matches("^\\+?\\d{1,3}?[ ]?\\(?\\d{2,3}\\)?[ ]?\\d\\d[ ]?\\d\\d[ ]?\\d\\d$"))
            throw new EmpresaException("Telefono null o formato no válido...");

        this.telefono = telefono;
    }


    /**
     * @param tipo, a cambiar.
     * Verifica que sea correcto.
     * @throws EmpresaException - Si recibe un valor nulo.
     */
    public void setTipo(TipoEmpresa tipo) throws EmpresaException {

        //verifica tipo
        if (tipo == null)
            throw new EmpresaException("Tipo empresa null...");

        this.tipo = tipo;
    }

/**
     * @return nombre
     */
    public String getNombre() {

        return nombre;
    }


    /**
     * @return cif
     */
    public String getCif() {

        return cif;

    }


    /**
     * @return id
     */
    public String getId() {

        return id;
    }


    /**
     * @return telefono
     */
    public String getTelefono() {

        return telefono;
    }


    /**
     * @return tipo
     */
    public TipoEmpresa getTipo() {

        return tipo;
    }


    //MÉTODOS ESTÁNDAR REDEFINIDOS
    //****************************

    @Override
    public String toString() {
        return String.format(
                   "Empresa [id=%s, nombre=%s, cif=%s, telefono=%s, tipo=%s]", id,
                   nombre, cif, telefono, tipo);
    }


    //OTROS MÉTODOS
    //*************

    /**
     * @return true si el id está disponible y no está ya en uso.
     */
    private boolean idValido(String id) {

        if (Datos.getInstance().obtener(id) == null)
            return true;

        return false;
    }

}//class
