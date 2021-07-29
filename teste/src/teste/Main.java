package teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		for (int i = 0; i <= 10; i++) {
			n = sc.nextInt();
			if (n < 1) {
				n = 1;
				int[] vect = new int[n];
				vect[i] = n;
				System.out.println("X[" + i + "] = " + vect[i]);
			} else {
				int[] vect = new int[n];
				vect[i] = n;
				System.out.println("X[" + i + "] = " + vect[i]);
			}
		}

		sc.close();
	}

}
