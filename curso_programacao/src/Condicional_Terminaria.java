import java.util.Scanner;

public class Condicional_Terminaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Eliminar os if else, abreviar codigos		
		double preco = 34.5;
		// (Se preco � < 20.0) ("?" ent�o preco * 0.1)(":" sen�o preco * 0.05)
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		//DEMO
		// if (preco < 20.0) {
		// desconto = preco * 0.1;
		// } else {
		// desconto = preco * 0.05;
		// }
		System.out.println(desconto);
		sc.close();
	}
}
