package examenpaco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class DatosFGG implements OperacionesDatos {
	
	  //ATRIBUTOS
    //*********

    private static DatosFGG instance = null;           //Singleton
    private static ObjectContainer db;              //Contenedor de la base de datos.


    //CONSTRUCTORES
    //*************

    /**
     * Constructor por defecto.
     * De uso interno, privado: Singleton.
     * Configura la conexión de base de datos la única vez que se ejecuta.
     */
    private DatosFGG() {
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
        db = Db4oEmbedded.openFile(config, "empresas.db4o");
    }

/**
     * Proporciona acceso a la única instancia de la base de datos.
     * Crea la instancia  sólo la primera vez que se usa.
     */
    public static DatosFGG getInstance() {
        if (instance == null)
            instance = new DatosFGG();
        return instance;
    }


    //OPERACIONES Datos
    //*****************

    /**
     * Alta de una nueva Empresa sin repeticiones según el id.
     * Intenta Obtener el objeto a almacenar.
     * @param obj - Empresa a almacenar.
     * @throws Exception - si ya existe.
     */
    @Override
    public void alta(Object obj) throws Exception {

    	ArticuloFGG e = (ArticuloFGG) obj;

        if (obtener(e.getId()) == null)
            db.store(e);
        else
            throw new Exception("articulo ya existe...");
    }


    /**
     * Incorpora nuevos objetos Empresa a la base de datos a partir de un fichero.
     * @param fDatos - fichero de objetos Empresa serializados.
     * @throws Exception
     */
    @Override
    public void importar(File fDatos) throws Exception {

        //Auxiliar para entrada de datos
    	ArticuloFGG emp = null;

        try {
            FileInputStream fi = new FileInputStream(fDatos);
            ObjectInputStream isEmpresas = new ObjectInputStream(fi);

            do {
                emp = (ArticuloFGG) isEmpresas.readObject();

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
     * Incorpora nuevos objetos Empresa a la base de datos a partir de un fichero.
     * @param fDatos - fichero de objetos Empresa serializados.
     * @throws Exception
     */
    @Override
    public void exportar(File fDatos) throws Exception {

        //Auxiliar para entrada de datos
    	ArticuloFGG emp = null;

        try {
            FileOutputStream fi = new FileOutputStream(fDatos);
            ObjectOutputStream isEmpresas = new ObjectOutputStream(fi);

            do {
                emp = (ArticuloFGG) isEmpresas.readObject();

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
     * Baja de una Empresa dado el id.
     * Intenta Obtener el objeto a dar de baja.
     * @param id - el identificador de la Empresa a eliminar.
     * @return - la Empresa borrada; null si no existe.
     * @throws Exception - si no existe.
     */
    public ArticuloFGG baja(String id) throws Exception {

    	ArticuloFGG e = obtener(id);

        if (e != null)
            db.delete(e);
        else
            throw new Exception("La Empresa no existe...");

        return e;
    }


    /**
     * Cierra la base de datos.
     */
    public void cerrarConexiones() {
        db.close();
    }


}
