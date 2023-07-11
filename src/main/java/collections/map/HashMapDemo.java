package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("John", 24);
        map.put("asdf", 34);
        map.put("wfw", 234);

        Set<String> keyset = map.keySet();
        System.out.println(keyset);

        Collection<Integer> values = map.values();
        System.out.println(values);

        for (String s : keyset) {
            System.out.println(s + map.get(s));

        }

    }
}
