package parte1;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	//Metodo to String organiza o codigo, não precisa
	public String toString() {
		return name + ", $" + price + ", " + quantity;
	}
}
