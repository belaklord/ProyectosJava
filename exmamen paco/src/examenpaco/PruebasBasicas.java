package examenpaco;


public interface PruebasBasicas {
	
	
	 /**
     * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
     */
    @Before
    void crearObjetosPrueba();


    /**
     * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
     */
    @After
    void borrarObjetosPrueba();


    /**
     * Prueba constructor normal con parámetros correctos para los atributos.
     */
    @Test
    void testConstructorNormal();


    /**
     * Prueba constructor normal con datos incorrectos para los atributos.
     */
    @Test
    void testConstructorNormalIncorrectos();


    /**
     * Prueba constructor por defecto
     */
    @Test
    void testConstructorDefecto();


    /**
     * Prueba constructor copia con objeto correcto
     */
    @Test
    void testConstructorCopia();


    /**
     * Prueba constructor copia con objeto incorrecto
     */
    @Test
    void testConstructorCopiaIncorrecto();


    /**
     * Prueba de salida con toString()
     */
    @Test
    void testToString();


    /**
     * Pruebas para alta de un objeto en la base de datos.
     */
    @Test
    void testAltaDatos();


    /**
     * Pruebas para la importación de datos desde un fichero
     */
    @Test
    void testImportarDatos();


}
