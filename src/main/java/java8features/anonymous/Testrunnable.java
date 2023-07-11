package java8features.anonymous;

public class Testrunnable {

    public static void main(String[] args) {
//        Runnable r = new MyRunnableImpl();

        Thread t = new Thread(() ->
        {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println("child thread");
            }
        }
        );

        t.start();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Main thread");

        }
    }
}
