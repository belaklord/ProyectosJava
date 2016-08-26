/**
 * Clase para la prueba de las características de la clase Punto
 */

package test;

import ej7.Punto;


public class PuntoTest {

	/**
	 * Coordina todas las pruebas de la clase
	 */
	public PuntoTest() {
		
		//Prueba constructores
		testConstructores();
		
		//Prueba métodos get
		testGet();
		
		//Prueba métodos set
		testSet();
		
		//Prueba métodos redefinidos
		testToString();
	}

	
	/**
	 * Prueba constructores creando un objeto con cada una de las variantes sin errore. 
	 */
	public void testConstructores() {
		
		System.out.println("Prueba constructores...\n");
		
		Punto p1 = new Punto();
		Punto p2 = new Punto(2,3);
		Punto p3 = new Punto(p2);
		
		System.out.println("Defecto p1: " + p1);
		System.out.println("Convencional p2: " + p2);
		System.out.println("Copia p3: " + p3);
	}
	
	
	/**
	 * Prueba get...() creando un objeto y comprobando que los 
	 * valores obtenidos coinciden con los utilizados al crear el objeto.
	 */
	public void testGet() {
		
		System.out.println("\nPrueba métodos get...\n");
		
		Punto p = new Punto(2,3);
				
		System.out.println("X: " + p.getX());
		System.out.println("Y: " + p.getY());	
	}

	
	/**
	 * Prueba set...() creando un objeto y comprobando que los atributos
	 * cambian a los valores utilizados en la llamada a los métodos.
	 */
	public void testSet() {
		
		System.out.println("\nPrueba métodos set...\n");
		
		Punto p = new Punto();
	
		System.out.println("Antes...");
		System.out.println("X: " + p.getX());
		System.out.println("Y: " + p.getY());
		
		p.setX(4);
		p.setY(5);
		
		System.out.println("\nDespués...");
		System.out.println("X: " + p.getX());
		System.out.println("Y: " + p.getY());	
	}
	
	
	/**
	 * Prueba toString() creando un objeto y comprobando que se convierte
	 * en texto según lo previsto.
	 */
	public void testToString() {
		
		System.out.println("\nPrueba método toString...\n");
		
		Punto p = new Punto(3,5);
	
		System.out.println(p);	
	}
	
	
} //class
