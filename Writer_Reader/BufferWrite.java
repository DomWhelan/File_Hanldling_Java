/*
Writing Text Files in Java 
To write a text file in Java, use FileWriter instead of FileReader, and BufferedWriter instead of BufferedReader. Simple eh? Here's an example program that creates a file called 'temp.txt' and writes some lines of text to it
 */

package writer_reader;
import java.io.*;

public class BufferWrite {
    public static void main(String[] args) {
        // The name of the file to open.
        String fileName = "temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

    }
    
}
