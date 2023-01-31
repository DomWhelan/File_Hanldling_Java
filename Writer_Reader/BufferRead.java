/*
 Reading Ordinary Text Files in Java 
If you want to read an ordinary text file in your system's default encoding (usually the case most of the time for most people), use FileReader and wrap it in a BufferedReader. 
In the following program, we read a file called "temp.txt" and output the file line by line on the console. 
 */

package writer_reader;
import java.io.*;

public class BufferRead {
    public static void main(String[] args) {
        
        // The name of the file to open.
        String fileName = "temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
    

