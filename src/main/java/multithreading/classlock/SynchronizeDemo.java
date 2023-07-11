package multithreading.classlock;

public class SynchronizeDemo {

    public static void main(String[] args) {

        MyThread mt = new MyThread( "Steve");
        MyThread mt2 = new MyThread( "Mark");

        mt.start();
        mt2.start();
    }
}
