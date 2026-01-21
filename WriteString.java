// Write File using
// writeString Method
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteString
{
    public static void main(String[] args)
         throws IOException 
    {
        
        // Data to be written in file
        String text = "hii i am abhishe\nHappy Learning java!";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");
        String path = br.readLine();

        // Defining the file name of the file
        Path fileName = Path.of(path);

        try {
            Files.writeString(fileName, text);

            // Reading the content of the file
            String fileContent = Files.readString(fileName);

            // Printing the content inside the file
            System.out.println(fileContent);
        } 
      	catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}