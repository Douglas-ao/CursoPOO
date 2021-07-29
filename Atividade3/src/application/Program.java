package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Media;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Media media = new Media();
		
		media.name = sc.nextLine();
		media.valueUm = sc.nextDouble();
		media.valueDois = sc.nextDouble();
		media.valueTres = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", media.value());
		System.out.println(media.toString());
		System.out.println(media.missing());
		
		sc.close();
	}

}
