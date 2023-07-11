package multithreading.threadgroups;

public class CustomThread extends Thread{

    CustomThread(ThreadGroup g, String name){
        super(g, name);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
