package iostreams.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {
        FileOutputStream fis;
        ObjectOutputStream oos;


        try {
            fis = new FileOutputStream("C:\\Users\\ARuizMarin\\Documents\\Emp.ser");
            oos = new ObjectOutputStream(fis);

            Employee emp = new Employee(1, "john", 100000, 233344);
            oos.writeObject(emp);
            System.out.println("Employee Object Serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
