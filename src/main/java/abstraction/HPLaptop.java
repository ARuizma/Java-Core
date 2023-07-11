package abstraction;

public abstract class HPLaptop implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("HP scroll");
    }
}
