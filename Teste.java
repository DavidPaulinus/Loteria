import java.util.Random;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		boolean loop = true;

		while (loop == true) {

			System.out.print("Quer um ticket? [s]/[n] ");
			String resp = sc.next();

			if (resp.equalsIgnoreCase("s")) {
				System.out.println("\nSeus números são: ");
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < 5; i++) {
					sb.append(rand.nextInt(0, 61));
					if (i < 4) {
						sb.append("-");
					}
				}
				System.out.println(sb + "\n");

			} else {
				break;

			}
			
		}
		sc.close();
	}

}
