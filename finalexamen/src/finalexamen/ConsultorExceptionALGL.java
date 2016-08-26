package finalexamen;

public class ConsultorExceptionALGL extends Exception {
	

	 /**
    * Excepción por defecto, sin mensaje.
    */
   public ConsultorExceptionALGL() {
       super();
   }


   /**
    * Excepción con mensaje.
    * @param msg - el mensaje de error asociado.
    */
   public ConsultorExceptionALGL(String msg) {
       super(msg);
   }


}
	


