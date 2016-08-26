// Antonio luis Gallego López 1ºDAW //

//Programa que resuelve ecuaciones de segundo grado utilizando métodos: ax2 + bx + c = 0 //

 

package metodos;
import java.util.Scanner;
public class Ecua2MetodosALGL {

	public static void main (String[]args){				//metodo principal //




		
		double a = 0;
		double b = 0;									// declaracion de variables//
		double c = 0;
		double d = 0;
		double term1 = 0;
		double term2 = 0;

		System.out.println("Ecuación de segundo grado: ax2 + bx + c = 0 ");

		Scanner teclado = new Scanner(System.in);

		//Entrada de datos

		System.out.print("Introduce a: ");
		a = teclado.nextDouble();
		System.out.print("\n Introduce b: ");
		b = teclado.nextDouble();
		System.out.print("\n Introduce c: ");						// pide 3 numeros por teclado //
		c = teclado.nextDouble();


		
		d = discriminanteALGL(a, b, c);								// asigancion de variables a metodos //
		term1 = termino1ALGL(a, b);
		term2 = termino2ALGL(a, d);


		//Casos posibles
		switch (evaluaEcuacionALGL(a, b, c)) {

		case 1:         // a y b == 0
			System.out.println("la ecuación es degenerada, no hay solución");
			break;

		case 2:         // a == 0
			System.out.println("La ecuación es tiene solución única:\n x = " + (-b / c));
			break;

		case 3:         // d == 0
			System.out.println("La ecuación tiene solución única:\n x = " + term1);
			break;

		case 4:         // d > 0
			System.out.println("La ecuación tiene dos soluciones reales:\n"
					+ " x1 = " + (term1 + term2) + "\n"
					+ " x2 = " + (term1 - term2));
			break;

		case 5:         // d < 0
			System.out.println("La ecuación tiene dos soluciones complejas:\n"
					+ " x1 = " + term1 + " + " + term2 + "i\n"
					+ " x2 = " + term1 + " - " + term2 + "i");
			break;

		}
	}
	
	
	
	// Antonio Luis Gallego Lopez // 1º DAW
	   
    // metodo que devuelve el numero correspondiente al tipo de ecuacion

    static int evaluaEcuacionALGL (double a, double b, double c){              

        int tipo = 0;                                                          

        if (a == 0 && b== 0 ){
            tipo = 1;
            System.out.println(tipo);

        }
        if (a == 0){
            tipo = 2;                                      

            System.out.println(tipo);                   // conjunto de sentencias para determinar dicho numero
        }
        if (discriminanteALGL(a, b, c) == 0){
            tipo = 3;
            System.out.println(tipo);
        }
        if (discriminanteALGL(a, b, c)>0){
            tipo = 4;
            System.out.println(tipo);
        }
        if (discriminanteALGL(a, b, c) <0){
            tipo = 5;
            System.out.println(tipo);
        }
        return tipo;                                    // devuelve un tipo de dato entero  para el swith

    }
           
    // calcula el discriminante  el metodo recibe 3  valores de tipo double

    static double discriminanteALGL (double a, double b, double c){      

        double discriminente;
        discriminente = b*b - (4*a*c);

        return discriminente;                            // devuelve el numero double

    }

    // metodo que calcula uno de las soluciones de la ecuacion
    // el metodo recibe dos valores de tipo double


    static double termino1ALGL (double a, double b){              

        double termino1;
        termino1=  -b/2*a;

        return termino1;                                 // devuelve el número double

    }
    // calcula la segunda solucion de la ecuacion
    // recibe dos valores de tipo double
    static double termino2ALGL (double a, double d){          

        double termino2;
        termino2 =  Math.sqrt(d) / 2*a;

        return termino2;                            // devuelve el número double
    }

}
