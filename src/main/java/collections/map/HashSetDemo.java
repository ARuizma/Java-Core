package collections.map;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        Random obj = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<=10;i++){
            int number = obj.nextInt(5);
            list.add(number);
        }
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
