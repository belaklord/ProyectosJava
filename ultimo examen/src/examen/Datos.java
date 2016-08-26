package examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;

public class Datos implements OperacionesDatos
{

    //ATRIBUTOS
    //*********

    private static Datos instance = null;           //Singleton
    private static ObjectContainer db;              //Contenedor de la base de datos.


    //CONSTRUCTORES
    //*************

    /**
     * Constructor por defecto.
     * De uso interno, privado: Singleton.
     * Configura la conexión de base de datos la única vez que se ejecuta.
     */
    private Datos() {
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
    public static Datos getInstance() {
        if (instance == null)
            instance = new Datos();
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

        Empresa e = (Empresa) obj;

        if (obtener(e.getId()) == null)
            db.store(e);
        else
            throw new Exception("La Empresa ya existe...");
    }


    /**
     * Incorpora nuevos objetos Empresa a la base de datos a partir de un fichero.
     * @param fDatos - fichero de objetos Empresa serializados.
     * @throws Exception
     */
    @Override
    public void importar(File fDatos) throws Exception {

        //Auxiliar para entrada de datos
        Empresa emp = null;

        try {
            FileInputStream fi = new FileInputStream(fDatos);
            ObjectInputStream isEmpresas = new ObjectInputStream(fi);

            do {
                emp = (Empresa) isEmpresas.readObject();

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
     * Obtiene una Empresa dado su identificador.
     * @param id - el identificador de la Empresa a recuperar.
     * @return - la Empresa encontrada; null si no existe.
     */
    public Empresa obtener(String id) {

        ObjectSet<Empresa>  result;
        Query consulta = db.query();

        consulta.constrain(Empresa.class);
        consulta.descend("id").constrain(id);

        result = consulta.execute();

        if (result.size() > 0)
            return result.get(0);
        else
            return null;
    }


    /**
     * Baja de una Empresa dado el id.
     * Intenta Obtener el objeto a dar de baja.
     * @param id - el identificador de la Empresa a eliminar.
     * @return - la Empresa borrada; null si no existe.
     * @throws Exception - si no existe.
     */
    public Empresa baja(String id) throws Exception {

        Empresa e = obtener(id);

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


} //class
