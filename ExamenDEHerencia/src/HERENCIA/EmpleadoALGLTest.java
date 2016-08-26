package HERENCIA;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import HERENCIA.PuestoTrabajoALGL.Categoria;

public class EmpleadoALGLTest {

	//Datos para las pruebas
		private EmpleadoALGL e1;
		private EmpleadoALGL e2;
		
		/**
		 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
		 */
		@Before 
		public void creaEmpleado() {
			e1 = new EmpleadoALGL("Pepe López Ruiz", 
					"C/Luna 27, 30132 Murcia", 
					"+034 (968) 123 456", 
					"pepe@gmail.com", 
					new GregorianCalendar(2015, 4, 22)); 
					
			
			e2 = new EmpleadoALGL();
		}

		/**
		 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
		 */
		@After	
		public void borraEmpledo() {
			EmpleadoALGL e1 = null;
			EmpleadoALGL e2 = null;
		}

		/**
		 * Después de ejecutar el constructor convencional en el método @Before 
		 * debe haber un objeto construido no null.
		 */
		@Test
		public void testEmpleadoConvencional() {
			assertNotNull(e1);
		}

		/**
		 * Después de ejecutar el constructor por defecto en el método @Before 
		 * debe haber un objeto construido no null.
		 */
		@Test
		public void testEmpleadoDefecto() {
			assertNotNull(e2);
		}

		/**
		 * Después de ejecutar el constructor copia
		 * debe haber un objeto construido no null.
		 */
		@Test
		public void testEmpleadoCopia() {
			EmpleadoALGL p = new EmpleadoALGL(e1);
			assertNotNull(p);
		}

		/**
		 * Una vez inicializado un objeto en el método @Before 
		 * debe tener un valor no null en el atributo.
		 */
		@Test
		public void testGetNombre() {
			assertNotNull(e1.getNombre());
		}

		/**
		 * Una vez inicializado un objeto en el método @Before 
		 * debe tener un valor no null en el atributo.
		 */
		@Test
		public void testGetDireccion() {
			assertNotNull(e1.getDireccion());
		}
		
		/**
		 * Una vez inicializado un objeto en el método @Before 
		 * debe tener un valor no null en el atributo.
		 */
		@Test
		public void testGetTelefono() {
			assertNotNull(e1.getTelefono());
		}
		
		/**
		 * Una vez inicializado un objeto en el método @Before 
		 * debe tener un valor no null en el atributo.
		 */
		@Test
		public void testGetCorreo() {
			assertNotNull(e1.getCorreo());
		}
		
		/**
		 * Una vez inicializado un objeto en el método @Before 
		 * debe tener un valor no null en el atributo.
		 */
		@Test
		public void testGetFechaAlta() {
			assertNotNull(e1.getFechaAlta());
		}
		

		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * debe coincidir: el valor del atributo con el valor modificado.
		 */
		@Test
		public void testSetNombre() {
			e2.setNombre("Pepe López Ruiz");
			assertEquals(e2.getNombre(), "Pepe López Ruiz");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * al intentar cambiar a un valor no válido, 
		 * debe coincidir: el valor del atributo con el valor por defecto.
		 */
		@Test
		public void testSetNombreNull() {
			e2.setNombre(null);	
			assertEquals(e2.getNombre(), "Pepe López Ruiz");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * debe coincidir: el valor del atributo con el valor modificado.
		 */
		@Test
		public void testSetDireccion() {
			e2.setDireccion("C/Luna 27, 30132 Murcia");	
			assertEquals(e2.getDireccion(), "C/Luna 27, 30132 Murcia");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * al intentar cambiar a un valor no válido, 
		 * debe coincidir: el valor del atributo con el valor por defecto.
		 */
		@Test
		public void testSetDireccionNull() {
			e2.setDireccion(null);	
			assertEquals(e2.getDireccion(), "Calle nada, 00000 Poblacion");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * debe coincidir: el valor del atributo con el valor modificado.
		 */
		@Test
		public void testSetTelefono() {
			e2.setTelefono("+034 (968) 123 456");
			assertEquals(e2.getTelefono(), "+034 (968) 123 456");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * al intentar cambiar a un valor no válido, 
		 * debe coincidir: el valor del atributo con el valor por defecto.
		 */
		@Test
		public void testSetTelefonoNull() {
			e2.setTelefono(null);
			assertEquals(e2.getTelefono(), "+034 (968) 000 000");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * debe coincidir: el valor del atributo con el valor modificado.
		 */
		@Test
		public void testSetCorreo() {
			e2.setCorreo("pepe@gmail.com");	
			assertEquals(e2.getCorreo(), "pepe@gmail.com");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * al intentar cambiar a un valor no válido, 
		 * debe coincidir: el valor del atributo con el valor por defecto.
		 */
		@Test
		public void testSetCorreoNull() {
			e2.setCorreo(null);
			assertEquals(e2.getCorreo(), "correo@correo.com");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * debe coincidir: el valor del atributo con el valor modificado.
		 */
		@Test
		public void testGenerarIdEmpleado() {
			e2.setCorreo("pepe@gmail.com");
			e2.setFechaAlta(new GregorianCalendar(2015, 4, 17));
			assertEquals(e2.getIdEmpleado(), "PEPE*17");
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * debe coincidir: el valor del atributo con el valor modificado.
		 */
		@Test
		public void testSetFechaAlta() {
			Calendar fec = new GregorianCalendar(2015, 4, 22);
			e2.setFechaAlta(fec);	
			assertSame(fec, e2.getFechaAlta());
		}
		
		/**
		 * Una vez se tiene un objeto, creado en el método @Before, 
		 * al intentar cambiar a un valor no válido, 
		 * debe coincidir: el valor del atributo con el valor por defecto.
		 */
		@Test
		public void testSetFechaAltaNull() {
			Calendar f = new GregorianCalendar();
			e2.setFechaAlta(null);	
			assertEquals(e2.getFechaAlta().get(Calendar.YEAR), f.get(Calendar.YEAR));
			assertEquals(e2.getFechaAlta().get(Calendar.MONTH), f.get(Calendar.MONTH));
			assertEquals(e2.getFechaAlta().get(Calendar.DAY_OF_MONTH), f.get(Calendar.DAY_OF_MONTH));
		}
		
		/**
		 * Una vez inicializado un objeto en el método @Before 
		 * debe obtenerse un texto como el esperado.
		 */
		@Test
		public void testToString() {
			assertNotNull(e1.toString());
		}


}
