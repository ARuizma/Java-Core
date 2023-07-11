package concurrent_collections;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

    private BlockingQueue<String> queue;

    public OrderProducer(BlockingQueue<String> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Dell");
            queue.put("Asus");
            queue.put("Pixel");
            queue.put("Redmi");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
