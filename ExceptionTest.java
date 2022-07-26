
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LaptopTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main...");
		
		LaptopTest lt1 = new LaptopTest();
		try {
			lt1.switchOn();
		
		} catch (LaptopIsNotSwitchedOnException e) {
			System.out.println("Problem : "+e);
		}
		
		System.out.println("End of main...");
	}
}

class LaptopIsNotSwitchedOnException extends Exception
{
	LaptopIsNotSwitchedOnException(String msg) {
		super(msg);
	}
}
class Laptop
{
	boolean current;
	
	Laptop() 	{
		System.out.println("Washing machine is created....but is it ready with electricity....");
	}

	/*
	WashingMachine() 
	{
		System.out.println("Washing machine is created....but is it ready with electricity....");
	
	}
    */
	
	void switchOn() {
		if(current==false) {
			current = true;
		}
		System.out.println("Machine is switched on....");
	}
	
	void selectProgram() throws WashingMachineIsNotSwitchedOnException
	{
		if(current == false ) {
			WashingMachineIsNotSwitchedOnException washSwitchNotOnEx = new WashingMachineIsNotSwitchedOnException("The Washing Machine is not yet switched on.....");
			throw washSwitchNotOnEx;
		}

		System.out.println("Program started....");
		wash();
		System.out.println("Program finished...");
	}
	
	void wash()
	{
			for(int i=1;i<=20;i++) {
				System.out.println("Washing...."+i);
			}
			rinse();
	}
	
	void rinse()
	{
			for(int i=1;i<=10;i++) {
				System.out.println("\trinse...."+i);
			}
			spin();
	}
	
	void spin() {
		for(int i=1;i<=5;i++) {
			System.out.println("\t\tspinning......."+i);
		}
	}
	
	void switchOff() {
		if(current==true) {
			current = false;
		}
		System.out.println("Machine is switched off...");
	}
}