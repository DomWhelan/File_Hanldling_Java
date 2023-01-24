package streams;
import java.io.*;

public class Output {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("xyz.txt");  
            String s="Canada is my favourite Country";  
            byte b[]=s.getBytes();//converting string into byte array  
            fout.write(b);  
            fout.close();  
            System.out.println("success...");  
            }catch (Exception e) {
            System.out.println(e);
        }  
    }  
   
}

