import java.util.Scanner;

public class Estrutura_Condicional {
	
	//Condição simples 
	// if = Se , else = senão 
	//V= Executa o bloco de comandos if
	//F= Pula o bloco de comandos if e executa o else se tiver.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quantas horas?");
		Scanner sc = new Scanner(System.in);
		
		int hora = sc.nextInt();
		
		if (hora < 12){
			System.out.println("Bom dia");
		}
		else if (hora < 18){
			System.out.println("Boa tarde");
		}
		else{
			System.out.println("Boa noite");
		}
		sc.close();
	}

}
