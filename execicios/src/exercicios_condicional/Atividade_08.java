package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_08 {
	
	//  Exemplos:
	//	Entrada: 	Sa�da:
	//	3002.00 	R$ 80.36
	
	//	Entrada: 	Sa�da:
	//	1701.12 	Isento
	
	//	Entrada: 	Sa�da:
	//	4520.00 	R$ 355.60

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}

