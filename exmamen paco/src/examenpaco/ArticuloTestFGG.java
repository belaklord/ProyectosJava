package examenpaco;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ArticuloTestFGG implements PruebasBasicas {


	 //Datos para las pruebas
   private ArticuloFGG e1;
   private ArticuloFGG e2;
   private static DatosFGG datos = DatosFGG.getInstance();
   
   
   /**
    * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
    */
   @Before
  
   public void crearObjetosPrueba() {
       try {
           e1 = new ArticuloFGG("E-255", "pepe", ArticuloFGG.estado.DISPONIBLE);
           e2 = new ArticuloFGG();
       } 
       catch (ArticuloExceptionFGG ex) { }
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
	   ArticuloFGG e = null;
       try {
           e = new ArticuloFGG(e2);
       } 
       catch (ArticuloExceptionFGG ex) { }

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
    	   ArticuloFGG e = new ArticuloFGG(null, null, null, null, null);
       } 
       catch (ArticuloExceptionFGG ex) {
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
    	   ArticuloFGG e = new ArticuloFGG(null);
       } 
       catch (ArticuloExceptionFGG ex) {
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
                    "Empresa [id=E-255, nombre=pepe, tipo=DISPONIBLE]");
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


}
