import java.io.IOException;
import java.util.Scanner;

import entities.Arquivo;
import entities.Bilhete;

public class Teste {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Bilhete b = new Bilhete();
		Arquivo arq = new Arquivo();

		String num = "";
		boolean loop = true;

		while (loop == true) {

			System.out.print("Quer um blihete da sorte? [s]/[n] ");
			String resp = sc.next();

			if (resp.equalsIgnoreCase("s")) {
				if (num == "") {
					System.out.println("\nUm arquivo foi criado para salvar seus n�meros nele.");

					arq.printar("Seus n�meros foram: \n");

				}
				b = new Bilhete();
				System.out.println("\nSeus n�meros s�o: ");

				num = b.sortear();
				System.out.println(num + "\n");

				arq.printar(num);

			} else {
				break;

			}

		}

		if (num != "") {
			arq.salvar();
			System.out.println("\nArquivo salvo com sucesso!");
		}

		sc.close();
	}

}
