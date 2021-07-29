package exercicios_condicional;

import java.util.Scanner;

public class Atividade_03 {
	
	//Exemplos:
	//	Entrada: 		Saída:
	//	6 24 			Sao Multiplos
	
	//	Entrada: 		Saída:
	//	6 25 			Nao sao Multiplos
	
	//	Entrada: 		Saída:
	//	24 6 			Sao Multiplos
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}

