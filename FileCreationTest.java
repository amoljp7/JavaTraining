import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationTest {
	public static void main(String args[])
	{
		try {
			System.out.println("Trying to create a file...");
			FileOutputStream fout = new FileOutputStream("C:/Users/APR33/Desktop/TestFile3.txt",true);
			System.out.println("file is created");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your data:");
			String str = sc.nextLine();
			
//			String str1 = "this is the data";
			System.out.println("go to the string data");
			 byte byteArray [] = str.getBytes();
			 System.out.println("coverted the string into the byte array");
			 
			 fout.write(byteArray);
			 System.out.println("byte array is written to the file");
			 
			 fout.write(byteArray);
			 System.out.println("File is closed");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
			
			
			
			
			
			
		}
	}
	

