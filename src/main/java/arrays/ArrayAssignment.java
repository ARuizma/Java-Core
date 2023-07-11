package arrays;

import java.util.Arrays;

public class ArrayAssignment {

    public static void main(String[] args) {

        String[] a = {"z","x","c","d"};
        String[] b = new String[a.length];

        for(int i = 0; i<a.length; i++){
            b[a.length-1-i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }

}
