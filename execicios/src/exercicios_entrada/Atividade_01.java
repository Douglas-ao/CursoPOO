package exercicios_entrada;

import java.util.Scanner;

public class Atividade_01 {

//Exemplos de retorno
//Entrada:             Sa�da:
//10                   SOMA = 40
//30

//Entrada:             Sa�da:
//-30                  SOMA = -20
//10

//Entrada: 			   Sa�da:
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
