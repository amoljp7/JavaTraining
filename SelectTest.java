import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class SelectTest {
	public static void main(String[] args) {
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());		
		Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			Statement statement = conn.createStatement();
			
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the employee no");
			int eno = scan.nextInt();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPNO="+eno);
			
			
				
			if(rs.next()) {
				int empno = rs.getInt(1) ; // get the first column (int type) output
				String ename = rs.getString(2) ;
				int sal = rs.getInt(3);
				System.out.println("EMP NO   : "+empno);
				System.out.println("EMP NAME : "+ename);
				System.out.println("EMP SAL  : "+sal);
				System.out.println("------------------------");
			} else
			{
				throw new EmployeeNotFoundExecption(eno+"Employee not Found");
			}
			rs.close();	statement.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}









