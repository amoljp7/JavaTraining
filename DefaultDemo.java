

interface Price{
	default void print() {
		System.out.println("I'm a price");
	}
}

class Product implements Price{
	
	Product(){
		System.out.println("I'm a product");
	}
}

public class DefaultDemo {
	public static void main(String[] args) {
		Product p = new Product();
		p.print();
	}
} 
 
