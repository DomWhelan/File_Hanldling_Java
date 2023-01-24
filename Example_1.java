import java.io.*; 

public class Example_1 {
    
    public static void main(String[] args) {

         try{
            File file = new File("javaFile1.txt");
            if(file.createNewFile()){
                System.out.println("New File Created");
            } else {
                System.out.println("File Already Exists");
            }
         } catch(IOException e) {
            e.printStackTrace();
         }

    }
}
