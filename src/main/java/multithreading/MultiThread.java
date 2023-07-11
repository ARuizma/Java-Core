package multithreading;

public class MultiThread extends Thread{

    public static void main(String[] args) throws InterruptedException {

        MultiThread mt = new MultiThread();
        mt.setPriority(MIN_PRIORITY);
        mt.setName("mt");
        mt.start();

        MultiThread mt1 = new MultiThread();
        mt1.setPriority(MAX_PRIORITY);
        mt1.setName("mt1");
        mt1.start();


//        Thread ct = Thread.currentThread();
//        System.out.println("Thread name is "+ ct.getName());

//        for(int j = 1; j<=200; j++){
//            System.out.println("j: " + j + "\t");
//            Thread.sleep(1000);
//        }
    }

    public void run(){

        System.out.println("Thread name "+Thread.currentThread().getName());

//        Thread ct = Thread.currentThread();
//        ct.setName("Print 200 numbers");
//        System.out.println("Thread name is "+ ct.getName());


//        for(int i = 1; i<=200; i++){
//        System.out.println("i: " + i + "\t");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Child Thread Exiting");;
//            }
//        }
    }
}
