package Assignment1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandling_ReadingFile {
	public static void main(String[] args) throws FileNotFoundException{
        try
        {
        	File obj = new File("file1.txt");
        	Scanner myReader = new Scanner(obj);
        	while(myReader.hasNextLine())
        	{
        		String data = myReader.nextLine();
        		System.out.println(data);
        	}
        	myReader.close();
        }
        catch(FileNotFoundException e)
        {
        	System.out.println("Error Occured");
        }
	}
}
