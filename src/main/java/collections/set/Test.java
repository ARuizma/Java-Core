package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        Set<EmployeeIdComparator> set = new TreeSet<>(new EmployeeNameComparator());
        set.add(new EmployeeIdComparator(100, "fhksdlf"));
        set.add(new EmployeeIdComparator(245, "gasdg"));
        set.add(new EmployeeIdComparator(53, "zaaaa"));

        for (EmployeeIdComparator employeeIdComparator : set) {
            System.out.println(employeeIdComparator.id);
            System.out.println(employeeIdComparator.name);
        }
    }
}
