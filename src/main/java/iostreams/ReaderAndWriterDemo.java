package iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("C:\\Users\\ARuizMarin\\Documents\\mytest.txt");
            fw = new FileWriter("C:\\Users\\ARuizMarin\\Documents\\mytest2.txt");

            int ch;

            while((ch = fr.read())!= -1) {
                fw.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
