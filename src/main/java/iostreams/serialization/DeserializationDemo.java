package iostreams.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("C:\\Users\\ARuizMarin\\Documents\\Emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();
        Employee emp = (Employee)obj;

        System.out.println("Employee id: "+ emp.id);
        System.out.println("Employee name: "+ emp.name);
        System.out.println("Employee salary: "+ emp.salary);
        System.out.println("Employee ssn: "+ emp.ssn);
    }
}
