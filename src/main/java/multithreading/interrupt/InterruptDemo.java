package multithreading.interrupt;

public class InterruptDemo {
    public static void main(String[] args) {
        InterruptMyThread im = new InterruptMyThread();
        im.start();

        im.interrupt();

        System.out.println("End of the method");
    }
}
