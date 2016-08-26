package personajes;

public class Mago {
	
	
	private int vida = 100;
	private String nombre = "Mentzal";
	private int mana = 120;
	private double ataque = 44.65;
	private double defensa = 50.66;
	
	
	public String toString(){
		
		return "Usuario [\nVida:" + vida + "\n" + "Nombre :" + nombre + "\n" +"Mana:"
                + mana + "\n" + "Ataque:" + ataque + "\n" + "defensa:"
                + defensa + "]";
		
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
	if (vida <=0){
		
		
		this.vida = 0;
	}
		
	else{
		this.vida = vida;
	}
	
	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		
		if(mana<=0){
			
			this.mana = 0;
		}
		
		else{
		this.mana = mana;
		}
	}


	public double getAtaque() {
		return ataque;
	}


	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}


	public double getDefensa() {
		
		
		return defensa;
	}


	public void setDefensa(double defensa) {
		
		if(defensa <=0){
			
			this.defensa = 0;
			
		}
		else{
		this.defensa = defensa;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}