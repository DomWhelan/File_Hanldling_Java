/*
 1.	Serialization interface needs to be implemented in order to make object     serialized.
 2.	Transient instance variable doesn’t serialized with Object state.
 3.	If Super class implements Serializable then sub class are also Serializable automatically.
 4.	If Super class is not serializable then when sub class is deserialized then super class’s default constructor will be invoked. Hence all variable will get default value and reference will be null
 */


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
