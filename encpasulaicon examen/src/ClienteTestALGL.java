
public class ClienteTestALGL {


	/* 
	 * metodo que coordina todas las pruebas de la clase
	 */
	
	
	public ClienteTestALGL(){
		
		TestConstructores();
		TestGet();
		testSet();
		testString();
		
		
	}
	
	/*
	 * metodo que crea un objeto con cada una de las variantes
	 * que hemos implementado en la clase ClienteALGL
	 */
	
	
public void TestConstructores(){
		
		ClienteALGL cliente1 = new ClienteALGL();
		ClienteALGL cliente2 = new ClienteALGL("pepe.SL", "1999293-k","0000000000","c/cacca n23 3f", new TipoEmpresa());
		
		// establece como atributios iniciales los atributos de otro objeto creado, en este caso "cliente 2" //
		
		ClienteALGL cliente3 = new ClienteALGL(cliente2);
		
		
		System.out.println("por defecto : " + cliente1);
		System.out.println("convencional : " + cliente2);
		System.out.println("copia de p2 :" + cliente3);
		
	}

/**
 * Prueba get...() creando un objeto y comprobando que los 
 * valores obtenidos coinciden con los utilizados al crear el objeto.
 */


public void TestGet(){
	
	System.out.println("\nPrueba metodos get....\n");
	
	// creamos un objeto //
	
	ClienteALGL cliente1 = new ClienteALGL("pepe.SL","99999999", "1999293-k","c/cacca n23 3f", new TipoEmpresa());
	
	System.out.println("nombre : " + cliente1.getNombreEmpresa());
	System.out.println("cif : " + cliente1.getCif());
	System.out.println("domicilio : " + cliente1.getDomicilio());
	System.out.println("telefono : " + cliente1.getTelefono());
	System.out.println("Empresa : " + cliente1.getEmpresa());
}
	


/**
 * Prueba set...() creando un objeto y comprobando que los atributos
 * cambian.
 */

public void testSet(){
	
	System.out.println("\nPrueba metodos set...\n");
	
	
	ClienteALGL cliente1 = new ClienteALGL();
	
	System.out.println("antes.........");
	
	System.out.println("nombre : " + cliente1.getNombreEmpresa());
	System.out.println("cif : " + cliente1.getCif());
	System.out.println("domicilio : " + cliente1.getDomicilio());
	System.out.println("telefono : " + cliente1.getTelefono());
	System.out.println("empresa : " + cliente1.getEmpresa());
	
	cliente1.setNombreEmpresa("juan.SL");
	cliente1.setCif("555532-k");
	cliente1.setDomicilio("c/pelusa, n34 4t");
	cliente1.setTelefono("98756475634");
	cliente1.setEmpresa(new TipoEmpresa());
	
	
	System.out.println("\nDespues...");
	
	System.out.println("nombre : " + cliente1.getNombreEmpresa());
	System.out.println("cif : " + cliente1.getCif());
	System.out.println("domicilio : " + cliente1.getDomicilio());
	System.out.println("telefono : " + cliente1.getTelefono());
	System.out.println("Empresa : " + cliente1.getEmpresa());
	
}



/**
 * Prueba toString() creando un objeto y comprobando que se convierte
 * en texto.
 */





public void testString(){
	
	System.out.println("\nPrueba metodo toString...\n");
	
	ClienteALGL empleado1 = new ClienteALGL("antonio.sl", "777685-l", "c/kechup n34 4r","98766654323", new TipoEmpresa());
	
	System.out.println(empleado1);
	
	
	
	
}











}
