
public class FunctionOverloadingTest {
public static void main(String[] args) {
	Rabit r = new Rabit();
	r.jump();
	r.jump(10);
	r.jump(5,0.5f);
}
}
class Rabit
{
	void jump()
	{
		System.out.println("Rabit is Jumping");
	}
	void jump(int x)
	{
		System.out.println("Rabit is  jumping at "+x+" feet");
	}
	void jump(int x , float y)
	{
		System.out.println("rabit is jumping at "+x+"feet"+y+"inches");
	}
}
