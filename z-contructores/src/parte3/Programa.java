package parte3;

import java.util.Locale;
import java.util.Scanner;

import parte1.Product;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //qual local está usando.
		Scanner sc = new Scanner(System.in); //chama o scanner pra ler
			
		
		System.out.println("name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		if(sc.hasNextInt()) {
			Product product = new Product(name, price, quantity);
			System.out.println();
			System.out.println("Product data: " + product);
		} else {
			Product product = new Product(name, price);
			System.out.println();
			System.out.println("Product data: " + product);
		}
		sc.close();
	}
	
}

