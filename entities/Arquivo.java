package entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
		
	public Arquivo() throws IOException {
		super();
	}

	File file = new File(
			"C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\Loteria\\src\\Números.txt");

	FileWriter arq = new FileWriter(
			"C:\\Users\\AdaumirM\\Downloads\\minhas coisas\\Programação\\eclipse\\Loteria\\src\\Números.txt");

	PrintWriter reader = new PrintWriter(arq);

	public void printar(String str) {
		reader.println(str);

	}

	public void salvar() throws IOException {
		arq.close();

	}
}
