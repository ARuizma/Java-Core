package multithreading.interthread;


public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        t.start();

        synchronized (t) {
            System.out.println("Main thread going to wait");
            t.wait();
            System.out.println("Main thread notified");
            System.out.println(t.total);
        }
    }
}
