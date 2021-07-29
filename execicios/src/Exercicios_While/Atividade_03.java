package Exercicios_While;

import java.util.Scanner;

public class Atividade_03 {
	
	/* 1.Álcool 2.Gasolina 3.Diesel 4.Fim 
	Exemplo:
	Entrada: 			Saída:
		8				MUITO OBRIGADO
		1				Alcool: 1
		7				Gasolina: 2
		2				Diesel: 0
		2
		4 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		int combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool = alcool + 1;
			} else if (combustivel == 2) {
				gasolina = gasolina + 1;
			} else if (combustivel == 3) {
				disel = disel + 1;
			}
			combustivel = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ disel);
		sc.close();
	}
}
