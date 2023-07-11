package polymorphism;

public class DellLaptop implements WindowsLaptop{


    @Override
    public void start() {
        System.out.println("Inside Dell Laptop start");
    }

    @Override
    public void shutdown() {
        System.out.println("Inside Dell Laptop stop");
    }
}
