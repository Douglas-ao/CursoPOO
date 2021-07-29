import java.util.Locale;
import java.util.Scanner;

public class Atribuicao_Cumulativa {
	
	// R$ 50.00 até 100 minutos
	// a R$ 2.00 a cada minutos que passar
	
	//Exemplo
	//Entrada 		Saída
	//22 			Valor a pagar: R$ 50.00
	
	//Entrada 		Saída
	//103 			Valor a pagar: R$ 56.00

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
		//	conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0;
		}
		
		// a += b;		a = a + b;
		// a -= b;		a = a - b;
		// a *= b;		a = a * b;
		// a /= b;		a = a / b;
		// a %= b;		a = a % b;
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();

	}
}
