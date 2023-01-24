package writer_reader;
import java.io.*;

public class Write {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("abc.txt");
            fw.write("My name is Dominic");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success");
    }
    
}
