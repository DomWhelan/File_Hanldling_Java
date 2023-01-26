package serializing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Rectangle implements Serializable {
    private int length;
    private int width;

    Rectangle (int l, int w) {
        this.length = l;
        this.width = w;
    }
    public void area() {
        double a = this.length * this.width;
        System.out.println("Area of the rectangle = " + a);
    }
    
    public static void main (String args[]){
        try {    
            //Creating the object    
            Rectangle r1 = new Rectangle(5,6);
            r1.area();  
            //Creating stream and writing the object    
            FileOutputStream fout=new FileOutputStream("f.txt");    
            ObjectOutputStream out=new ObjectOutputStream(fout);    
            out.writeObject(r1);    
            out.flush();    
            //closing the stream    
            out.close();    
            System.out.println("success");    
            } catch (Exception e) {
                System.out.println(e);}   
            
        try {  
            //Creating stream to read the object  
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
            Rectangle R2=(Rectangle)in.readObject();  
            //printing the data of the serialized object  
            System.out.println(R2.length+" "+R2.width);  
            //closing the stream  
            in.close();  
            } catch (Exception e) {
                System.out.println(e);
            }  
    }  
}



