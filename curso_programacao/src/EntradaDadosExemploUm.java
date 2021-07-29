import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosExemploUm {

	public static void main(String[] args) {
		//Fazer a entrada de dados tipo Scanner
		Scanner sc = new Scanner(System.in);
		Scanner inteiro = new Scanner(System.in);
		Scanner flutuante = new Scanner(System.in);
		
		String x; //Variavel 
		System.out.println("Digita uma palavra");
		x = sc.next(); // Variavel "x" recebendo os dados digitados
		System.out.println("Voce digitou: " + x ); //Retornando dados 
		
		int z; //Variavel
		System.out.println("Digita um numero inteiro");
		z = inteiro.nextInt(); //Variavel "z" recebendo os numeros digitados tipo inteiro
		System.out.println("Voce digitou: " + z ); //Retornando dados
		
		double y; // Variavel
		System.out.println("Digita um numero quebrado, separado por virgula");
		y = flutuante.nextDouble(); //Variavel "y" recebendo os numeros quebrados
		System.out.println("Voce digitou: " + y ); //Retornando dados com ponto
		System.out.printf("Voce digitou: %.2f%n" , y ); //Retornando dados com virgula
				
		//Considerar o separador de decimais como ponto.
		Locale.setDefault(Locale.US); //Acima da entrada de dados
		Scanner flutuantePonto = new Scanner(System.in);
		double f;
		System.out.println("Digita um numero quebrado, separado por ponto");
		f = flutuantePonto.nextDouble(); //Variavel "y" recebendo os numeros quebrados
		System.out.println("Voce digitou: " + f ); //Retornando dados
		
		//Ler e retornar só uma caractere da palavra ou numeros digitados
		Scanner uma = new Scanner(System.in);
		char v;
		System.out.println("Digita varias letras ou varios numeros");
		v = uma.next().charAt(0); //Escolher qual caracteres quer mostrar
		System.out.println("A primeira caractere é: " + v);

		//Encerrando o recurso
		sc.close();
		uma.close();
		inteiro.close();
		flutuante.close();
		flutuantePonto.close();	
	}

}
