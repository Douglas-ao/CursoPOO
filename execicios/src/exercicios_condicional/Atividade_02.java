package exercicios_condicional;

import java.util.Scanner;

public class Atividade_02 {
	
	//Exemplos:
	//Entrada: 			Sa�da:
	//	12 				PAR
	
	//Entrada: 			Sa�da:
	//	-27 			IMPAR
	
	//Entrada: 			Sa�da:
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
