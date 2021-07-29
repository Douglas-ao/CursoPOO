import java.util.Scanner;

public class EntradaDadosExemploDois {

	public static void main(String[] args) {
		
		// Entrada de dados tipo Scanner
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3; // Variaveis

		System.out.println("Digite 2 palavras ou mais inteiro");
		s1 = sc.nextLine(); // Ler todas palavras "nextLine()"
		System.out.println("Digite 2 palavras ou mais inteiro");
		s2 = sc.nextLine();
		System.out.println("Digite 2 palavras ou mais inteiro");
		s3 = sc.nextLine();
		// Retornar Dados
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Entrada de dados tipo Scanner, utilizando dois tipos de dados de leitura
		Scanner sz = new Scanner(System.in);

		String s4, s5, s6; // Variaveis
		int x;
		
		System.out.println("Digite numero inteiro");
		x = sz.nextInt(); // ler numero inteiro
		sz.nextLine(); // para quebrar linha
		System.out.println("Digite 2 palavras ou mais inteiro");
		s4 = sz.nextLine();
		System.out.println("Digite 2 palavras ou mais inteiro");
		s5 = sz.nextLine();
		System.out.println("Digite 2 palavras ou mais inteiro");
		s6 = sz.nextLine();

		// Encerramento recurso
		sc.close();
		sz.close();
	}

}
