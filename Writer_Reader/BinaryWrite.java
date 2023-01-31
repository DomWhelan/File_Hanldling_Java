/*
 Writing Binary Files in Java 
You can create and write to a binary file in Java using much the same techniques that we used to read binary files, except that we need FileOutputStream instead of FileInputStream. 

In the following example we write out some text as binary data to the file. Usually of course, you'd probably want to write some proprietary file format or something. 
 */

package writer_reader;
import java.io.*;

public class BinaryWrite {
    public static void main(String[] args) {
        // The name of the file to create.
        String fileName = "temp.txt";

        try {
            // Put some bytes in a buffer so we can
            // write them. Usually this would be
            // image data or something. Or it might
            // be unicode text.
            String bytes = "Hello theren";
            byte[] buffer = bytes.getBytes();

            FileOutputStream outputStream =
                new FileOutputStream(fileName);

            // write() writes as many bytes from the buffer
            // as the length of the buffer. You can also
            // use
            // write(buffer, offset, length)
            // if you want to write a specific number of
            // bytes, or only part of the buffer.
            outputStream.write(buffer);

            // Always close files.
            outputStream.close();       

            System.out.println("Wrote " + buffer.length + 
                " bytes");
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        
    }
    
}
