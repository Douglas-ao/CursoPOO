package exercicios_condicional;

import java.util.Scanner;

public class Atividade_01 {
	
	//Exemplos:
	//Entrada: 			Saída:
	//	-10 			NEGATIVO
	
	//Entrada: 			Saída:
	//	8 				NAO NEGATIVO
	
	//	Entrada: 		Saída:
	//	0 				NAO NEGATIVO

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner sc = new Scanner(System.in);

				int N = sc.nextInt();
			    
				if (N < 0) {
					System.out.println("NEGATIVO");
				}
				else {
					System.out.println("NAO NEGATIVO");
				}

				sc.close();
	}

}
