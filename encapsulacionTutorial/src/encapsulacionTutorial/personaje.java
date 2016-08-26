package encapsulacionTutorial;

public class personaje {
	
	// si ponemos private en los atributos no podemos acceder a ellos ni modificarlos
	// deberemos hacer los metodos getter y setter //
	
	private int vida;
	private String nombre;
	private String imagen;
	private int posX;
	private int posY;
	
	
	/*
	 * metodo que permite que el usuario pueda cambiar el nombre
	 */
	
	public void cambiarNombre (String nombreNuevo){
		
		 this.nombre = nombreNuevo;
		
		}
	
	/*creamos nuestro constructor, se tiene que llamar
	 * exáctamente igual que la clase y puede haber tantos
	 * como opciones queramos
	 */
	
	public personaje(){
		
		// con el  "this." nos estamos refiriendo
		// a la variable principal de la calse no
		// a la del metodo
		this.vida = 100;
		this.nombre = "jugador";
		imagen = "/home/usuario/imagen.jpg";
		posX = (int) (Math.random()*100);
		posY = (int) (Math.random()*100);
		
	}

	/*
	 * creamos otro constructor para que el usuario
	 * pueda por ejemplo cambiar el nombre al personaje
	 */
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public personaje(String nombre){
		
		
		this.nombre = nombre;
	}
}
