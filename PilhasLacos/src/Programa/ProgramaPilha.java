package Programa;


import java.util.Stack;


public class ProgramaPilha extends PilhaRepo {
	 public static void main(String[] args) {
		//creating an object of Stack class
		 Stack<String> pilhinha = new Stack<>();
		 System.out.println(" stack: " + pilhinha);
		 //pushing elements into the stack
		 inserindoPush(pilhinha, "Caixa Acustica 110");
		 inserindoPush(pilhinha, "Caixa Acustica 220");
		 inserindoPush(pilhinha, "Note");
		 deletandoPop(pilhinha);
		 deletandoPop(pilhinha);
		 
	}
}
