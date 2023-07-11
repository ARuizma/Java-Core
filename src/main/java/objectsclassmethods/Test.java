package objectsclassmethods;

public class Test {
    public static void main(String[] args) {
        ElectricityBill eb1 = new ElectricityBill();
        ElectricityBill eb2 = new ElectricityBill();

        eb1.setAddress("Rosfield 23");
        eb1.setName("Clive");
        eb1.setMeterNo(5789);

        eb2.setAddress("Rosari 45");
        eb2.setName("Jill");
        eb2.setMeterNo(579);

        System.out.println(eb1);
        System.out.println(eb2.hashCode());
        System.out.println(eb1.equals(eb2));
    }
}
