package metodos;
import java.util.Scanner;
public class examenSimulacroMetodos {

	public static void main(String []args){
		
		
		barraHorizontal ();
		
		
		}
		
		
		
		  static void  barraHorizontal (){
			int numero;
			String positivo;
			String negativo;
			String barra = "||";
			String espacio = "          ";
			
			
		Scanner S = new Scanner (System.in);		
		System.out.println("introduce numero");
			numero = S. nextInt();
		
		if (numero >0 && numero <=10){
			
			positivo = positivos (numero);
			
		}
			if (numero <0 && numero >= -10 ){
				
					negativo =   negativoBlanco (numero) +  negativoAsterisco (numero);
			
			}
			if (numero == 0){
				
				System.out.print(espacio + barra);
				
			}
			
			
				if (numero <-10 || numero >10){
				
							error(numero);
					}
			

			
		}
		
					static String positivos (int numero){
				
					String espacios = "          ";
					String asterisco = "*";
					String barra = "||";
					
					System.out.print(espacios);
					
					System.out.print(barra);
					
					while (numero >0 && numero <=10){
						
						System.out.print(asterisco);
						
								numero --;
					}
					
					return  asterisco;
					
	}
				
				static String negativoBlanco (int numero){
					
					String espacio = " ";
					while (numero <0 && numero > -10){
						
						
						System.out.print(espacio);
						
								numero --;
						
					}
					return espacio;
				}
				
				static String negativoAsterisco (int numero){
					
					String barra = "||";
					String asterisco = "*";
						
					while (numero <0 && numero >= -10){
						
						System.out.print(asterisco);
						
								numero++;
					}
					System.out.print(barra);
					return asterisco;
				}
			
				static int error (int numero){
					
					
					
					if (numero >10 || numero <-10){
						
						System.out.println("error introduce numeros entre el -10 y el 10");
					}
					
					
					return numero;
				}
				
				
	}
