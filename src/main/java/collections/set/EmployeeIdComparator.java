package collections.set;

public class EmployeeIdComparator implements Comparable<EmployeeIdComparator>{

    int id;
    String name;

    public EmployeeIdComparator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(EmployeeIdComparator o) {
        int id1 = this.id;
        int id2 = o.id;

        if (id1 < id2) {
            return -1;
        } else if (id1 > id2){
            return 1;
        }else{
            return 0;
        }

    }
}
