package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:\\Users\\ARuizMarin\\Documents\\shoes.jpg");
            fos = new FileOutputStream("C:\\Users\\ARuizMarin\\Documents\\newshoes.jpg");
            int data;
            while ((data=fis.read())!= -1){
                fos.write(data);
                System.out.println();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
