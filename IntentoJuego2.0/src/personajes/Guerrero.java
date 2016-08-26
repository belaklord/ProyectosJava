package personajes;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class Guerrero {
	
	
	private int vida = 120;
	private String nombre = "Belaklord";
	private int mana = 70;
	private double ataque = 35.60;
	private double defensa = 50.70;
	
	
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


	public String toString(){
		
		return String.format ( "Usuario [\nVida:" + vida + "\n" + "Nombre :" + nombre + "\n" +"Mana:"
                + mana + "\n" + "Ataque:" + ataque + "\n" + "defensa:"
                + defensa + "]");
		
	}


	
	
	
	
	

}
