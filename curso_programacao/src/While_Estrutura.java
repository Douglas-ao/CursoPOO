import java.util.Scanner;

public class While_Estrutura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int soma = 0;
		
		while ( a != 0){
			//soma = soma + a;
			soma += a;
			a = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}
}
