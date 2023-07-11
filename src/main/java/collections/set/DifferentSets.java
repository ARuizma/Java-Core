package collections.set;

import java.util.*;

public class DifferentSets {
    public static void main(String[] args) {
        Random obj = new Random();

        HashSet<Integer> set  = new HashSet<>();

        LinkedHashSet<Integer> set2  = new LinkedHashSet<>();

        Set<Integer> set3 = new TreeSet<>();

        for (int i = 0; i <=5 ; i++) {
            int number = obj.nextInt(100);
            set3.add(number);
            System.out.println(number);
        }

        System.out.println(set3);
    }
}
