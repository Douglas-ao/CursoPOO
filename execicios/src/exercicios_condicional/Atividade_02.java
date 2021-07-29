package exercicios_condicional;

import java.util.Scanner;

public class Atividade_02 {
	
	//Exemplos:
	//Entrada: 			Saída:
	//	12 				PAR
	
	//Entrada: 			Saída:
	//	-27 			IMPAR
	
	//Entrada: 			Saída:
	//	0 				PAR

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

		sc.close();
	}
}
