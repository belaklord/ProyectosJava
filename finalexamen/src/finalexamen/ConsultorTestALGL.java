package finalexamen;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ConsultorTestALGL implements PruebasBasicas {
	
	
	 //Datos para las pruebas
    private ConsultorALGL e1;
    private ConsultorALGL e2;
    private static DatosALGL datos = DatosALGL.getInstance();
    
    
    /**
     * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
     */
    @Before
   
    public void crearObjetosPrueba() {
        try {
            e1 = new ConsultorALGL("E-255", "Remesa", "A33456755", "+34 (968) 23 11 35", ConsultorALGL.TipoConsultor.EXTERNO);
            e2 = new ConsultorALGL();
        } 
        catch (ConsultorExceptionALGL ex) { }
    }

    /**
     * Método que se ejecuta una sola vez al final de completarse todos los @Test.
     */
    @AfterClass
    public static void cerrarPrueba() {
        datos.cerrarConexiones();
    }
    
  //pruebas CONSTRUCTORES datos CORRECTOS
    //*************************************

    /**
     * Después de ejecutar el constructor convencional en el método @Before,
     * debe haber un objeto construido no null.
     */
    @Test
    
    public void testConstructorNormal() {
        assertNotNull(e1);
    }

/**
     * Después de ejecutar el constructor por defecto en el método @Before
     * debe haber un objeto construido no null.
     */
    @Test
   
    public void testConstructorDefecto() {
        assertNotNull(e2);
    }

/**
     * Después de ejecutar el constructor copia,
     * debe haber un objeto construido no null.
     */
    @Test
   
    public void testConstructorCopia() {
    	ConsultorALGL e = null;
        try {
            e = new ConsultorALGL(e2);
        } 
        catch (ConsultorExceptionALGL ex) { }

        assertNotNull(e);
    }

//pruebas CONSTRUCTORES datos INCORRECTOS
    //***************************************

    /**
     * Después de intentar crear un objeto con valores null,
     * deben producirse ConsultorException, no otras.
     */
    @Test
   
    public void testConstructorNormalIncorrectos() {
        try {
        	ConsultorALGL e = new ConsultorALGL(null, null, null, null, null);
        } 
        catch (ConsultorExceptionALGL ex) {
            assertTrue(true);
        }
    }

/**
     * Después de ejecutar el constructor copia con un objeto null,
     * debe producirse una ConsultorException, no otra.
     */
    @Test
   
    public void testConstructorCopiaIncorrecto() {
        try {
        	ConsultorALGL e = new ConsultorALGL(null);
        } 
        catch (ConsultorExceptionALGL ex) {
            assertTrue(true);
        }
    }


    //pruebas GET...()
    //****************

    /** Una vez inicializado un objeto en el método @Before,
     * debe tener un valor no null en el atributo.
     */
    @Test
    public void testGetNombre() {
        assertNotNull(e1.getNombre());
    }



    //pruebas OTROS MÉTODOS con datos CORRECTOS
    //******************************************

    /**
     * Una vez inicializado un objeto en el método @Before,
     * debe obtenerse un texto como el esperado.
     */
    @Test
    @Override
    public void testToString() {
        assertEquals(e1.toString(),
                     "Empresa [id=E-255, nombre=Remesa, cif=A33456755, telefono=+34 (968) 23 11 35, tipo=OTROS]");
    }

/**
     * Después de dar de alta un objeto en la base de datos,
     * debe obtenerse el objeto al darlo de baja.
     */
    @Test
    @Override
    public void testAltaDatos() {
        try {
            datos.alta(e1);
            assertNotNull(datos.baja(e1.getId()));
        } 
        catch (Exception ex) { }
    }

/**
     * Después de importar dos objetos desde un fichero preparado para la prueba,
     * deben obtenerse los objetos al darlos de baja de la base de datos.
     */
    @Test
    @Override
    public void testImportarDatos() {

        //Preparación fichero con datos de prueba
        File fEmp = new File("fEmp.test");

        try {
            FileOutputStream fo = new FileOutputStream(fEmp);
            ObjectOutputStream osEmpresas = new ObjectOutputStream(fo);

            osEmpresas.writeObject(e1);
            osEmpresas.writeObject(e2);

            osEmpresas.close();
        } 
        catch (FileNotFoundException ex) { }
        catch (IOException ex) { }
        catch (Exception ex) { }

        //Prueba importación
        try {
            datos.importar(fEmp);
            assertNotNull(datos.baja(e1.getId()));
            assertNotNull(datos.baja(e2.getId()));
        } 
        catch (Exception ex) { }
    }


   
    

@Override
public void borrarObjetosPrueba() {
	
	
}

}
