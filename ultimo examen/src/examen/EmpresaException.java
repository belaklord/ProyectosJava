package examen;

public class EmpresaException extends Exception {
	
	
	
	 /**
     * Excepción por defecto, sin mensaje.
     */
    public EmpresaException() {
        super();
    }


    /**
     * Excepción con mensaje.
     * @param msg - el mensaje de error asociado.
     */
    public EmpresaException(String msg) {
        super(msg);
    }


}
