import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import entities.Bilhete;

public class Teste {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		FileWriter arq = new FileWriter(
				"C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programa��o\\eclipse\\Loteria\\src\\N�meros.txt");
		PrintWriter reader = new PrintWriter(arq);

		Bilhete b = new Bilhete();

		String num = "";

		boolean loop = true;

		while (loop == true) {

			System.out.print("Quer um blihete da sorte? [s]/[n] ");
			String resp = sc.next();

			if (resp.equalsIgnoreCase("s")) {
				if (num == "") {
					reader.println("\nSeus n�meros foram: \n");

				}
				b = new Bilhete();
				System.out.println("\nSeus n�meros s�o: ");
				
				num = b.sortear();
				System.out.println(num);
				
				reader.println(num);
				
			} else {
				break;

			}

		}

		if (num != "") {
			System.out.println("Arquivo salvo com sucesso!");
		}

		arq.close();
		sc.close();
	}

}
