package exercicios_entrada;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner calculo = new Scanner(System.in);

		int a = calculo.nextInt();
		int b = calculo.nextInt();
		double c = calculo.nextDouble();

		int d = calculo.nextInt();
		int e = calculo.nextInt();
		double f = calculo.nextDouble();

		double pg = b * c + e * f;
		System.out.printf("VALOR A PAGAR: R$ %.2f", pg);
		calculo.close();
	}

}
