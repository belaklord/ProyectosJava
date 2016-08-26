package finalexamen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;





public class DatosALGL implements OperacionesDatos {
	

	    //ATRIBUTOS
	    //*********

	    private static DatosALGL instance = null;           //Singleton
	    private static ObjectContainer db;              //Contenedor de la base de datos.


	    //CONSTRUCTORES
	    //*************

	    /**
	     * Constructor por defecto.
	     * De uso interno, privado: Singleton.
	     * Configura la conexión de base de datos la única vez que se ejecuta.
	     */
	    private DatosALGL() {
	        if (instance == null) {
	            configurarConexion();
	        }
	    }

	/**
	     * Configura los detalles de la conexión de base de datos.
	     * De uso interno, privado: Singleton.
	     */
	    private void configurarConexion() {
	        EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
	        db = Db4oEmbedded.openFile(config, "consultores.db4o");
	    }

	/**
	     * Proporciona acceso a la única instancia de la base de datos.
	     * Crea la instancia  sólo la primera vez que se usa.
	     */
	    public static DatosALGL getInstance() {
	        if (instance == null)
	            instance = new DatosALGL();
	        return instance;
	    }


	    //OPERACIONES Datos
	    //*****************

	    /**
	     * Alta de una nuevo Consultor sin repeticiones según el id.
	     * Intenta Obtener el objeto a almacenar.
	     * @param obj - Consultor a almacenar.
	     * @throws Exception - si ya existe.
	     */
	    @Override
	    public void alta(Object obj) throws Exception {

	        ConsultorALGL e = (ConsultorALGL) obj;

	        if (obtener(e.getId()) == null)
	            db.store(e);
	        else
	            throw new Exception("La Empresa ya existe...");
	    }

	    /**
	     * Baja de un Consultor dado el id.
	     * Intenta Obtener el objeto a dar de baja.
	     * @param id - el identificador del Consultor a eliminar.
	     * @return - el consultor borrada; null si no existe.
	     * @throws Exception - si no existe.
	     */
	    public ConsultorALGL baja(String id) throws Exception {

	    	ConsultorALGL e = obtener(id);

	        if (e != null)
	            db.delete(e);
	        else
	            throw new Exception("La Empresa no existe...");

	        return e;
	    }
	    
	    
	    public void importar(File fDatos) throws Exception {

	        //Auxiliar para entrada de datos
	    	ConsultorALGL emp = null;

	        try {
	            FileInputStream fi = new FileInputStream(fDatos);
	            ObjectInputStream isEmpresas = new ObjectInputStream(fi);

	            do {
	                emp = (ConsultorALGL) isEmpresas.readObject();

	                if (emp == null) break;

	                alta(emp);

	            } while (true);

	            isEmpresas.close();
	        } 
	        catch (ClassNotFoundException ex) { }
	        catch (FileNotFoundException ex) { }
	        catch (IOException ex) { }
	        catch (Exception ex) { }
	    }


	    /**
	     * Obtiene un consultor dado su identificador.
	     * @param id - el identificador del consultor a recuperar.
	     * @return - el consultor encontrada; null si no existe.
	     */
	    public ConsultorALGL obtener(String id) {

	        ObjectSet<ConsultorALGL>  result;
	        Query consulta = db.query();

	        consulta.constrain(ConsultorALGL.class);
	        consulta.descend("id").constrain(id);

	        result = consulta.execute();

	        if (result.size() > 0)
	            return result.get(0);
	        else
	            return null;
	    }



	    /**
	     * Cierra la base de datos.
	     */
	    public void cerrarConexiones() {
	        db.close();
	    }

		@Override
		public void backup() throws Exception {
			
			
		}


	} //class

