package finalexamen;

public class ConsultorExceptionALGL extends Exception {
	

	 /**
    * Excepci�n por defecto, sin mensaje.
    */
   public ConsultorExceptionALGL() {
       super();
   }


   /**
    * Excepci�n con mensaje.
    * @param msg - el mensaje de error asociado.
    */
   public ConsultorExceptionALGL(String msg) {
       super(msg);
   }


}
	


