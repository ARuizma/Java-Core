package multithreading.excercise;

public class OddNumbersThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i<=10; i ++){
            if (i%2 != 0) {
                System.out.println("Odd thread printing the number: "+i);
            }
        }
    }
}
