
public class EarlyLateBinding {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor();
		Surgeon s1= new Surgeon();
		HeartSurgeon h1 = new HeartSurgeon();
		
		d1.diagnose();
		s1.diagnose();
		h1.diagnose();
		
		d1 = s1;
		d1.diagnose();
		d1 = h1;
		d1.diagnose();
				
				
				
	}

}
class Doctor
{
	void diagnose()
	{
		System.out.println("Docter: ENT checkup");
		
	}
}
class Surgeon extends Doctor
{
	void diagnose()
	{
		System.out.println("Surgeon: CT scan");
	}
}
class HeartSurgeon extends Surgeon
{
	void diagnose()
	{
		System.out.println("HeartSurgeon: MRI");
	}
}
