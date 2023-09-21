package Assignment1;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling_Writing_Into_File {
	public static void main(String[] args) throws IOException{
		try
		{
			FileWriter myWriter = new FileWriter("file1.txt");
			myWriter.write("Hello Sir I'am Ruthwik Of Cyber Security");
		    myWriter.close();
		    System.out.println("Successfully written into the file");
		}
		catch(IOException e)
		{
			System.out.println("Error Occured");
		}
		
	}

}
