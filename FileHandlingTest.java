import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {
	public static void main(String args[])
	{
		try {
			FileInputStream fin = new FileInputStream("C:/Users/APR33/Desktop/TestFile.txt");
			FileInputStream fin2 = new FileInputStream("C:/Users/APR33/Desktop/TestFile2.txt");
			FileInputStream fin3= new FileInputStream("C:/Users/APR33/Desktop/TestFile3.txt");
			System.out.println("file is open");
			byte b =(byte) fin.read();
			byte b2 =(byte) fin2.read();
			byte b3 =(byte) fin3.read();
			while (b!=-1 || b2 != -1 || b3 != -1)
			{
				System.out.print((char)b);
				System.out.print((char)b2);
				System.out.print((char)b3);
				b=(byte) fin.read();
				b2 =(byte) fin2.read();
				b3 =(byte) fin3.read();
				Thread.sleep(100);
			}
			System.out.println("\ntrying to close file..");
			fin.close();
			System.out.println("file is closed");
		} catch (FileNotFoundException e) {
			System.out.println("Promblem 1   "+e);
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
