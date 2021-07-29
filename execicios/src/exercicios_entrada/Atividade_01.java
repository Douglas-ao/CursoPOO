package exercicios_entrada;

import java.util.Scanner;

public class Atividade_01 {

//Exemplos de retorno
//Entrada:             Saída:
//10                   SOMA = 40
//30

//Entrada:             Saída:
//-30                  SOMA = -20
//10

//Entrada: 			   Saída:
//0					   SOMA = 0
//0

	public static void main(String[] args) {

		Scanner soma = new Scanner(System.in);

		int x = soma.nextInt();
		int i = soma.nextInt();
		System.out.println("SOMA = " + (x + i));

		soma.close();
	}
}
