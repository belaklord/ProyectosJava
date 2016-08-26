package examenpaco;

/*
 * clase aerticulo que hereda de la superclase producto
 */
public class ArticuloFGG  extends Producto {
	
	
	public enum estado {
        DISPONIBLE, SINEXISTENCIAS, DESCONTINUADO
    };

private String id;              //Identificador único dentro del sistemas del articulo.
private String nombre;          //Nombre del consultor.						
private estado tipo; 		//tipo de consultor




//CONSTRUCTORES
//*************

/**
* Constructor convencional.
* @param id
* @param nombre
* @param tipo
* @throws ArticuloExceptionFGG
*/
public ArticuloFGG(String id, String nombre, estado tipo) throws ArticuloExceptionFGG {
 setId(id);
 setNombre(nombre);
 setTipo(tipo);
}


/**
* Constructor por defecto.
* Se asumen valores preestablecidos no nulos.
* @throws ConsultorExceptionALGL
*/
public ArticuloFGG() throws ArticuloExceptionFGG {

 this("E-000", "Nombre empresa", estado.DISPONIBLE);
}


/**
* Constructor copia.
* Realiza copia profunda del objeto.
* @param consultor
* @throws ArticuloExceptionFGG
*/
public ArticuloFGG(ArticuloFGG ArticuloFGG) throws ArticuloExceptionFGG {

 if (ArticuloFGG ==  null)
     throw new ArticuloExceptionFGG(" no se puede clonar...");

 setId(ArticuloFGG.id);
 setNombre(ArticuloFGG.nombre);
 setTipo(ArticuloFGG.tipo);
}


//MÉTODOS DE ACCESO
//*****************

/**
* @param id, a cambiar.
* Admite cualquier formato.
* Verifica que sea correcto; utiliza un método auxiliar.
* @throws ArticuloExceptionFGG - Si recibe un valor nulo o repetido.
*/
public void setId(String id) throws ArticuloExceptionFGG {

 //verifica id
 if (id == null || !idValido(id))
     throw new ArticuloExceptionFGG("Id null o repetido...");

 this.id = id;
}


/**
* @param nombre, a cambiar.
* Verifica que sea correcto.
* @throws ArticuloExceptionFGG - Si recibe un valor nulo o incorrecto.
*/
public void setNombre(String nombre) throws ArticuloExceptionFGG {

 //verifica nombre
 if (nombre == null || !nombre.matches("^[A-ZÑ][a-zñáéíóú SAUL.]+"))
     throw new ArticuloExceptionFGG("Nombre null o formato no válido...");

 this.nombre = nombre;
}





/**
* @param tipo, a cambiar.
* Verifica que sea correcto.
* @throws ArticuloExceptionFGG - Si recibe un valor nulo.
*/
public void setTipo(estado tipo) throws ArticuloExceptionFGG {

 //verifica tipo
 if (tipo == null)
     throw new ArticuloExceptionFGG("estado null...");

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
* @return tipo
*/
public estado getTipo() {

 return tipo;
}


//MÉTODOS ESTÁNDAR REDEFINIDOS
//****************************

@Override
public String toString() {
 return String.format(
            "Articulo [id=%s, nombre=%s, tipo=%s]", id,
            nombre, tipo);
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
