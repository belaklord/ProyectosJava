package finalexamen;


public class ConsultorALGL extends Usuario {
	
	
	
	 public enum TipoConsultor {
	        PLANTILLA, EXTERNO, OTRO
	    };
	
 private String id;              //Identificador único dentro del sistemas del consultor.
 private String nombre;          //Nombre del consultor.
 private String experiencia;             //experiencia.
 									
 private TipoConsultor tipo; 		//tipo de consultor

 
 

 //CONSTRUCTORES
 //*************

 /**
  * Constructor convencional.
  * @param id
  * @param nombre
  * @param experiencia
  * @param tipo
  * @throws ConsultorExceptionALGL
  */
 public ConsultorALGL(String id, String nombre, String cif, String telefono, TipoConsultor tipo) throws ConsultorExceptionALGL {
     setId(id);
     setNombre(nombre);
     setExperiencia(experiencia);
     setTipo(tipo);
 }


 /**
  * Constructor por defecto.
  * Se asumen valores preestablecidos no nulos.
  * @throws ConsultorExceptionALGL
  */
 public ConsultorALGL() throws ConsultorExceptionALGL {

     this("E-000", "Nombre empresa", "A00000000", "+34 (999) 99 99 99", TipoConsultor.EXTERNO);
 }


 /**
  * Constructor copia.
  * Realiza copia profunda del objeto.
  * @param consultor
  * @throws ConsultorExceptionALGL
  */
 public ConsultorALGL(ConsultorALGL ConsultorALGL) throws ConsultorExceptionALGL {

     if (ConsultorALGL ==  null)
         throw new ConsultorExceptionALGL("Empresa no se puede clonar...");

     setId(ConsultorALGL.id);
     setNombre(ConsultorALGL.nombre);
     setExperiencia(ConsultorALGL.experiencia);
     setTipo(ConsultorALGL.tipo);
 }


 //MÉTODOS DE ACCESO
 //*****************

 /**
  * @param id, a cambiar.
  * Admite cualquier formato.
  * Verifica que sea correcto; utiliza un método auxiliar.
  * @throws consultor exception - Si recibe un valor nulo o repetido.
  */
 public void setId(String id) throws ConsultorExceptionALGL {

     //verifica id
     if (id == null || !idValido(id))
         throw new ConsultorExceptionALGL("Id null o repetido...");

     this.id = id;
 }


 /**
  * @param nombre, a cambiar.
  * Verifica que sea correcto.
  * @throws ConsultorExceptionALGL - Si recibe un valor nulo o incorrecto.
  */
 public void setNombre(String nombre) throws ConsultorExceptionALGL {

     //verifica nombre
     if (nombre == null || !nombre.matches("^[A-ZÑ][a-zñáéíóú SAUL.]+"))
         throw new ConsultorExceptionALGL("Nombre null o formato no válido...");

     this.nombre = nombre;
 }


 /**
  * @param experiencia, a cambiar.
  * Verifica que sea correcto.
  * @throws consultor exception - Si recibe un valor nulo o con formato incorrecto.
  */
 public void setExperiencia(String experiencia) throws ConsultorExceptionALGL {

     //verifica experiencia
     if (experiencia == null || !experiencia.matches("^[ABCDEFGHKLMNPQS][0-9]{8}$"))
         throw new ConsultorExceptionALGL("experiencia en formato no valido...");

     this.experiencia = experiencia;
 }



 /**
  * @param tipo, a cambiar.
  * Verifica que sea correcto.
  * @throws ConsultorExceptionALGL - Si recibe un valor nulo.
  */
 public void setTipo(TipoConsultor tipo) throws ConsultorExceptionALGL {

     //verifica tipo
     if (tipo == null)
         throw new ConsultorExceptionALGL("Tipo consultor null...");

     this.tipo = tipo;
 }

/**
  * @return nombre
  */
 public String getNombre() {

     return nombre;
 }


 /**
  * @return id
  */
 public String getId() {

     return id;
 }

 /**
  * return experiencia
  */

 public String getExperiencia(){
	 
	 return experiencia;
 }

 /**
  * @return tipo
  */
 public TipoConsultor getTipo() {

     return tipo;
 }


 //MÉTODOS ESTÁNDAR REDEFINIDOS
 //****************************

 @Override
 public String toString() {
     return String.format(
                "Empresa [id=%s, nombre=%s, cif=%s, telefono=%s, tipo=%s]", id,
                nombre, experiencia, tipo);
 }


 //OTROS MÉTODOS
 //*************

 /**
  * @return true si el id está disponible y no está ya en uso.
  */
 protected boolean idValido(String id) {

     if (DatosALGL.getInstance().obtener(id) == null)
         return true;

     return false;
 }

	
	
	

	
	
	
	

	
	
	
	
	
	
	
}
