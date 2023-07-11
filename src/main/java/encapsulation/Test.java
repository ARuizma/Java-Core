package encapsulation;

public class Test {

    public static void main(String[] args) {
        Patient p = new Patient();
        p.setId(12345678);
        p.setName("John DOe");
        p.setSsn("58879579463126");

        System.out.println("Patient id is " + p.getId());
        System.out.println("Patient name is " + p.getName());
        System.out.println("Patient SSN is " + p.getSsn());
    }
}
