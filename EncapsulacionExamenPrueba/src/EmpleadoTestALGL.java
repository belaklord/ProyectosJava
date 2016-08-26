
public class EmpleadoTestALGL {
	
	
	
	
	/* 
	 * metodo que coordina todas las pruebas de  ESTA CLASE la clase
	 */
	
	public EmpleadoTestALGL(){
		
		TestConstructores();
		TestGet();
		testSet();
		testString();
	}
	
	
	/*
	 * metodo que crea un objeto con cada una de las variantes
	 * que hemos implementado en la clase EmpleadoALGL
	 */
	
	public void TestConstructores(){
		
		EmpleadoALGL empleado1 = new EmpleadoALGL();
		EmpleadoALGL empleado2 = new EmpleadoALGL("antonio", 23, 123.34, new PuestoTrabajoALGL());
		// establece como atributios iniciales los atributos de otro objeto creado, en este caso "empleado 2"
		EmpleadoALGL empleado3 = new EmpleadoALGL(empleado2);
		
		
		System.out.println("por defecto : " + empleado1);
		System.out.println("convencional : " + empleado2);
		System.out.println("copia de p2 :" + empleado3);
		
	}
	
	/**
	 * Prueba get...() creando un objeto y comprobando que los 
	 * valores obtenidos coinciden con los utilizados al crear el objeto.
	 */
	
	
	public void TestGet(){
		
		System.out.println("\nPrueba metodos get....\n");
		
		// creamos un objeto //
		
		EmpleadoALGL empleado1 = new EmpleadoALGL("antonio", 23, 123.34, new PuestoTrabajoALGL());
		
		System.out.println("nombre : " + empleado1.getNombre());
		System.out.println("edad : " + empleado1.getEdad());
		System.out.println("salario : " + empleado1.getSueldo());
		System.out.println("puesto : " + empleado1.getPuesto());
	}
	
	
	/**
	 * Prueba set...() creando un objeto y comprobando que los atributos
	 * cambian a los valores utilizados en la llamada a los métodos.
	 */
	
	public void testSet(){
		
		System.out.println("\nPrueba métodos set...\n");
		
		
		EmpleadoALGL empleado1 = new EmpleadoALGL();
		
		System.out.println("antes.........");
		
		System.out.println("nombre : " + empleado1.getNombre());
		System.out.println("edad : " + empleado1.getEdad());
		System.out.println("salario : " + empleado1.getSueldo());
		System.out.println("puesto : " + empleado1.getPuesto());
		
		
		empleado1.setNombre("juan");
		empleado1.setEdad(44);
		empleado1.setSueldo(444.32);
		empleado1.setPuesto(new PuestoTrabajoALGL());
		
		
		System.out.println("\nDespués...");
		
		System.out.println("nombre : " + empleado1.getNombre());
		System.out.println("edad : " + empleado1.getEdad());
		System.out.println("salario : " + empleado1.getSueldo());
		System.out.println("puesto : " + empleado1.getPuesto());
		
		
	}
	
	
	/**
	 * Prueba toString() creando un objeto y comprobando que se convierte
	 * en texto según lo previsto.
	 */
	
	
	public void testString(){
		
		System.out.println("\nPrueba método toString...\n");
		
		EmpleadoALGL empleado1 = new EmpleadoALGL("antonio", 23, 123.34, new PuestoTrabajoALGL());
		
		System.out.println(empleado1);
		
		
		
		
	}
	
	
	
	
	
	
}
