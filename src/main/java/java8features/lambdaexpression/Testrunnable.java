package java8features.lambdaexpression;

public class Testrunnable {

    public static void main(String[] args) {
//        Runnable r = new MyRunnableImpl();


        Runnable r = () -> {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println("Child thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Main thread");

        }
    }
}
