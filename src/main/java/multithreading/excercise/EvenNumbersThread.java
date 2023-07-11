package multithreading.excercise;

public class EvenNumbersThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i<=10; i ++){
            if (i%2 == 0) {
                System.out.println("Even thread printing the number: "+i);
            }
        }
    }
}
