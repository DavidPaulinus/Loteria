package entities;

import java.util.Random;

public class Bilhete {
	Random rand = new Random();
	StringBuffer sb=new StringBuffer();
	
	
	public String sortear() {
		for(int i=0;i<5;i++) {
			sb.append(rand.nextInt(0,61));
			if(i<4) {
				sb.append("-");
			}
		}
		return sb.toString();
	}
	
	
}
