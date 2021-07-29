package exercicios_entrada;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_04 {
	
	//Exemplos:
	//	Entrada:                       Saída:
	//	25							   NUMBER = 25
	//	100							   SALARY = U$ 550.00
	//	5.50
		
	//	Entrada:                       Saída:
	//	1							   NUMBER = 1
	//	200							   SALARY = U$ 4100.00
	//	20.50
		
	//	Entrada:                       Saída:
	//	6							   NUMBER = 6
	//	145							   SALARY = U$ 2254.75
	//	15.55

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner salario = new Scanner(System.in);
		int a = salario.nextInt();
		int b = salario.nextInt();
		double c = salario.nextDouble();
		double salary = b * c;
		
		System.out.println("NUMBER = "+ a);
		System.out.printf("SALARY = U$ %.2f ", salary);
		salario.close();
	}

}
