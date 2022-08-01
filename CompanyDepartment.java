
public class CompanyDepartment {
	public static void main(String args[])
	{
		Company c1 = new Company();
		c1.companyDetails();
		System.out.println("Company obj is "+c1);
		
	}
}
class Company
{
	String departmentName;
	String employeeName;
	int employeeId;
	
	
	
	@Override
	public String toString() {
		return "Company [departmentName=" + departmentName + ", employeeName=" + employeeName + ", employeeId="
				+ employeeId + "]";
	}
	Company()
	{
		
		departmentName="Enovia";
		employeeName="Amol";
		employeeId=101;
	}
	void companyDetails()
	{
		System.out.println("Department Name is ="+departmentName+"\nEmployee Name is="+employeeName+"\nEmplyeeId is="+employeeId);
	}

}