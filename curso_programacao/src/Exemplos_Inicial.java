import java.util.Locale;

public class Exemplos_Inicial {
	
	public static void main(String[] args) {
		
		//Declaração de variavel
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Olá Mundo!");
		
		//Retornando a variavel 
		System.out.println(y);		
		System.out.println(x);
		
		//Controlar a quantidade de casas decimais.
		System.out.println("Idioma Português");
		System.out.printf("%.2f%n", x); //Duas casas decimais
		System.out.printf("%.3f%n", x); //Tres casas decimais 
		//Por padrão o valor retornado esta separado por virgula
		//por que esta em idioma Portugues, para colocar ponto teria que mudar o idioma.
		Locale.setDefault(Locale.US);
		System.out.println("Idioma US");
		System.out.printf("%.3f%n", x);
		System.out.printf("%.2f%n", x);
		
		//Concatenar varios valores em um mesmo comando de escrita 
		// %f = ponto flutuante 
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		System.out.println("Concatenacao de varios valores");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reias %n", nome, idade, renda);
		
		
	}

}
