package visuales;
import javax.swing.*;
public class ventanas {
	public static void main (String []args){
		
		String paises [] = new String [5];
		
		
		for (int i = 0; i<paises.length; i++ ){
			
			
			paises [i] =  JOptionPane.showInputDialog ("introduce pais" + i);
			
			
		}
		
		
		
		
	}

}
