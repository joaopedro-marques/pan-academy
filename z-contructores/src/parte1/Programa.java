package parte1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //qual local está usando.
		Scanner sc = new Scanner(System.in); //chama o scanner pra ler
		Product product = new Product();
		
		System.out.println("name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		if(sc.hasNextInt()) {
			System.out.println("Quantidade no estoque: ");
			product.quantity = sc.nextInt();
			System.out.println();
			System.out.println("Product data: " + product);
		} else {
			
			System.out.println();
			System.out.println("Product data: " + product);
		}
		sc.close();
	}
}
