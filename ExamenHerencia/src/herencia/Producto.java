package herencia;

public class Producto {
	
	
	public enum TipoProducto {
        NACIONAL, IMPORTADO;
    }

    //ATRIBUTOS
    //*********

    private String nombre;
    private double precioCoste;
    private proveedor suministrador;
    private TipoProducto tipo;


    //CONSTRUCTORES
    //*************

    /**
     * Constructor convencional
     * @param nombre
     * @param precioCoste
     * @param suministrador
     * @param tipo
     */
    public Producto(String nombre,
                    double precioCoste,
                    proveedor suministrador,
                    TipoProducto tipo) {

        setNombre(nombre);
        setPrecioCoste(precioCoste);
        setSuministrador(suministrador);
        setTipo(tipo);
    }

    /**
     * Constructor Por Defecto
     */
    public Producto() {
        this("Nombre producto", 1.0, new proveedor(), TipoProducto.NACIONAL);
    }

    /**
     * Constructor copia
     * @param p - Producto a clonar
     */
    public Producto(Producto p) {
        //Se supone que un objeto Proveedor es único...
        //Se comparte entre varios productos
        this(p.nombre, p.precioCoste, p.suministrador, p.tipo);
    }


    //MÉTODOS DE ACCESO
    //*****************

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precioCoste
     */
    public double getPrecioCoste() {
        return precioCoste;
    }

    /**
     * @return the suministrador
     */
    public proveedor getSuministrador() {
        return suministrador;
    }

    /**
     * @return the tipo
     */
    public TipoProducto getTipo() {
        return tipo;
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
     * @param precioCoste
     */
    public void setPrecioCoste(double precioCoste) {
        if (precioCoste <= 0)
            this.precioCoste = 1.0;
        else
            this.precioCoste = precioCoste;
    }

    /**
     * @param suministrador
     */
    public void setSuministrador(proveedor suministrador) {
        if (suministrador == null)
            this.suministrador = new proveedor();
        else
            this.suministrador = suministrador;
    }

    /**
     * @param tipo the
     */
    public void setTipo(TipoProducto tipo) {
        if (tipo == null)
            this.tipo = TipoProducto.NACIONAL;
        else
            this.tipo = tipo;
    }


    //MÉTODOS ESTÁNDAR REDEFINIDOS
    //****************************

    @Override
    public String toString() {
        return "" + "\n" + nombre +
               "\n" + precioCoste +
               "\n" + suministrador +
               "\n" + tipo;
    }
}
