package exercicios_condicional;

import java.util.Scanner;

public class Atividade_04 {
	
	//Exemplos:
	//	Entrada: 		Saída:
	//	16 2 			O JOGO DUROU 10 HORA(S)
	
	//	Entrada: 		Saída:
	//	0 0 			O JOGO DUROU 24 HORA(S)
	
	//	Entrada: 		Saída:
	//	2 16 			O JOGO DUROU 14 HORA(S)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int duracao;
		if (a < b) {
			duracao = b - a;
		}
		else {
			duracao = 24 - a + b;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		

	}

}
