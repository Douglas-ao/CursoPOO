import java.util.Scanner;

public class Switch_Case {
	
	//1=domingo, 2=segunda, e assim por diante
	
	//Entrada 			Sa�da
	//1 				Dia da semana: domingo
	
	//Entrada 			Sa�da
	//4 				Dia da semana: quarta
	
	//Entrada 			Sa�da
	//9 				Dia da semana: valor inv�lido

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numDia = sc.nextInt();

		String dia;

		switch (numDia) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}
}
