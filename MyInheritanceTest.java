
public class MyInheritanceTest {	
	public static void main(String[] args)
	{
		Clothing c1 = new Clothing();
		c1.printingList();
	}

}
class Shirt
{
	String shirt = " roundneck";

	
	void nameOfitems()
	{
		System.out.println("shopped items are"+shirt);
	}
}
class Pant extends Shirt
 {
	String pant ="trouser";
	void pantshopped()
	{
		System.out.println("shopped pant is "+pant);
	}
}

class Clothing extends Pant
{
	void printingList()
	{
			System.out.println("Shirt and pant purchased are "+shirt+" "+pant);
	}
}