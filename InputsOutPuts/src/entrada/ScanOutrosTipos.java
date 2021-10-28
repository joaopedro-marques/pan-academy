package entrada;

import java.util.Scanner;

public class ScanOutrosTipos {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		short num2 = ler.nextShort(); //Read user input
		System.out.println(num2); //Output user input
		
		long num3 = ler.nextLong();
		System.out.println(num3);
	}
	
	
}
