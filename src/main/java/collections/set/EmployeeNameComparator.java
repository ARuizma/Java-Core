package collections.set;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeIdComparator> {


    @Override
    public int compare(EmployeeIdComparator o1, EmployeeIdComparator o2) {
        String s1 = o1.name;
        String s2 = o2.name;

        return s1.compareTo(s2);
    }
}
