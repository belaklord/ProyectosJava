package ej7;

/**
 * Un Punto del plano se representa con un par de coordenadas x e y (números reales) 
 * de un sistema de referencia cartesiano.
 */


public class Punto {
	
	//Atributos
	//*********
	
	private double x;
	private double y;

	
	//Métodos constructores
	//*********************
	
	/**
	 * Constructor convencional.
	 * Establece el valor inicial de cada uno de los atributos.
	 * Recibe parámetros que se corresponden con los atributos.  
	 * @param x - coordenada.
	 * @param y - coordenada.
	 */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Constructor por defecto.
	 * Establece el valor inicial, por defecto, de cada uno de los atributos.
	 * Llama al constructor convencional. 
	 */
	public Punto() {
		this(0, 0);
		
	}
	
	/**
	 * Constructor copia.
	 * Establece el valor inicial de cada uno de los atributos a partir de
	 * los valores obtenidos de un objeto de su misma clase.
	 * Llama al constructor convencional.
	 * @param p - el punto a clonar
	 */
	public Punto(Punto p) {
		this(p.x, p.y);
		
	}


	//Métodos de acceso
	//*****************
	
	/**
	 * Obtiene el valor de la coordenada X del punto.
	 * @return - coordenada x
	 */
	public double getX() {
		return x;
	}


	/**
	 * Obtiene el valor de la coordenada Y del punto.
	 * @return - coordenada y
	 */
	public double getY() {
		return y;
	}
	
	
	/**
	 * Permite cambiar el valor de la coordenada X del punto.
	 * @param x - coordenada
	 */
	public void setX(double x) {
		this.x = x;
	}


	/**
	 * Permite cambiar el valor de la coordenada Y del punto.
	 * @param y - coordenada
	 */
	public void setY(double y) {
		this.y = y;
	}


	//Métodos redefinidos
	//*******************
	
	@Override
	public String toString() {
		return String.format("Punto [x=%s, y=%s]", x, y);
	}

	
	
} // class
