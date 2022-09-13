import java.util.Scanner;

import entities.Bilhete;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bilhete b;

		boolean loop = true;

		while (loop == true) {

			System.out.print("Quer um blihete da sorte? [s]/[n] ");
			String resp = sc.next();

			if (resp.equalsIgnoreCase("s")) {
				b = new Bilhete();
				System.out.println("\nSeus números são: ");
				System.out.println(b.sortear());

			} else {
				break;

			}

		}
		sc.close();
	}

}
