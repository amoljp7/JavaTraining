
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("banking started");
		BankAccount Baobj1 = new BankAccount();
		BankAccount Baobj2 = new BankAccount();
		
		
		Baobj1.setBankaccount(101, "sarves", 132.13213);
		Baobj1.printBankAccount();
	}

}
class BankAccount
{
	int accountNumber;
	String accountHolderName;
	double balance;
		
		void setBankaccount(int x, String y, double z)
		{
			 accountNumber=x;
			 accountHolderName=y;
			 balance=z;
		}
		double calculateSimpleInterest (float rateOfInterest,int period)
		{
			double simpleInterest =(balance*rateOfInterest*period)/100.0f;
			return simpleInterest;
		}
		void deposit(double amountToDeposite)
		{
			System.out.println("depositing.......");
			balance = balance+amountToDeposite;
		}
		double getBalace()
		{
			return balance;
		}
		void printBankAccount()
		{
			System.out.println(" ACNO "+accountNumber);
			System.out.println("ACNHDN "+accountHolderName);
			System.out.println("ACBL "+balance);
			System.out.println("---------------------");
			
			
			
			
		}
		
}