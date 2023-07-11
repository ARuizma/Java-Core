package multithreading.blocks;

public class DisplayMessage {

    public void sayHello(String name){

        System.out.println("I am " + name +" and I am waiting for my turn");

        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("I am "+name+" and I got inside at least");
                System.out.println("How are you " + name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
