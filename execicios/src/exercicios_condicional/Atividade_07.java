package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_07 {
	
	//Exemplos:
	//Entrada: 		Sa�da:
	//	4.5 -2.2 	Q4
	
	//Entrada: 		Sa�da:
	//	0.1 0.1 	Q1
	
	//Entrada: 		Sa�da:
	//	0.0 0.0 	Origem

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		sc.close();
	}
}
