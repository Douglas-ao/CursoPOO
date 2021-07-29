package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_06 {
	
	//Intervalos ([0,25], (25,50], (50,75], (75,100])
	
	//Exemplos:
	//Entrada: 			Saída:
	//	25.01 			Intervalo (25,50]
	
	//Entrada: 			Saída:
	//	25.00 			Intervalo [0,25]
	
	//Entrada: 			Saída:
	//	100.00 			Intervalo (75,100]
	
	//	Entrada: 		Saída:
	//	-25.02 			Fora de intervalo

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}
