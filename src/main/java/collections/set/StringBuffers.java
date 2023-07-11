package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class StringBuffers {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new StringLengthComparator());
        
        set.add("abafawfawtc");
        set.add("xdaggasghasdghaf");
        set.add("rwwhhwehawet");
        set.add("hhawhas");

        for (String obj: set) {
            System.out.println(obj);
        }
    }
}
