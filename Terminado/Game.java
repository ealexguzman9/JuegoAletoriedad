import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		boolean jugarOtraVez = true;
		int respuesta;
		Scanner scanner = new Scanner(System.in);	
		
		while(jugarOtraVez) {
		double numeroDecimalAleatorio = Math.random();
		int minimo = 1;
		int maximo = 100;
		int numeroAleatorio = minimo + (int)(numeroDecimalAleatorio * (maximo - minimo + 1));
		int num = -1;
		int intentos = 0;
	
		//System.out.println("Número aleatorio: " + numeroAleatorio);
	System.out.println("¿Te gustaria jugar conmigo?, Intenta adivinar el numero que estoy pensando...");
	System.out.println("Escoge un numero en un rango del 1 al 100 y dimelo");
		
	    	
	    		while (num != numeroAleatorio) {
	    			
	    			System.out.println("Escribe un numero: ");
	    			num = scanner.nextInt();
	    	
		
	    				if (num > numeroAleatorio)
	    					System.out.println("El numero es menor que el introducido");
	    	
		
	    				if (num < numeroAleatorio)
	    					System.out.println("El numero es mayor que el introducido");
	    		
	    						//Numero de Intentos
	    							intentos++;
	    							System.out.println("Intento numero: " + intentos);
	    		
	    						
	    						     		
	    		}
	    
	    			
	  
	     System.out.println("Has acertado, muchas felicidades!!!.");
	     System.out.println("¿Te gustaria volver a jugar?.");
	     System.out.println("Escribe 1 para aceptar, ó , 2 para denegar.");
	     
	     respuesta = scanner.nextInt();

		 if (respuesta == 2)
		 	jugarOtraVez = false;
		 
		 if (respuesta == 1)
			 	jugarOtraVez = true;
			 
	     
				}
	    	
			  
	     	}
	 
	    	
	
	}