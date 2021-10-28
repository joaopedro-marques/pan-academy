package parte2;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	//Metodo to String organiza o codigo, não precisa
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return name + ",  $" + price + " , " + quantity;
	}
}
