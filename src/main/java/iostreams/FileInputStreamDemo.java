package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args){
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\ARuizMarin\\Documents\\mytest.txt");
            System.out.println("File opened");

            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nFile Closed");
        }
    }
}
