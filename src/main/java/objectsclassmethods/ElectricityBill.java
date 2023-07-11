package objectsclassmethods;

public class ElectricityBill {

    int meterNo;
    String name;
    String address;


    public int getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(int meterNo) {
        this.meterNo = meterNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
       return "The meter value is "+this.meterNo+" for house address "+ this.address+" whose propietary is "+this.name;
    }

    @Override
    public boolean equals(Object obj) {
        ElectricityBill eb = (ElectricityBill) obj;
        return eb.getMeterNo() == this.meterNo;
    }

    @Override
    public int hashCode() {
        return this.meterNo;
    }

}
