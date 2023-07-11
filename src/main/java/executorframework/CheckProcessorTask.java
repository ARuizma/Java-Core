package executorframework;

public class CheckProcessorTask implements Runnable{

    String name;

    CheckProcessorTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " check Processor has begun processing the check"+ Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " check Processor has completed processing the check"+ Thread.currentThread().getName());
    }
}
