package concurrent_collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
        OrderConsumer orderConsumer = new OrderConsumer(queue);
        OrderProducer orderProducer = new OrderProducer(queue);

        new Thread(orderConsumer).start();
        new Thread(orderProducer).start();
    }
}
