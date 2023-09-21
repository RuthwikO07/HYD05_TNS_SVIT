package Assignment1;
import java.io.File;
import java.io.IOException;

public class FileHandling_CreatingFile {
	public static void main(String[] args) throws IOException {
		try
		{
			File obj = new File("file1.txt");
			if(obj.createNewFile())
			{
				System.out.println("File created" + obj.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
		}
	}

}
