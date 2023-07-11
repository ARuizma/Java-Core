package multithreading.synchronization;

public class SynchronizeDemo {

    public static void main(String[] args) {
        DisplayMessage dm = new DisplayMessage();

        MyThread mt = new MyThread(dm, "Steve");
        MyThread mt2 = new MyThread(dm, "Mark");

        mt.start();
        mt2.start();
    }
}
