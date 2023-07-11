package multithreading.yield;

public class YieldDemo {

    public static void main(String[] args) {
        YieldMyThread t = new YieldMyThread();
        t.start();

        for(int i=1; i <=10; i++){
            System.out.println("Main thread");
        }
    }
}
