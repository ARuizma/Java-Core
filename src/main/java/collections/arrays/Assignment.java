package collections.arrays;

import java.util.Arrays;
import java.util.List;

public class Assignment {

    public static void main(String[] args) {
        String[] s = {"V", "A", "Z", "P"};

        Arrays.sort(s);

        System.out.println(Arrays.binarySearch(s, "Z"));

        List<String> list = Arrays.asList(s);

        System.out.println(list);
    }
}
