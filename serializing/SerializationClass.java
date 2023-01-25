package serializing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.firstName = "John";
        emp.lastName = "Smith";

        try{
            FileOutputStream fileOut = new FileOutputStream("./employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            System.out.printf("Serializable date is saved in ./employee.txt file");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
