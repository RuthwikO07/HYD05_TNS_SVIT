package Assignment1;
import java.io.File;
import java.io.IOException;
public class FileHandling_DeletingFile {
	public static void main(String[] args) throws IOException{
		try
		{
			File myFile = new File("file1.txt");
			if(myFile.exists())
			{
				myFile.delete();
				System.out.println("File deleted Successfully!");
;			}
			else
			{
				System.out.println("File Does Not Exists");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
