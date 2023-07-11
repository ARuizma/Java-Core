package multithreading.threadgroups;

public class ThreadGroupMethod {
    public static void main(String[] args) {
        ThreadGroup mtg = new ThreadGroup("MyThreadGroup");

        CustomThread thread1 = new CustomThread(mtg, "Thread1");
        CustomThread thread2 = new CustomThread(mtg, "Thread2");

        thread1.start();
        thread2.start();

        System.out.println(mtg.activeCount());

        mtg.list();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(mtg.activeCount());

        mtg.list();
    }
}
