package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    void readFile() throws FileNotFoundException {
        FileInputStream in = new FileInputStream("name");
    }
    public static void main(String[] args) {

        CheckedException ce = new CheckedException();
        try {
            ce.readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        }

    }
}
