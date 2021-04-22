import java.util.Scanner;
public class CursoJavaBuclesII {
	
	public static void main(String [] args) {
		
		int aleatorio =(int)(Math.random()*100);

		Scanner entrada = new Scanner(System.in);
		int numero=0,intentos=10;
		
		System.out.println("Buenos dias Usuario!!!\n"
				+ "Para empezar a jugar a Adivina el Numero Aleatorio.");
		
		
		do {
			intentos--;
			System.out.println("Introduzca un numero: ");
			
			numero=entrada.nextInt();
			
			if(intentos<0){
				System.out.println("Has perdido!, has consumido todos tus intentos");
				break;
			}else if (aleatorio<numero) {
				
				System.out.println("Más bajo");
				
			}else if(aleatorio>numero) {
				
				System.out.println("Más alto");
				
			}
			
		}
		while(numero!=aleatorio);
		if(aleatorio==numero) {
			
			System.out.println("Correcto!, aun te quedanban " + intentos+ " intentos.");
			
		}
	}

}
