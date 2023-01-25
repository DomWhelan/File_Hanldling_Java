package streams;
import java.io.*;

public class Copy {

    public static void main(String[] args) {
        try{  
            FileInputStream fin=new FileInputStream("xyz.txt");  
            FileOutputStream fout=new FileOutputStream("c.txt");
            int i=0;  
            while((i=fin.read())!=-1){  
            fout.write((byte)i);  
                }     
            fout.close(); 
            fin.close();   
            System.out.println("success...");  
           }
           catch(Exception e)
             {System.out.println(e);
        }  
    }    
}
