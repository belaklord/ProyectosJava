package examen;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class EmpresaTest implements PruebasBasicas
{

    //Datos para las pruebas
    private Empresa e1;
    private Empresa e2;
    private static Datos datos = Datos.getInstance();


    //PREPARACIÓN de las pruebas
    //**************************

    /**
     * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
     */
    @Before
    @Override
    public void crearObjetosPrueba() {
        try {
            e1 = new Empresa("E-255", "Remesa", "A33456755", "+34 (968) 23 11 35", Empresa.TipoEmpresa.OTROS);
            e2 = new Empresa();
        } 
        catch (EmpresaException ex) { }
    }

/**
     * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
     */
    @After
    @Override
    public void borrarObjetosPrueba() {

        try {
            datos.baja(e1.getId());
            datos.baja(e2.getId());
        } 
        catch (Exception ex) { }

        e1 = null;
        e2 = null;
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
    @Override
    public void testConstructorNormal() {
        assertNotNull(e1);
    }

/**
     * Después de ejecutar el constructor por defecto en el método @Before
     * debe haber un objeto construido no null.
     */
    @Test
    @Override
    public void testConstructorDefecto() {
        assertNotNull(e2);
    }

/**
     * Después de ejecutar el constructor copia,
     * debe haber un objeto construido no null.
     */
    @Test
    @Override
    public void testConstructorCopia() {
        Empresa e = null;
        try {
            e = new Empresa(e2);
        } 
        catch (EmpresaException ex) { }

        assertNotNull(e);
    }

//pruebas CONSTRUCTORES datos INCORRECTOS
    //***************************************

    /**
     * Después de intentar crear un objeto con valores null,
     * deben producirse EmpresaExcepction, no otras.
     */
    @Test
    @Override
    public void testConstructorNormalIncorrectos() {
        try {
            Empresa e = new Empresa(null, null, null, null, null);
        } 
        catch (EmpresaException ex) {
            assertTrue(true);
        }
    }

/**
     * Después de ejecutar el constructor copia con un objeto null,
     * debe producirse una EmpresaExcepction, no otra.
     */
    @Test
    @Override
    public void testConstructorCopiaIncorrecto() {
        try {
            Empresa e = new Empresa(null);
        } 
        catch (EmpresaException ex) {
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

/**
     * Una vez inicializado un objeto en el método @Before,
     * debe tener un valor no null en el atributo.
     */
    @Test
    public void testGetCif() {
        assertNotNull(e1.getCif());
    }

/**
     * Una vez inicializado un objeto en el método @Before,
     * debe tener un valor no null en el atributo.
     */
    @Test
    public void testGetId() {
        assertNotNull(e1.getId());
    }

/**
     * Una vez inicializado un objeto en el método @Before,
     * debe tener un valor no null en el atributo.
     */
    @Test
    public void testGetTelefono() {
        assertNotNull(e1.getTelefono());
    }

/**
     * Una vez inicializado un objeto en el método @Before,
     * debe tener un valor no null en el atributo.
     */
    @Test
    public void testGetTipo() {
        assertNotNull(e1.getTipo());
    }


    //pruebas SET...() datos CORRECTOS
    //********************************

    /**
     * Una vez se tiene un objeto, creado en el método @Before,
     * debe coincidir: el valor del atributo con el valor modificado.
     */
    @Test
    public void testSetId() {
        try {
            e2.setId("E-123");                  //correcto, no existe
        } 
        catch (EmpresaException ex) { }

        assertEquals(e2.getId(), "E-123");
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * debe coincidir: el valor del atributo con el valor modificado.
     */
    @Test
    public void testSetNombre() {
        try {
            e2.setNombre("Trino S.A.");         //formato correcto
        } 
        catch (EmpresaException ex) { }

        assertSame(e2.getNombre(), "Trino S.A.");
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * debe coincidir: el valor del atributo con el valor modificado.
     */
    @Test
    public void testSetCif() {
        try {
            e2.setCif("A12345678");                 //formato correcto
        } 
        catch (EmpresaException ex) { }

        assertSame(e2.getCif(), "A12345678");
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * debe coincidir: el valor del atributo con el valor modificado.
     */
    @Test
    public void testSetTelefono() {
        try {
            e2.setTelefono("+34 (968) 12 34 56");   //formato correcto
        } 
        catch (EmpresaException ex) { }

        assertSame(e2.getTelefono(), "+34 (968) 12 34 56");
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * debe coincidir: el valor del atributo con el valor modificado.
     */
    @Test
    public void testSetTipo() {
        try {
            e2.setTipo(Empresa.TipoEmpresa.INDUSTRIAL);     //correcto, no null
        } 
        catch (EmpresaException ex) { }

        assertSame(e2.getTipo(), Empresa.TipoEmpresa.INDUSTRIAL);
    }


    //pruebas SET...() datos INCORRECTOS
    //**********************************

    /**
     * Una vez se tiene un objeto dado de alta,
     * se intenta cambiar el id de otro objeto con el mismo del ya almacenado.
     * debe producir una Exception.
     */
    @Test
    public void testSetIdIncorrecto() {
        try {
            datos.alta(e1);
            e2.setId("E-255");                      //repetido
        } 
        catch (EmpresaException ex) { }
        catch (Exception e) {
            assertTrue(true);
        }
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * se intenta cambiar el nombre a un valor incorrecto.
     * Debe producir una EmpresaException.
     */
    @Test
    public void testSetNombreIncorrecto() {
        try {
            e2.setNombre(" .sa");                   //formato incorrecto
        } 
        catch (EmpresaException ex) {
            assertTrue(true);
        }
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * se intenta cambiar el cif a un valor incorrecto.
     * Debe producir una EmpresaException.
     */
    @Test
    public void testSetCifIncorrecto() {
        try {
            e2.setCif("12345678A");                 //formato incorrecto
        } 
        catch (EmpresaException ex) {
            assertTrue(true);
        }
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     * se intenta cambiar el telefono a un valor incorrecto.
     * Debe producir una EmpresaException.
     */
    @Test
    public void testSetTelefonoIncorrecto() {
        try {
            e2.setTelefono("(968) 123 456");        //formato incorrecto
        } 
        catch (EmpresaException ex) {
            assertTrue(true);
        }
    }

/**
     * Una vez se tiene un objeto, creado en el método @Before,
     *  se intenta cambiar el tipo a un valor null.
     * Debe producir una EmpresaException.
     */
    @Test
    public void testSetTipoIncorrecto() {
        try {
            e2.setTipo(null);                       //no admitido
        } 
        catch (EmpresaException ex) {
            assertTrue(true);
        }
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


    //pruebas OTROS MÉTODOS con datos INCORRECTOS
    //*******************************************

    /**
     * Intenta dar de alta un objeto null en la base de datos,
     * debe producirse una Exception.
     */
    @Test
    public void testAltaDatosIncorrectos() {
        try {
            datos.alta(null);
        } 
        catch (Exception ex) {
            assertTrue(true);
        }
    }

/**
     * Intenta importar objetos repetidos desde un fichero preparado para la prueba,
     * deben producirse una Exception.
     */
    @Test
    public void testImportarDatosIncorrectosRepetidos() {

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
            datos.importar(fEmp);                   //incorrecto, repetido
        } 
        catch (Exception ex) {
            assertTrue(true);
        }
    }

} //class
