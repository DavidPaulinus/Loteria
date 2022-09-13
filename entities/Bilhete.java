package entities;

import java.util.Random;

public class Bilhete {
	Random rand = new Random();
	StringBuffer sb=new StringBuffer();
	
	private String numeros="";
	
	public String sortear() {
		for(int i=0;i<5;i++) {
			sb.append(rand.nextInt(0,61));
			if(i<4) {
				sb.append("-");
			}
		}
		numeros+=sb.toString()+"\n";
		return sb.toString();
	}
	
	public String numeros() {
		return numeros;
	}
	
}
