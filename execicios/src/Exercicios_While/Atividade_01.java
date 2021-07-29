package Exercicios_While;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int conf;
		int senha = 2002;
		
		conf = sc.nextInt();
		
		while ( conf != senha){
			System.out.println("Senha Invalida");
			conf = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
		
	}

}
