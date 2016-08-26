package caca;

import java.util.Scanner;

public class caca {
	
	
	
	
	public static void main (String []args){
		
		int salario;
		int SalarioDescontado;
		
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("nombre");
		
		String nombre = S. nextLine();
		
		
		
		System.out.println("apellido1");
		
		String apellido1 =  S. nextLine();
		
		System.out.println("apellido2");
		
		String apellido2 = S. nextLine();
		
		
		System.out.println("salario bruto mensual");
		
		 salario = S.nextInt();
		
		
		 int SS;
		 SS  = (salario*10)/100;

		 int irpf;
		 irpf = (salario*20)/100;

		 	
		 SalarioDescontado = salario-SS-irpf;	
		
		
		
		
		System.out.println("Apellido y nombre: " +"  " + apellido1+ "  " + apellido2 +"  " + nombre + "\nSalarioBruto:" +" " +salario + "Euros"+ " "+ "\nRetencionesSS: ." + SS + " "+ "Euros"
							+" "+ "\nRetencionesIRPF: " + irpf +" "+"Euros" +" "+ "\nNeto a Percbir: "+ SalarioDescontado +"Euros");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	}
	
	
}
