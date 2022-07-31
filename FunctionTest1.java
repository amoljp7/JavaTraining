
public class FunctionTest1 {
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.findAverage();
	cal.findAverage2(10,20);
	int a=cal.findAverage3(69,1);
	String b = cal.name();
	System.out.println("summ is="+a);
	System.out.println("summ is="+b);
}

}
class Calculator
{
	void findAverage()
	{
		float a=2;int b=3;
		System.out.println("average of two no is="+((a+b)/2));
		
	}
	void findAverage2(int x,int y)
	{
		System.out.println("addition of two no is "+((x+y)/2));
	}
	int findAverage3(int x,int y)
	{
		int sum=x+y;
		System.out.println("===="+sum);
		
		return sum;
	}
	String name()
	{
		return "amol";
	}
	
}