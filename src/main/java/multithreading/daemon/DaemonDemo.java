package multithreading.daemon;

public class DaemonDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());

        MyDaemonThread mdt = new MyDaemonThread();
        mdt.setDaemon(true);
        System.out.println(mdt.isDaemon());
        mdt.start();
    }
}
