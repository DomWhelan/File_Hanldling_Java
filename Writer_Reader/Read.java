package writer_reader;

import java.io.FileReader;

public class Read {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");
        int i;
        while ((i=fr.read())!=-1)
        System.out.println((char)i);
        fr.close();
    }
}
