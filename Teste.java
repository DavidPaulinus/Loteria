import java.util.Scanner;

import entities.Bilhete;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Bilhete b = new Bilhete();
		;

		String numeros = "", num = "";

		boolean loop = true;

		while (loop == true) {

			System.out.print("Quer um blihete da sorte? [s]/[n] ");
			String resp = sc.next();

			if (resp.equalsIgnoreCase("s")) {
				b = new Bilhete();
				System.out.println("\nSeus números são: ");
				num = b.sortear();
				System.out.println(num);
				numeros += num + "\n";
			} else {
				break;

			}

		}

		if (numeros != "") {

			System.out.println("\nSeus números foram: ");
			System.out.println(numeros);

		}
		sc.close();
	}

}
