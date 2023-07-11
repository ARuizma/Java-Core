package multithreading.excercise;

public class DemoExcercise {



    public static void main(String[] args) {

        System.out.println("Starting the main thread");

        EvenNumbersThread et = new EvenNumbersThread();
        OddNumbersThread ot = new OddNumbersThread();

        et.start();
        ot.start();

    }
}
