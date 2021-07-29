package exercicios_entrada;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_02 {
		//area = π . raio2
		//π = 3.14159
	    //Exemplos de entrada e saida:
		//Entrada:     Saída:
		//2.00         A=12.5664
	
		//Entrada:     Saída:
		//100.64       A=31819.3103
	
		//Entrada:     Saída:
		//150.00       A=70685.7750

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner raio = new Scanner (System.in);
		
		double b = raio.nextDouble();
		double area = ((b * b)* 3.14159);
		
		System.out.printf("A=%.4f %n", area);
		
		raio.close();
	}

}
