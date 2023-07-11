package collections.map;

import java.util.TreeMap;

public class NavigableMapAssignment {

    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();

        map.put("A", "Test");
        map.put("B", "Test2");
        map.put("C", "Test3");
        map.put("D", "Test4");
        map.put("E", "Test5");
        map.put("F", "Test6");

        System.out.println(map.floorKey("C"));
        System.out.println(map.lowerKey("B"));
        System.out.println(map.ceilingKey("E"));
        System.out.println(map.higherKey("D"));
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map.descendingMap());
    }
}
