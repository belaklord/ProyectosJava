package herencia;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class proveedorTest {

	//Datos para las pruebas
	private proveedor p1;
	private proveedor p2;
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	@Before 
	public void creaProveedor() {
		p1 = new proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
							"+034 (968) 123 456", "pepe@gmail.com", 
							new GregorianCalendar()); 
		
		p2 = new proveedor();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borraProveedor() {
		proveedor p1 = null;
		proveedor p2 = null;
	}

	/**
	 * Después de ejecutar el constructor convencional en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorConvencional() {
		assertNotNull(p1);
	}

	/**
	 * Después de ejecutar el constructor por defecto en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorDefecto() {
		assertNotNull(p2);
	}

	/**
	 * Después de ejecutar el constructor copia
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorCopia() {
		proveedor p = new proveedor(p1);
		assertNotNull(p);
	}

	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetNombre() {
		assertNotNull(p1.getNombre());
	}

	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetDireccion() {
		assertNotNull(p1.getDireccion());
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetTelefono() {
		assertNotNull(p1.getTelefono());
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetCorreo() {
		assertNotNull(p1.getCorreo());
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe tener un valor no null en el atributo.
	 */
	@Test
	public void testGetFechaAlta() {
		assertNotNull(p1.getFechaAlta());
	}
	

	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetNombre() {
		p2.setNombre("Pepe López Ruiz");
		assertEquals(p2.getNombre(), "Pepe López Ruiz");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetNombreNull() {
		p2.setNombre(null);	
		assertEquals(p2.getNombre(), "Nombre Apellido Apellido");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetDireccion() {
		p2.setDireccion("C/Luna 27, 30132 Murcia");	
		assertEquals(p2.getDireccion(), "C/Luna 27, 30132 Murcia");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetDireccionNull() {
		p2.setDireccion(null);	
		assertEquals(p2.getDireccion(), "Calle 00, 00000 Poblacion");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetTelefono() {
		p2.setTelefono("+034 (968) 123 456");
		assertEquals(p2.getTelefono(), "+034 (968) 123 456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetTelefonoNull() {
		p2.setTelefono(null);
		assertEquals(p2.getTelefono(), "+034 (968) 000 000");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetCorreo() {
		p2.setCorreo("pepe@gmail.com");	
		assertEquals(p2.getCorreo(), "pepe@gmail.com");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetCorreoNull() {
		p2.setCorreo(null);
		assertEquals(p2.getCorreo(), "correo@correo.com");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testGenerarIdProveedor() {
		p2.setNombre("Pepe López Ruiz");
		p2.setTelefono("+034 (968) 123 456");
		assertEquals(p2.getIdProveedor(),"PEP456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetFechaAlta() {
		Calendar fec = new GregorianCalendar(2015, 4, 22);
		p2.setFechaAlta(fec);	
		assertSame(fec, p2.getFechaAlta());
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetFechaAltaNull() {
		Calendar f = new GregorianCalendar();
		p2.setFechaAlta(null);	
		assertEquals(p2.getFechaAlta().get(Calendar.YEAR), f.get(Calendar.YEAR));
		assertEquals(p2.getFechaAlta().get(Calendar.MONTH), f.get(Calendar.MONTH));
		assertEquals(p2.getFechaAlta().get(Calendar.DAY_OF_MONTH), f.get(Calendar.DAY_OF_MONTH));
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(p1.toString());
	}

}
