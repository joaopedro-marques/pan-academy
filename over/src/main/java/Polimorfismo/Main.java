package Polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		
		//sobreescrita refencia filho pelo objeto pai
		Colaborador col1 = new Colaborador();
		Colaborador col3 = new Gestor();
		
	
		 col1.setSalario(300);
		 col3.setSalario(300);
		 
		 
		 System.out.println(col1.calculaPremio());
		 System.out.println(col3.calculaPremio());

	}

}
