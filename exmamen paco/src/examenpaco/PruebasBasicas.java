package examenpaco;


public interface PruebasBasicas {
	
	
	 /**
     * M�todo que se ejecuta antes de cada @Test para preparar datos de prueba.
     */
    @Before
    void crearObjetosPrueba();


    /**
     * M�todo que se ejecuta despu�s de cada @Test para limpiar datos de prueba.
     */
    @After
    void borrarObjetosPrueba();


    /**
     * Prueba constructor normal con par�metros correctos para los atributos.
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
     * Pruebas para la importaci�n de datos desde un fichero
     */
    @Test
    void testImportarDatos();


}
