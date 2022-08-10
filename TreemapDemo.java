import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Product2 implements Comparable<Product2>
{
	String productName;
	int Price;
	public Product2(String productName, int price) {
		super();
		this.productName = productName;
		Price = price;
	}
	@Override
	public int compareTo(Product2 o) {
		// TODO Auto-generated method stub
		if(this.Price > o.Price) return -1;
		return 0;
	}
	@Override
	public String toString() {
		return "Product2 [productName=" + productName + ", Price=" + Price + "]";
	}
	
	
}


public class TreemapDemo {
	public static void main(String[] args) {
		Product2 p1 = new Product2("Lays",60);
		Product2 p2 = new Product2("dove",80);

		
		TreeMap<Product2,Integer> tm = new TreeMap<Product2,Integer>();
		
		tm.put(p1,60);
		tm.put(p2,80);
		
		for(Map.Entry<Product2,Integer> m: tm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		System.out.println("--------------------------------");
		HashMap<Product2,Integer> hm = new HashMap<Product2,Integer>();
		hm.put(p1,60);
		hm.put(p2,80);
		
		for(Map.Entry<Product2,Integer> m: hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
	}

}
