package entrada;

import java.util.Scanner;

public class LerScanner {
	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in); //Create a Scanner object
		System.out.println("Enter username");
		String userName = myObj.nextLine(); //Read user input
		System.out.println("Username is: " + userName); //Output user input
		
		Scanner myAge = new Scanner(System.in);
		System.out.println("Enter age:");		
		int Age = Integer.parseInt(myAge.nextLine());		
		System.out.println("Your age is: " + Age);
	}
}
