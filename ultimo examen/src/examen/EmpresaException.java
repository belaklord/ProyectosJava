package examen;

public class EmpresaException extends Exception {
	
	
	
	 /**
     * Excepci�n por defecto, sin mensaje.
     */
    public EmpresaException() {
        super();
    }


    /**
     * Excepci�n con mensaje.
     * @param msg - el mensaje de error asociado.
     */
    public EmpresaException(String msg) {
        super(msg);
    }


}
