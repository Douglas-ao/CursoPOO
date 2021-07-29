package exercicios_entrada;

import java.util.Scanner;

public class Atividade_03 {

	// DIFERENCA = (A * B - C * D)
	// Exemplos:
	// Entrada: Saída:
	// 5 DIFERENCA = -26
	// 6
	// 7
	// 8

	// Entrada: Saída:
	// 5 DIFERENCA = 86
	// 6
	// -7
	// 8

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		int a = valor.nextInt();
		int b = valor.nextInt();
		int c = valor.nextInt();
		int d = valor.nextInt();

		int diferenca = a * b - c * d;

		System.out.println("DIFERENCA = " + diferenca);
		
		valor.close();
	}

}
