package provisional;
import provisional.nodoDatos;
import provisional.Usuario;



public class datosNodos {
	
	
	
	public static nodoDatos primero;
	public static nodoDatos ultimo;
	public static int numElementos;
	public static int medio;
	public  static int tamaño;
	
	
	
	
	public  datosNodos(){
		
		this.primero = null;
		this.ultimo = null;
		this.medio = 0;
		this.numElementos = 0;
	
	}
	
	
	public static boolean isEmpty()
	{
		return (primero == null || tamaño == 0)?true:false;
	}
	public Object eliminarUltimo(){
		
		
		Object dato = ultimo.dato;
		
		ultimo = ultimo.anterior;
		
		if(ultimo != null){
			
			ultimo.siguiente = (null);
			numElementos --;
		}
		
		else {
			
			primero = null;
			
		}
		return dato;
	}
	
	public  void setmedio(){
		
		this.medio = tamaño/2;
		
	}
	
	public static void insertarInicio(Object usr){
		
		

		if(isEmpty())
		{
			primero = new nodoDatos(usr);
			ultimo = primero;
		}
		else
		{
			nodoDatos temp = primero;
			nodoDatos nuevo = new nodoDatos(usr);
			nuevo.setSiguiente(temp);
			primero = nuevo;
			temp.setAnterior(nuevo); //enlace doble
		}
		tamaño++;
		
	}
	
	public static void MostrarAdelante(){
		
		int contador = 0;
		if (!isEmpty()){
		nodoDatos tmp =  primero;
		
	while(tmp != null){
		
		System.out.println(tmp.getValor());
		
		
		tmp = tmp.getSiguiente();
		contador ++;
		
	}
	
		}
		
	}
		
	
	
	

}
