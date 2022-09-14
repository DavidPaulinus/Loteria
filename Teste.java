import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import entities.Bilhete;

public class Teste {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		File file = new File(
				"C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programa��o\\eclipse\\Loteria\\src\\N�meros.txt");

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
					System.out.println("\nUm arquivo foi criado para salvar seus n�meros nele.");

					reader.println("\nSeus n�meros foram: \n");

				}
				b = new Bilhete();
				System.out.println("\nSeus n�meros s�o: ");

				num = b.sortear();
				System.out.println(num + "\n");

				reader.println(num);

			} else {
				break;

			}

		}

		if (num != "") {
			System.out.println("\nArquivo salvo com sucesso!");
		}

		arq.close();
		sc.close();
	}

}
