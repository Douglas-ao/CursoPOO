package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_05 {
	
	//Código	Especificação		Preço
	//  1		Cachorre Quente		R$4.00
	//  2		X-Salada     		R$4.50
	//  3		X-Bacon     		R$5.00
	//  4		Torrada simples  	R$4.50
	//  5		Refrigerante		R$1.50
	
	//Exemplos:
	//Entrada: 			Saída:
	//	3 2 			Total: R$ 10.00
	
	//	Entrada: 		Saída:
	//	2 3 			Total: R$ 13.50

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double total = 0;
		
		if (a == 1){
			total = b * 4.0;
		}
		else if (a == 2){
			total = b * 4.5;
		}
		else if (a == 3){
			total = b * 5.0;
		}
		else if (a == 4){
			total = b * 2.0;
		}
		else if (a == 5){
			total = b * 1.5;
		}
		System.out.printf("Total: R$ %.2f", total);
		sc.close();
	}
}
